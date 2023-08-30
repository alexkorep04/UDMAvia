package com.project.controllers;

import com.project.dao.FlightDAO;
import com.project.entity.FindFlight;
import com.project.entity.Flights;
import com.project.entity.Reservation;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private FlightDAO flightDAO;

    @RequestMapping("/UDMAvia")
    public String showMainPage()
    {
        return "main-page";
    }
    @RequestMapping("/UDMAvia/book")
    public String bookTicket(Model model)
    {
        FindFlight findFlight = new FindFlight();
        model.addAttribute("findFlight", findFlight);
        return "booking";
    }
    @RequestMapping("/UDMAvia/book/showAllFlights")
    public String showAllFlightsByCityAndDate(Model model, @Valid @ModelAttribute("findFlight")  FindFlight findFlight, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "booking";
        }
        else
        {
            List<Flights> allList= flightDAO.findFlights(findFlight);
            if(allList.isEmpty())
            {
                return "all-flights-by-parameters-empty";
            }
            model.addAttribute("allFlights", allList);
            return  "all-flights-by-parameters";
        }
    }
    @RequestMapping("/UDMAvia/book/buy")
    public String buyTicket(@RequestParam("flightId") int id, Model model)
    {
        Reservation reservation = new Reservation();
        Flights flight = flightDAO.findFlightById(id);
        reservation.setFlight(flight);
        model.addAttribute("reservation", reservation);
        return "buy-ticket";
    }
    @RequestMapping("/UDMAvia/book/afterBooking")
    public String afterBooking(@Valid @ModelAttribute("reservation") Reservation reservation, BindingResult bindingResult)
    {
        if(bindingResult.hasErrors())
        {
            return "buy-ticket";
        }
        else
        {
            flightDAO.saveReservation(reservation);
            return "after-booking";
        }
    }
}
