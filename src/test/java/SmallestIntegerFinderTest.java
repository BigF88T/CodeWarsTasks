import org.junit.jupiter.api.Test;
import ru.sergey.FindSmallestInt.FindSmallestInt;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.*;

public class SmallestIntegerFinderTest {
    @Test
    void sampleTests() {
        doTest(new int[]{78,56,-2,12,-8}, -8);
        doTest(new int[]{Integer.MIN_VALUE, -666}, Integer.MIN_VALUE);
        doTest(new int[]{666, Integer.MIN_VALUE}, Integer.MIN_VALUE);
        doTest(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}, Integer.MAX_VALUE);
        doTest(new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}, Integer.MIN_VALUE);
    }

    private static void doTest(int[] input, int expected) {
        String message = String.format("for input %s\n", Arrays.toString(input));
        int actual = FindSmallestInt.findSmallestInt(input);
        assertEquals(expected, actual, message);
    }
}