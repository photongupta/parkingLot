package parkingLot;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {
    @Test
    public void shouldParkACarWhenParkingLotHasEmptySpaces() {
        ParkingLot parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.park());
    }
    
    @Test
    public void shouldNotParkACarWhenParkingLotHasNoEmptySpaces() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        assertFalse(parkingLot.park());
    }
    
    @Test
    public void shouldTellIfTheParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        parkingLot.park();
        assertTrue(parkingLot.isFull());
    }
    
    @Test
    public void shouldTellIfTheParkingLotIsNotFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        assertFalse(parkingLot.isFull());
    }
}