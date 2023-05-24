package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "flight")
public class Flight implements Comparable<Flight> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flight_id")
    private UUID flightId;
    @Column(name = "departure_city_id")
    private UUID departureCityId;
    @Column(name = "arrival_city_id")
    private UUID arrivalCityId;
    @Column(name = "departure_time")
    private Date departureTime;
    @Column(name = "arrival_time")
    private Date arrivalTime;
    @Column(name = "flight_number")
    private String flightNumber;
    @Column(name = "price")
    private Double price;
    @Column(name = "created_at")
    private Date createdAt;

    public UUID getFlightId() {
        return flightId;
    }

    public void setFlightId(UUID flightId) {
        this.flightId = flightId;
    }

    public UUID getDepartureCityId() {
        return departureCityId;
    }

    public void setDepartureCityId(UUID departureCityId) {
        this.departureCityId = departureCityId;
    }

    public UUID getArrivalCityId() {
        return arrivalCityId;
    }

    public void setArrivalCityId(UUID arrivalCityId) {
        this.arrivalCityId = arrivalCityId;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public int compareTo(Flight otherFlight) {
        return arrivalTime.compareTo(otherFlight.arrivalTime);
    }
}