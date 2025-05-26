import org.junit.jupiter.api.Test;
import ru.sergey.Rot13.Rot;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

class RotTest {
    @Test
    void testRot13() {
        // assertEquals("expected", "actual");
        assertEquals("grfg", Rot.rot13("test"), "Input: \"test\"");
        assertEquals("Grfg", Rot.rot13("Test"), "Input: \"Test\"");
        assertEquals("g1r2f3g", Rot.rot13("t1e2s3t"), "Input: \"t1e2s3t\"");
    }
}