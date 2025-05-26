import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;
import ru.sergey.WhoLikeIs.WhoLike;

public class WhoLikeTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", WhoLike.whoLikesIt());
        assertEquals("Peter likes this", WhoLike.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", WhoLike.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", WhoLike.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", WhoLike.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
        assertEquals("Alex, Jacob and 3 others like this", WhoLike.whoLikesIt("Alex", "Jacob", "Mark", "Max", "Jopa"));
    }
}