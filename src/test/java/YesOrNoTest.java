import org.junit.Test;
import static org.junit.Assert.assertEquals;

import ru.sergey.ConvertBooleanToString.YesOrNo;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals(YesOrNo.boolToWord(true),"Yes");
        assertEquals(YesOrNo.boolToWord(false),"No");
    }
}