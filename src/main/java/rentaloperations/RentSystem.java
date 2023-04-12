package rentaloperations;

import cars.Car;
import customer.Customer;
import rental.Rental;

import java.util.LinkedList;
import java.util.List;

public class RentSystem implements RentalOperation {
    private final List<Customer> customers = new LinkedList<>();
    private final List<Car> cars = new LinkedList<>();

    @Override
    public void addCustomer(Customer customer) {
        if (!isValidCustomer(customer)) {
            customers.add(customer);
        }
    }

    private boolean isValidCustomer(Customer customer) {
        return customers.contains(customer);
    }

    @Override
    public void addCar(Car car) {
        if (!isValidCar(car)) {
            cars.add(car);
        }
    }

    private boolean isValidCar(Car car) {
        return cars.contains(car);
    }

    @Override
    public boolean searchCar(Car car) {
        return isValidCar(car);
    }

    private void validateCar(Car car) {
        if (!isValidCar(car)) {
            throw new IllegalArgumentException("No such car");
        }
    }

    @Override
    public Rental rentCar(Car car, Customer customer, int duration) {
        validateCar(car);
        validateCustomer(customer);
        Rental rental = new Rental(customer, car, duration);
        cars.remove(car);
        customer.addHistory(rental);
        return rental;
    }

    private void validateCustomer(Customer customer) {
        if (!isValidCustomer(customer)) {
            throw new IllegalArgumentException("No such customer");
        }
    }

    @Override
    public List<Rental> viewHistory(Customer customer) {
        validateCustomer(customer);
        return customer.getHistory();
    }

    @Override
    public void returnCar(Car car) {
        addCar(car);
    }
}
