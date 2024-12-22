import java.util.ArrayList;
import java.util.Scanner;

public class RickshawService {
    private Scanner scan = new Scanner(System.in);
    private String[][] destinations = {{"Christiania", "Operaen", "Havnebad Islands Brygge"}, {"Tivoli", "Rådhuspladsen", "Christiansborg"}, {"Amalienborg", "Strøget", "Nyhavn"}};
    private ArrayList<Driver> drivers = new ArrayList<>();

    public void createDriver(String name, int[] destinationCoverage) {
        Driver driver = new Driver(name, destinationCoverage);
        drivers.add(driver);

    }

    public void bookDriver() {
        System.out.println("Pick a destination");
        int counter = 1;
        for (int i = 0; i < destinations.length; i++) {
            for (int j = 0; j < destinations[i].length; j++) {
                System.out.println(counter + ". " + destinations[i][j]);
                counter++;
            }
        }
        int choice = scan.nextInt();

        int districtIndex = (choice - 1) / 3; // Beregner distriktsindeks
        int destinationIndex = (choice - 1) % 3; // Beregner destinationsindeks

        if (choice >= 1 && choice <= 9) {
            System.out.println("You have chosen " + destinations[districtIndex][destinationIndex]);
        } else {
            System.out.println("Invalid input, try again");
            bookDriver();
        }

        String checkIfDriverIsAvailable = findDriver(districtIndex + 1);
        System.out.println(checkIfDriverIsAvailable);
    }


    private String findDriver(int districtNumber) {
        for (Driver d : drivers) {
            for(int i = 0; i < d.districtCoverage.length; i++) {
                if (d.districtCoverage[i] == districtNumber) {
                    return "Found an available driver," + " Name: " + d.getName();
                }
            }
        }
        return "No driver found with this district number";
    }

}