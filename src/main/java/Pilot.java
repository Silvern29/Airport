public class Pilot extends Crew {
    private Pilot coPilot;

    public Pilot(String firstName, String lastName, String street, String apartmentNumber, String city, String zip, String tel, String email, String pantSize, String shirtSize) {
        super(firstName, lastName, street, apartmentNumber, city, zip, tel, email, pantSize, shirtSize);
    }

    public Pilot getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(Pilot coPilot) {
        this.coPilot = coPilot;
    }
}
