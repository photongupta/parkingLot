package parkingLot;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AssistantTest {
    @Test
    public void shouldUpdateDisplayWhenGetNotification() {
        Display display = mock(Display.class);
        Assistant assistant = new Assistant(display);
        ParkingLot parkingLot = new ParkingLot(3);

        assistant.informFull(parkingLot);

        verify(display).update(parkingLot, ParkingStatus.FILLED);
    }
}
