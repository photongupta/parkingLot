package parkingLot;

import java.util.HashMap;

public class Display {

    private final HashMap<ParkingLot, ParkingStatus> parkingLotEntries;

    public Display() {
        this.parkingLotEntries = new HashMap<>();
    }

    public int update(ParkingLot parkingLot, ParkingStatus status) {
        this.parkingLotEntries.put(parkingLot, status);
        return this.parkingLotEntries.size();
    }
}
