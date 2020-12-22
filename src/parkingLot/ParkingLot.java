package parkingLot;

import java.util.HashMap;

public class ParkingLot {
    private int availableSlots;
    private final int capacity;
    private final HashMap<ParkingLotListener, Integer> listeners = new HashMap<>();

    public ParkingLot(int capacity) {
        this.availableSlots = 0;
        this.capacity = capacity;
    }

    public void assignListener(ParkingLotListener listener, int threshold) {
        this.listeners.put(listener, threshold);
    }

    public boolean park() {
        if (this.isFull()) return false;

        this.availableSlots++;
        this.informListeners();
        return true;
    }

    private void informListeners() {
        this.listeners.forEach((listener, threshold) -> {
            if (this.isOccupiedBy(threshold)) {
                listener.notify(this);
            }
        });
    }

    private boolean isOccupiedBy(int threshold) {
        return this.availableSlots * 100 / this.capacity == threshold;
    }

    private boolean isFull() {
        return this.isOccupiedBy(100);
    }

}
