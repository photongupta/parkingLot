package parkingLot;

import java.util.ArrayList;

public class Assistant {
    
    private final ArrayList<ParkingLot> parkingLots;
    
    public Assistant() {
        this.parkingLots = new ArrayList<>();
    }
    
    public boolean assign(ParkingLot parkingLot) {
        return this.parkingLots.add(parkingLot);
    }
    
    public void receiveNotification() {
    }
}
