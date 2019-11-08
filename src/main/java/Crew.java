import java.util.LinkedList;
import java.util.List;

public class Crew extends Person {
    protected List<Flight> flightList = new LinkedList<Flight>();
    protected String pantSize;
    protected String shirtSize;
    protected int employeeNumber;

    public Crew(String firstName, String lastName, String street, String apartmentNumber, String city, String zip, String tel, String email, String pantSize, String shirtSize) {
        super(firstName, lastName, street, apartmentNumber, city, zip, tel, email);
        this.pantSize = pantSize;
        this.shirtSize = shirtSize;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public String getPantSize() {
        return pantSize;
    }

    public void setPantSize(String pantSize) {
        this.pantSize = pantSize;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }
}
