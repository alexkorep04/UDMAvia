package com.project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Flights")
public class Flights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private int id;
    @Column(name = "flight_name")
    private String flight_name;
    @Column(name = "city_from")
    private String cityFrom;
    @Column(name = "city_to")
    private String cityTo;
    @Column(name = "day")
    private int day;
    @Column(name = "month")
    private int month;
    @Column(name = "year")
    private int year;
    @Column(name = "amount_of_passengers")
    private int amount;
    @Column(name = "plane")
    private int plane;
    @Column(name = "hours")
    private int hours;
    @Column(name = "minutes")
    private int minutes;
    @Column(name = "min_price")
    private int price;

    public Flights() {
    }

    public Flights(int id, String flight_name, String cityFrom, String cityTo, int day, int month, int year, int amount, int plane, int hours, int minutes, int price) {
        this.id = id;
        this.flight_name = flight_name;
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.day = day;
        this.month = month;
        this.year = year;
        this.amount = amount;
        this.plane = plane;
        this.hours = hours;
        this.minutes = minutes;
        this.price = price;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", flight_name='" + flight_name + '\'' +
                ", cityFrom='" + cityFrom + '\'' +
                ", cityTo='" + cityTo + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", amount=" + amount +
                ", plane=" + plane +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlight_name() {
        return flight_name;
    }

    public void setFlight_name(String flight_name) {
        this.flight_name = flight_name;
    }

    public String getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(String cityFrom) {
        this.cityFrom = cityFrom;
    }

    public String getCityTo() {
        return cityTo;
    }

    public void setCityTo(String cityTo) {
        this.cityTo = cityTo;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPlane() {
        return plane;
    }

    public void setPlane(int plane) {
        this.plane = plane;
    }
}
