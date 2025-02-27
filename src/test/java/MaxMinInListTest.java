import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import ru.sergey.FindMaximumAndMinimumValuesOfAList.MaxMinInList;

// TODO: Replace examples and use TDD development by writing your own tests

public class MaxMinInListTest {

    private MaxMinInList MaxMinInList = new MaxMinInList();

    @Test
    public void testExamples() {
        assertEquals(-110, MaxMinInList.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, MaxMinInList.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, MaxMinInList.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, MaxMinInList.max(new int[]{5}));
    }
}