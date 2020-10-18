package com.sda.weather.client;

import com.sda.weather.application.LocationController;

import java.util.Scanner;

public class Client {

    private final LocationController locationController = new LocationController();

    public void runClientInterface() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w programie WeatherApp");
        while (true) {
            System.out.println("Wybierz opcję, co chcesz zrobić?");
            System.out.println("1. Wprowadź swoje dane");
            System.out.println("2. Wyświetl dane meteorologiczne w swoim regionie");
            System.out.println("0. Zamknij aplikację");
            int response = scanner.nextInt();
            switch (response) {
                case 1:
                    addPersonalData();
                    break;
                case 2:
                    readWeather();
                    break;
                case 0:
                    System.out.println("Twoja aplikacja jest zamknięta");
                    return;
            }
        }
    }

    private void addPersonalData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj miasto");
        String cityName = scanner.nextLine();
        System.out.println("Podaj region");
        String regionName = scanner.nextLine();
        System.out.println("Podaj kraj");
        String countryName = scanner.nextLine();
        System.out.println("Podaj szerokość geograficzną -180 W, 180 E");
        double latitude = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Podaj długość geograficzną -90 S, 90 N");
        double longitude = scanner.nextDouble();
        scanner.nextLine();

        String response = locationController.addPersonalData(cityName, regionName, countryName, latitude, longitude);

        System.out.println("Dodano lokalizację: " + response);
    }
    private void addNewLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nazwa miasta:");
        String name = scanner.nextLine();
        System.out.print("szerokość geog: ");
        double latitude = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Długość geog: ");
        double longitude = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Region: ");
        String region = scanner.nextLine();
        System.out.print("Kraj: ");
        String country = scanner.nextLine();

        String response = locationController.addPersonalData(name, latitude, longitude, region, country);
        System.out.println("Dodano nową lokalizację" + response);

    }
    private void readWeather() {
//        String response = entryController.readWeather();
//        System.out.println("Twoja pogoda: " + response);
    }
}


