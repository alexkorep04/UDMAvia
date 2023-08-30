package com.project.entity;

import javax.persistence.*;

@Entity
@Table(name = "Reservations")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "passport")
    private String passport;
    @Column(name = "email")
    private String email;
    @Column(name = "is_luggage")
    private boolean is_luggage;
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flights flight;
    public Reservation() {
    }
    public Reservation(int id) {
        this.id = id;
    }

    public Reservation(int id, String name, String surname, String passport, String email, boolean is_luggage, Flights flight) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.email = email;
        this.is_luggage = is_luggage;
        this.flight = flight;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIs_luggage() {
        return is_luggage;
    }

    public void setIs_luggage(boolean is_luggage) {
        this.is_luggage = is_luggage;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", passport='" + passport + '\'' +
                ", flight=" + flight +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }
}
