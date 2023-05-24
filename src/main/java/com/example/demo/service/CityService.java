package com.example.demo.service;

import com.example.demo.model.City;
import com.example.demo.modelDTO.CityDTO;
import com.example.demo.repository.ICityRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class CityService {
    private ICityRepository cityRepository;

    public CityService(ICityRepository cityRepository)
    {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities()
    {
        List<City> cities = cityRepository.findAll();
        Collections.sort(cities);
        return cities;
    }

    public CityDTO createCity(CityDTO cityDTO) {

        City city = new City(cityDTO.getDisplayName());

        City cityResult = cityRepository.save(city);

        return new CityDTO(cityResult.getDisplayName());
    }
}
