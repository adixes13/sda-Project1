package com.sda.weather.application;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LocationServiceTest {

    private LocationService locationService = new LocationService();

    @Test
    void addNewLocation_shouldReturnNewLocation() {
        // when
        Location result = locationService.addNewLocation("city", 5.0, 10.0, "region", "country");

        // then
        assertEquals(result.getCityName(), "city");
        assertEquals(result.getCountryName(), "country");
        assertEquals(result.getRegionName(), "region");
        assertEquals(result.getLatitude(), 5.0);
        assertEquals(result.getLongitude(), 10.0);
    }

    @Test
    void addNewLocation_whenRegionIsEmpty_shouldReturnNewLocation() {
        // when
        Location result = locationService.addNewLocation("city", 5.0, 10.0, "", "country");

        // then
        assertEquals(result.getCityName(), "city");
        assertEquals(result.getCountryName(), "country");
        assertEquals(result.getRegionName(), "");
        assertEquals(result.getLatitude(), 5.0);
        assertEquals(result.getLongitude(), 10.0);
    }

    @Test
    void addNewLocation_whenCityIsEmpty_shouldThrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation(" ", 5.0, 10.0, "region", "country"));
    }

    @Test
    void addNewLocation_whenCountryIsEmpty_shouldThrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation("city", 5.0, 10.0, "region", " "));

        // todo: isEmpty vs isBlank
        /*
            isEmpty("") -> true
            isBlank("") -> true

            isEmpty(" ") -> false
            isBlank(" ") -> true
        */
    }

    @Test
    void addNewLocation_whenLongitudeUsBelow180Negative_shouldThrowException() {
        // when
        assertThrows(Exception.class, () -> locationService.addNewLocation("city", 5.0, -181.0, "region", "country"));
    }
}
