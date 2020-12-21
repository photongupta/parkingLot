package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
    public void shouldNotifyAssistantWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        Assistant assistant = mock(Assistant.class);
        parkingLot.assign(assistant);

        assertTrue(parkingLot.park());
        verify(assistant).informFull(parkingLot);
    }
}


