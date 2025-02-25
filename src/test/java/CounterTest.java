import java.util.*;
import org.junit.jupiter.api.Test;
import ru.sergey.CountingSheep.Counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {
    // backwards-compatibility, the method used to be an instance one
    private static final Counter counter = new Counter();

    private static void doTest(Boolean[] input, int expected) {
        String message = String.format("for array: %s\n", Arrays.toString(input));
        int actual = counter.countSheeps(input);
        assertEquals(expected, actual, message);
    }

    @Test
    void sampleTests() {
        doTest(new Boolean[] {
                true, true, true, false, true, true,  true, true, true, false, true,
                false, true, false, false, true, true,  true,  true, true, false,
                false, true,  true
        }, 17);
        doTest(new Boolean[] { false, true, true }, 2);
        doTest(new Boolean[] {}, 0);
        doTest(new Boolean[] { false, null, true, false, null, null, true}, 2);
        doTest(new Boolean[] { false, null, null}, 0);
    }
}