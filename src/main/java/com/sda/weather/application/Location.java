package com.sda.weather.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private String cityName;
    private String regionName;
    private String countryName;
    private double latitude;
    private double longitude;
}
