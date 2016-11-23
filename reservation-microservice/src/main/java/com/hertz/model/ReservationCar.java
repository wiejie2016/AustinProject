package com.hertz.model;

import java.util.Date;

/**
 * Created by Administrator on 11/23/2016.
 */
public class ReservationCar {

    private long conformationNumber;
    private String lastName;
    private String location;
    private Date startDate;
    private Date endDate;
    private String carType;

    public long getConformationNumber() {
        return conformationNumber;
    }

    public void setConformationNumber(long conformationNumber) {
        this.conformationNumber = conformationNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "ReservationCar{" +
                "conformationNumber=" + conformationNumber +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", carType='" + carType + '\'' +
                '}';
    }
}
