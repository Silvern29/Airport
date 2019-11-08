public class Passenger extends Person {
    protected int passportId;
    protected String boardingPass;

    public Passenger(String firstName, String lastName, String street, String apartmentNumber, String city, String zip, String tel, String email, int passportId, String boardingPass) {
        super(firstName, lastName, street, apartmentNumber, city, zip, tel, email);
        this.passportId = passportId;
        this.boardingPass = boardingPass;
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
