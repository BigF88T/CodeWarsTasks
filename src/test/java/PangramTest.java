import org.junit.*;
import ru.sergey.PangramChecker.*;

import static org.junit.Assert.*;


public class PangramTest {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }
}