package parkingLot;

import java.util.HashMap;

public class ParkingLot {
    private int occupiedSlots;
    private final int capacity;
    private final HashMap<ParkingLotListener, Range> listeners = new HashMap<>();

    public ParkingLot(int capacity) {
        this.occupiedSlots = 0;
        this.capacity = capacity;
    }

    public void assignListener(ParkingLotListener listener, int threshold) {
        assignListener(listener, threshold, threshold);
    }

    public void assignListener(ParkingLotListener listener, int thresholdFrom, int thresholdTo) {
        Range range = new Range(thresholdFrom, thresholdTo);
        this.listeners.put(listener, range);
    }

    public boolean park() {
        if (this.isFull()) return false;

        this.occupiedSlots++;
        this.informListeners();
        return true;
    }

    private void informListeners() {
        this.listeners.forEach((listener, range) -> {
            if (this.isOccupiedBy(range)) {
                listener.notify(this);
            }
        });
    }

    private boolean isOccupiedBy(Range range) {
        int from = range.from();
        int to = range.to();
        int occupiedPercentage = this.occupiedSlots * 100 / this.capacity;
        return occupiedPercentage >= from && occupiedPercentage <= to;
    }

    private boolean isFull() {
        return this.occupiedSlots == this.capacity;
    }

}
