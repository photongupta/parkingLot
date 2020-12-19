package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ParkingLotsTest {
    @Test
    public void shouldParkACarWhenParkingLotHasEmptySpaces() {
        ParkingLot[] parkingLots1 = { new ParkingLot(1),new ParkingLot(2)};
        ParkingLots parkingLots = new ParkingLots(parkingLots1);
        assertTrue(parkingLots.park());
    }
}
