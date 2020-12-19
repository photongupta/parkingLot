package parkingLot;

public class ParkingLots {
    private final ParkingLot[] parkingLots;
    private int currentParkingLotIndex;
    
    public ParkingLots(ParkingLot[] parkingLots) {
        this.parkingLots = parkingLots;
        this.currentParkingLotIndex = 0;
    }
    
    public boolean park() {
        boolean isParked = this.parkingLots[currentParkingLotIndex].park();
        if(isParked) {
            return true;
        }
        this.currentParkingLotIndex++;
        return this.parkingLots[currentParkingLotIndex].park();
    }
}
