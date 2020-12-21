package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AssistantTest {
    @Test
    public void shouldAssignTheGivenParkingLotToTheAssistant() {
        Assistant assistant = new Assistant();
        ParkingLot parkingLot = new ParkingLot(1,assistant);
        assertTrue(assistant.assign(parkingLot));
    }
}
