package parkingLot;

import java.util.ArrayList;

public class ParkingLot {
    private final ArrayList<ParkingStatus> slots;
    private final int capacity;
    private Assistant assistant;

    public ParkingLot(int capacity) {
        this.slots = new ArrayList<>(capacity);
        this.capacity = capacity;
    }

    public void assign(Assistant assistant) {
        this.assistant = assistant;
    }

    public boolean park() {
        boolean isParked = false;
        if (!this.isFull()) {
            this.slots.add(ParkingStatus.FILLED);
            isParked = true;
        }
        if (this.isFull() && this.assistant != null) {
            this.assistant.informFull(this);
        }
        return isParked;
    }

    private boolean isFull() {
        return this.slots.size() == this.capacity;
    }

}
