package rental;

import cars.Car;
import customer.Customer;

public record Rental(Customer customer, Car car, int duration) {
}
