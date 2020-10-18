package com.sda.weather.application;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LocationController {
    private final LocationService locationService = new LocationService();
    private final ObjectMapper objectMapper = new ObjectMapper();

    public String addPersonalData(String cityName, String regionName, String countryName, double latitude, double longitude) {
        // todo: use LocationService to save new data and use returned Location response

        Location location = locationService.addNewLocation(cityName, latitude, longitude, countryName, regionName);

        try {
            return objectMapper.writeValueAsString(location);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Nie można serializować danych"); // todo: create your own Exception eg. InternalServerException -> 500
        }
    }
}
