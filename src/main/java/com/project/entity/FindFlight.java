package com.project.entity;

import javax.persistence.Entity;


public class FindFlight {
    private String cityFrom;
    private String cityTo;
    private int day;
    private int month;
    private int year;

    public FindFlight() {
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

    public FindFlight(String cityFrom, String cityTo, int day, int month, int year) {
        this.cityFrom = cityFrom;
        this.cityTo = cityTo;
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
