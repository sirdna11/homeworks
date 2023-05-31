package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);


        Map<String, Set<String>> flights = new HashMap<>();
       
        Set<String> cities = new HashSet<>();


        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                String[] parts = line.split("->");
                String from = parts[0].trim();
                String to = parts[1].trim();

                flights.putIfAbsent(from, new HashSet<>());
                flights.get(from).add(to);
                cities.add(from);
                cities.add(to);
            }
        }


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What would you like to do:");
            System.out.println("To display list of the cities press 1");
            System.out.println("To exit program press #");

            String input = scanner.nextLine().trim();
            if (input.equals("1")) {
                System.out.println("Cities: " + cities);
                System.out.println("To select a city from which you would like to start press its name");
                String startCity = scanner.nextLine().trim();

                if (!cities.contains(startCity)) {
                    System.out.println("City not found");
                    continue;
                }

                List<String> route = new ArrayList<>();
                route.add(startCity);

                while (true) {
                    String currentCity = route.get(route.size() - 1);
                    Set<String> destinations = flights.get(currentCity);

                    System.out.println("From " + currentCity + " you can fly directly to: " + destinations);
                    System.out.println("Where do you want to go?");

                    String nextCity = scanner.nextLine().trim();

                    if (!destinations.contains(nextCity)) {
                        System.out.println("You can't get to that city by a direct flight.");
                        continue;
                    }

                    route.add(nextCity);

                    if (nextCity.equals(startCity)) {
                        break;
                    }
                }

                System.out.println("The round-trip route you've chosen is: " + route);
            } else if (input.equals("#")) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}
