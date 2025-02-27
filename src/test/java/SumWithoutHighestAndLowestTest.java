import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import ru.sergey.SumWithoutHighestAndLowestNumber.SumWithoutHighestAndLowest;

public class SumWithoutHighestAndLowestTest {
    @Test
    public void BasicTests() {
        assertEquals(16, SumWithoutHighestAndLowest.sum(new int[] { 6, 2, 1, 8, 10}));
        assertEquals(0, SumWithoutHighestAndLowest.sum(new int[] {}));
        assertEquals(0, SumWithoutHighestAndLowest.sum(new int[] {1}));
    }
}