import java.util.LinkedList;
import java.util.List;

public class Employee {
    private int compID;
    private String crewStatus;
    private String firstName;
    private String lastName;
    private String street;
    private String apartment;
    private String zip;
    private String city;
    private String tel;
    private String email;
    private List<Flight> flightList = new LinkedList<Flight>();
    private String pantSize;
    private String shirtSize;

    public Employee(int compID, String crewStatus, String firstName, String lastName, String street, String apartment, String zip, String city, String tel, String email, String pantSize, String shirtSize) {
        this.compID = compID;
        this.crewStatus = crewStatus;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.apartment = apartment;
        this.zip = zip;
        this.city = city;
        this.tel = tel;
        this.email = email;
        this.pantSize = pantSize;
        this.shirtSize = shirtSize;
    }

    public int getCompID() {
        return compID;
    }

    public void setCompID(int compID) {
        this.compID = compID;
    }

    public String getCrewStatus() {
        return crewStatus;
    }

    public void setCrewStatus(String crewStatus) {
        this.crewStatus = crewStatus;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Employee{" +
                "compID=" + compID +
                ", crewStatus='" + crewStatus + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", apartment='" + apartment + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", flightList=" + flightList +
                ", pantSize='" + pantSize + '\'' +
                ", shirtSize='" + shirtSize + '\'' +
                '}';
    }
}
