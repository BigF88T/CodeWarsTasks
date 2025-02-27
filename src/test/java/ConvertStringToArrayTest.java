import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import ru.sergey.ConvertAStringToAnArray.ConvertStringToArray;

public class ConvertStringToArrayTest {
    @Test
    public void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, ConvertStringToArray.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, ConvertStringToArray.stringToArray("I love arrays they are my favorite"));
    }
}