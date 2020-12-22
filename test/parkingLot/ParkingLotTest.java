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
        parkingLot.assignListener(assistant, 100);

        assertTrue(parkingLot.park());
        verify(assistant).notify(parkingLot);
    }

    @Test
    public void shouldNotifyToAttendantWhenParkingLotIsFull() {
        ParkingLot parkingLot = new ParkingLot(1);
        ParkingLotListener attendant = mock(ParkingLotListener.class);
        parkingLot.assignListener(attendant, 100);

        assertTrue(parkingLot.park());
        verify(attendant).notify(parkingLot);
    }

    @Test
    public void shouldNotifyToManagerWhenParkingLotIs80PercentFull() {
        ParkingLot parkingLot = new ParkingLot(5);
        ParkingLotListener manager = mock(ParkingLotListener.class);
        parkingLot.assignListener(manager, 80);

        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());
        assertTrue(parkingLot.park());

        verify(manager).notify(parkingLot);
    }

}


