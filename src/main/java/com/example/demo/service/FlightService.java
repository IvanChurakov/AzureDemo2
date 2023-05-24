package com.example.demo.service;

import com.example.demo.model.Flight;
import com.example.demo.repository.IFlightRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FlightService {
    private final IFlightRepository flightRepository;

    public FlightService(IFlightRepository flightRepository)
    {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights()
    {
        List<Flight> flights = flightRepository.findAll();
        Collections.sort(flights);
        return flights;
    }

    public List<Flight> getAllFlightsByFlightNumber(String flightNumber)
    {
        return flightRepository.findByFlightNumber(flightNumber);
    }

    public Flight createFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
