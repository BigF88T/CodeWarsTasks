import org.junit.jupiter.api.Test;
import ru.sergey.NextSmallerNumber.Kata;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NextSmallerNumTest {
    @Test
    void basicTests() {
//        assertEquals(12,  Kata.nextSmaller(21)              , "Next smaller number from digits of 21 is 12"  );
        assertEquals(-1,  Kata.nextSmaller(1027)            , "Should return -1 if there is no smaller number with same digits");
        assertEquals(414, Kata.nextSmaller(441)             , "Next smaller number from digits of 441 is 414");
        assertEquals(513, Kata.nextSmaller(531)             , "Next smaller number from digits of 531 is 513");
        assertEquals(790, Kata.nextSmaller(907)             , "Next smaller number from digits of 907 is 790");
        assertEquals(123456789, Kata.nextSmaller(123456798) , "Next smaller number from digits of 123456798 is 123456789");
    }
}