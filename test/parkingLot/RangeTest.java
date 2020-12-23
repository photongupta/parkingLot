package parkingLot;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RangeTest {

    @Test
    public void shouldGiveStartOfGivenRange() {
        Range range = new Range(0, 20);
        assertEquals(0, range.from());
    }

    @Test
    public void shouldGiveEndOfGivenRange() {
        Range range = new Range(0, 20);
        assertEquals(20, range.to());
    }
}