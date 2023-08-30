package com.project.entity;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


public class FindFlight {
    private String cityFrom;
    private String cityTo;
    @Min(value = 1, message = "day is between 1 and 31")
    @Max(value = 31, message = "day is between 1 and 31")
    private int day;
    @Min(value = 1, message = "month is between 1 and 12")
    @Max(value = 12, message = "month is between 1 and 12")
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
