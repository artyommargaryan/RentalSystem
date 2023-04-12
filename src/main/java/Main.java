import cars.Car;
import cars.EconomyCar;
import cars.LuxuryCar;
import customer.Customer;
import rentaloperations.RentSystem;
import rentaloperations.RentalOperation;

public class Main {
    public static void main(String[] args) {
        RentalOperation rentalOperation = new RentSystem();

        Customer customer1 = new Customer("name1", "contInf1");
        Customer customer2 = new Customer("name2", "contInf2");

        Car car1 = createLuxuryCar("make1", "model1", 1000);
        Car car2 = createLuxuryCar("make2", "model2", 1500);
        Car car3 = createEconomyCar("make3", "model3", 2000);
        Car car4 = createEconomyCar("make4", "model4", 2500);

        rentalOperation.addCar(car1);
        rentalOperation.addCar(car2);
        rentalOperation.addCar(car3);
        rentalOperation.addCar(car4);

        rentalOperation.addCustomer(customer1);
        rentalOperation.addCustomer(customer2);

        if (rentalOperation.searchCar(car1)) {
            rentalOperation.rentCar(car1, customer1, 10);
        }

        rentalOperation.returnCar(car1);
    }

    private static Car createEconomyCar(String make, String model, int i) {
        return new EconomyCar(make, model, i);
    }

    private static Car createLuxuryCar(String make, String model, int i) {
        return new LuxuryCar(make, model, i);
    }
}
