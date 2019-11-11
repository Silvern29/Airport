public class Passenger {
    private int custID;
    private String firstName;
    private String lastName;
    private String street;
    private String apartment;
    private String zip;
    private String city;
    private String tel;
    private String email;
    private int passportId;
    private String boardingPass;

    public Passenger(int custID, String firstName, String lastName, String street, String apartment, String zip, String city, String tel, String email, int passportId, String boardingPass) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.apartment = apartment;
        this.zip = zip;
        this.city = city;
        this.tel = tel;
        this.email = email;
        this.passportId = passportId;
        this.boardingPass = boardingPass;
    }

    public int getCustID() {
        return custID;
    }

    public void setCustID(int custID) {
        this.custID = custID;
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

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public String getBoardingPass() {
        return boardingPass;
    }

    public void setBoardingPass(String boardingPass) {
        this.boardingPass = boardingPass;
    }
}
