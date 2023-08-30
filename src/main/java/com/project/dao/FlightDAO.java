package com.project.dao;

import com.mysql.cj.Query;
import com.project.entity.FindFlight;
import com.project.entity.Flights;
import com.project.entity.Reservation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

@Repository
public class FlightDAO {
    public List<Flights> findFlights(FindFlight findFlight)
    {
        String cityFrom = findFlight.getCityFrom();
        String cityTo = findFlight.getCityTo();
        int day = findFlight.getDay();
        int month = findFlight.getMonth();
        int year = findFlight.getYear();
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Flights.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Flights> allFlightList = session.createQuery("from Flights", Flights.class).getResultList();
        List<Flights> flightList = new ArrayList<>();
        for(Flights flight: allFlightList)
        {
            if(flight.getCityFrom().equals(cityFrom) && flight.getCityTo().equals(cityTo) && flight.getDay() == day && flight.getMonth() == month && flight.getYear() == year && flight.getAmount() > 0)
            {
                flightList.add(flight);
            }
        }
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return flightList;
    }
    public Flights findFlightById(int id)
    {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Flights.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Flights flight = session.get(Flights.class, id);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        return flight;
    }
    public void saveReservation(Reservation reservation)
    {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Reservation.class).addAnnotatedClass(Flights.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Flights flight = reservation.getFlight();
        decreaseAmountOfPlaces(flight);
        session.save(reservation);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
    public void decreaseAmountOfPlaces(Flights flights)
    {
        SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Flights.class).buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        int am = flights.getAmount();
        flights.setAmount(am-1);
        session.saveOrUpdate(flights);
        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
