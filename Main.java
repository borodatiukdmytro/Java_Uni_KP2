import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", "Camry", 2019, "Black", 25000.0, "ABC123"));
        cars.add(new Car(2, "Honda", "Civic", 2018, "White", 22000.0, "XYZ789"));
        cars.add(new Car(3, "Ford", "Focus", 2017, "Red", 18000.0, "LMN456"));
        cars.add(new Car(4, "Toyota", "Corolla", 2016, "Blue", 19000.0, "PQR567"));
        cars.add(new Car(5, "Honda", "Accord", 2020, "Silver", 27000.0, "DEF321"));
        cars.add(new Car(6, "Seat", "Leon", 2019, "Black", 85000.0, "KA8810CC"));
        cars.add(new Car(7, "Toyota", "Camry", 2022, "Green", 50000.0, "ABC234"));

        List<Car> toyotaCars = getToyotaCars(cars);
        displayCars(toyotaCars, "Toyota cars:");

        List<Car> civicCars = getExpensiveCarsByModelAndAge(cars, "Civic", 3);
        displayCars(civicCars, "Civic cars exploited for more than 3 years:");

        List<Car> carsInYearAndPrice = getCarsManufacturedInYearAndPrice(cars, 2019, 22000.0);
        displayCars(carsInYearAndPrice, "Cars manufactured in 2019 with price higher than 22000.0:");

        List<Car> filteredCars = getCarsByModelBrandAndExcludedColor(cars, "Camry", "Toyota", "Black");
        displayCars(filteredCars, "Camry cars of Toyota brand, except those colored Black:");
    }

    // Метод для отримання автомобілів марки "Toyota"
    public static List<Car> getToyotaCars(List<Car> cars) {
        List<Car> toyotaCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equals("Toyota")) {
                toyotaCars.add(car);
            }
        }
        return toyotaCars;
    }

    // Метод для отримання автомобілів заданої моделі, які експлуатуються більше n років
    public static List<Car> getExpensiveCarsByModelAndAge(List<Car> cars, String targetModel, int n) {
        List<Car> resultCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(targetModel) && (2023 - car.getYear() > n)) {
                resultCars.add(car);
            }
        }
        return resultCars;
    }

    // Метод для отримання автомобілів заданого року випуску, ціна яких більша за вказану
    public static List<Car> getCarsManufacturedInYearAndPrice(List<Car> cars, int targetYear, double targetPrice) {
        List<Car> resultCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == targetYear && car.getPrice() > targetPrice) {
                resultCars.add(car);
            }
        }
        return resultCars;
    }

    // Метод для отримання автомобілів заданої моделі і марки, будь-якого кольору, окрім вказаного
    public static List<Car> getCarsByModelBrandAndExcludedColor(List<Car> cars, String targetModel, String targetBrand, String excludedColor) {
        List<Car> resultCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getModel().equals(targetModel) && car.getBrand().equals(targetBrand) && !car.getColor().equals(excludedColor)) {
                resultCars.add(car);
            }
        }
        return resultCars;
    }

    public static void displayCars(List<Car> cars, String message) {
        System.out.println(message);
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
