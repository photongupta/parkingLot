package parkingLot;

public class Assistant {

    private final Display display;

    public Assistant(Display display) {
        this.display = display;
    }

    public void informFull(ParkingLot parkingLot) {
        this.display.update(parkingLot, ParkingStatus.FILLED);
    }
}
