package parkingLot;

public class Assistant implements ParkingLotListener {

    private final Display display;

    public Assistant(Display display) {
        this.display = display;
    }

    @Override
    public void notify(ParkingLot parkingLot) {
        this.display.update(parkingLot, ParkingStatus.FILLED);
    }
}
