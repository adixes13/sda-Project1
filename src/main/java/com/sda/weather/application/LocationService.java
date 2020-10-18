package com.sda.weather.application;

public class LocationService {
    public Location addNewLocation(final String cityName, final Double latitude, final Double longitude, final String region, final String country) {
        if (cityName == null || cityName.isEmpty()) {
            throw new RuntimeException("Miasto nie może być puste");
        }

        Location location = new Location(cityName, latitude, longitude, region, country);

    }
}