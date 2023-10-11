import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створення масиву об'єктів Car
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry", 2019, "Black", 25000.0, "ABC123"));
        cars.add(new Car(2, "Honda", "Civic", 2018, "White", 22000.0, "XYZ789"));
        cars.add(new Car(3, "Ford", "Focus", 2017, "Red", 18000.0, "LMN456"));
        cars.add(new Car(4, "Toyota", "Corolla", 2016, "Blue", 19000.0, "PQR567"));
        cars.add(new Car(5, "Honda", "Accord", 2020, "Silver", 27000.0, "DEF321"));
        cars.add(new Car(6, "Seat", "Leon", 2019, "Black", 85000.0, "KA8810CC"));
        cars.add(new Car(7, "Toyota", "Camry", 2022, "Green", 50000.0, "ABC234"));

        // Вивести список автомобілів заданої марки
        String targetBrand = "Toyota";
        System.out.println(targetBrand + " cars:");
        for (Car car : cars) {
            if (car.getBrand().equals(targetBrand)) {
                car.printCar();
            }
        }

        // Вивести список автомобілів заданої моделі, котрі експлуатуються більше n років
        int n = 3; // Заданий вік
        String targetModel = "Civic";
        System.out.println("\n" + targetModel + " cars, exploited for " + n + " years:");
        for (Car car : cars) {
            if (car.getModel().equals(targetModel) && (2023 - car.getYear() > n)) {
                car.printCar();
            }
        }

        // Вивести список автомобілів заданого року випуску, ціна котрих більша за вказану
        int targetYear = 2019;
        double targetPrice = 22000.0;
        System.out.println("\nCars manufactured in " + targetYear + ", more expensive than " + targetPrice + ":");
        for (Car car : cars) {
            if (car.getYear() == targetYear && car.getPrice() > targetPrice) {
                car.printCar();
            }
        }

        // Вивести список автомобілів заданої моделі і марки, будь-якого кольору, окрім вказаного
        String excludedColor = "Black";
        String targetModel2 = "Camry";
        String targetBrand2 = "Toyota";
        System.out.println("\nCar model " + targetModel2 + " and brand " + targetBrand2 +
                ", except for coloured in " + excludedColor + ":");
        for (Car car : cars) {
            if (car.getModel().equals(targetModel2) && car.getBrand().equals(targetBrand2) && !car.getColor().equals(excludedColor)) {
                car.printCar();
            }
        }
    }
}
