import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import ru.sergey.NarcissisticNumbers.NarcissisticNum;

public class NarcissisticNumTest {

    @Test
    void exampleTests() {
        assertTrue(NarcissisticNum.isNarcissistic(153), "153 is narcissistic");
        assertTrue(NarcissisticNum.isNarcissistic(1634), "1634 is narcissistic");
        assertFalse(NarcissisticNum.isNarcissistic(112), "112 is not narcissistic");
    }

}