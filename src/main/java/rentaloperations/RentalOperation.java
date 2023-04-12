package rentaloperations;

import cars.Car;
import customer.Customer;
import rental.Rental;

import java.util.List;

public interface RentalOperation {
    void addCustomer(Customer customer);

    void addCar(Car car);

    boolean searchCar(Car car);

    Rental rentCar(Car car, Customer customer, int duration);

    List<Rental> viewHistory(Customer customer);

    void returnCar(Car car);
}
