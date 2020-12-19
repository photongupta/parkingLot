package parkingLot;

public class ParkingLot {
    private final int capacity;
    private int occupiedSpaces;
    
    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupiedSpaces = 0;
    }
    
    public boolean park() {
        if (this.isFull()) {
            return false;
        }
        this.occupiedSpaces += 1;
        return true;
    }
    
    public boolean isFull() {
        return this.occupiedSpaces == this.capacity;
    }
}
