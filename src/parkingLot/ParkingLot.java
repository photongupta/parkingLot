package parkingLot;

import java.util.ArrayList;

public class ParkingLot {

    private final ArrayList<Integer> slots;
    private final int capacity;

    public ParkingLot(int capacity) {
        this.slots = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public boolean park(int carId) {
        if (this.isFull()) return false;
        return this.slots.add(carId);
    }

    public boolean isFull() {
        return this.capacity == this.slots.size();
    }
}
