package parkingLot;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLot {
    private final ArrayList<ParkingStatus> slots;
    private final int capacity;
    private final HashMap<ParkingLotListener, Integer> listeners;

    public ParkingLot(int capacity) {
        this.slots = new ArrayList<>(capacity);
        this.listeners = new HashMap<>();
        this.capacity = capacity;
    }

    public void assignListener(ParkingLotListener listener, int informOn) {
        this.listeners.put(listener, informOn);
    }

    public boolean park() {
        if (this.isFull()) return false;

        this.slots.add(ParkingStatus.FILLED);
        this.informListeners();
        return true;
    }

    private void informListeners() {
        ParkingLot parkingLot = this;
        this.listeners.forEach((listener, occupiedPercent) -> {
            if (this.isOccupiedBy(occupiedPercent)) {
                listener.notify(parkingLot);
            }
        });
    }

    private boolean isOccupiedBy(int percent) {
        return this.slots.size() * 100 / this.capacity == percent;
    }

    private boolean isFull() {
        return this.isOccupiedBy(100);
    }

}
