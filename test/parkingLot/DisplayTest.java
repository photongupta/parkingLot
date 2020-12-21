package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisplayTest {

    @Test
    public void shouldUpdateDisplay() {
        Display display = new Display();
        int actual = display.update(new ParkingLot(3), ParkingStatus.FILLED);
        assertEquals(1, actual);
    }
}