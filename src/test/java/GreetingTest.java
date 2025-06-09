import org.junit.*;
import ru.sergey.GreetingProgramm.*;

import static org.junit.Assert.*;

public class GreetingTest {
    @Test
    public void testSomething() {
        assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
    }
}
