package com.project.entity;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


public class FindFlight {
    @Size(min = 2, message = "city name length is not so small")
    private String cityFrom;
    @Size(min = 2, message = "city name length is not so small")
    private String cityTo;
    @Min(value = 1, message = "day is between 1 and 31")
    @Max(value = 31, message = "day is between 1 and 31")
    private int day;
    @Min(value = 1, message = "month is between 1 and 12")
    @Max(value = 12, message = "month is between 1 and 12")
    private int month;
    @Min(value = 2023, message = "year is more or equals 2023")
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
