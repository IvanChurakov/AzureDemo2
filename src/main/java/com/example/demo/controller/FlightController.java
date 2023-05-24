package com.example.demo.controller;

import com.example.demo.model.Flight;
import com.example.demo.service.FlightService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public ResponseEntity getAllFlights() {
        return ResponseEntity.ok(flightService.getAllFlights());
    }

    @GetMapping("/flights/{flightNumber}")
    public ResponseEntity getFlightById(@PathVariable String flightNumber) {
        return ResponseEntity.ok(flightService.getAllFlightsByFlightNumber(flightNumber));
    }

    @PostMapping(value = "/flights/add", produces = "application/json", consumes = "application/json" )
    public ResponseEntity createFlight(@RequestBody Flight flight) {
        return ResponseEntity.ok(flightService.createFlight(flight));
    }
}
