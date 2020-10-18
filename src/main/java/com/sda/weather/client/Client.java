package com.sda.weather.client;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
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

    private static void addPersonalData() {
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


        System.out.println();

    }

    private static void readWeather() {
        String response = entryController.readWeather();
        System.out.println("Twoja pogoda: " + response);

    }


}


