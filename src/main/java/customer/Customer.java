package customer;

import rental.Rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private String contactInfo;
    private final List<Rental> history = new ArrayList<>();

    public Customer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Rental> getHistory() {
        return history;
    }

    public void addHistory(Rental rental) {
        history.add(rental);
    }
}
