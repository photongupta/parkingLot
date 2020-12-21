package parkingLot;

import java.util.Arrays;

public class ParkingLot {
    private final SlotStatus[] slots;
    private final Assistant assistant;
    
    public ParkingLot(int capacity, Assistant assistant) {
        this.slots = new SlotStatus[capacity];
        this.assistant = assistant;
        Arrays.fill(slots, SlotStatus.EMPTY);
    }
    
    public boolean park() {
        for (int slotNo = 0; slotNo < this.slots.length; slotNo++) {
            if (this.isEmptySlot(slotNo)) {
                this.slots[slotNo] = SlotStatus.FILLED;
                return true;
            }
        }
        this.assistant.receiveNotification();
        return false;
    }
    
    private boolean isEmptySlot(int slotNo) {
        return this.slots[slotNo] == SlotStatus.EMPTY;
    }
}
