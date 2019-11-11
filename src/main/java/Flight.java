import java.sql.Date;

public class Flight {
    private int flightNumber;
    private Date departure;
    private int flightDuration;
    private int departureGate;
    private int arrivalGate;
    private Employee pilot;
    private Employee coPilot;

    public Flight(int flightNumber, Date departure, int flightDuration, int departureGate, int arrivalGate, Employee pilot, Employee coPilot) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.flightDuration = flightDuration;
        this.departureGate = departureGate;
        this.arrivalGate = arrivalGate;
        this.pilot = pilot;
        this.coPilot = coPilot;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    public int getDepartureGate() {
        return departureGate;
    }

    public void setDepartureGate(int departureGate) {
        this.departureGate = departureGate;
    }

    public int getArrivalGate() {
        return arrivalGate;
    }

    public void setArrivalGate(int arrivalGate) {
        this.arrivalGate = arrivalGate;
    }

    public Employee getPilot() {
        return pilot;
    }

    public void setPilot(Employee pilot) {
        this.pilot = pilot;
    }

    public Employee getCoPilot() {
        return coPilot;
    }

    public void setCoPilot(Employee coPilot) {
        this.coPilot = coPilot;
    }
}
