package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {
    @Test
    public void shouldParkACarWhenParkingLotHasEmptySpaces() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park(1));
    }

    @Test
    public void shouldNotParkACarWhenParkingLotHasNoEmptySpaces() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(1);
        assertFalse(parkingLot.park(2));
    }

    @Test
    public void shouldTellIfTheParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park(1);
        assertTrue(parkingLot.isFull());
    }

    @Test
    public void shouldTellIfTheParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertFalse(parkingLot.isFull());
    }
}