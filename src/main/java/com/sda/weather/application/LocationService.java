package com.sda.weather.application;

public class LocationService {

    private final LocationRepository locationRepository = new LocationRepository();

    public Location addNewLocation(final String cityName, final Double latitude, final Double longitude, final String region, final String country) {
        if (cityName == null || cityName.isEmpty()) {
            throw new RuntimeException("Miasto nie może być puste");
        }

        Location location = new Location(cityName, region, country, latitude, longitude);

        // todo: use the LocationRepository to save new location

        return location;    // todo: return new location
    }
}
