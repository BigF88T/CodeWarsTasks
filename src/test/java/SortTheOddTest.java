import org.junit.*;
import ru.sergey.SortTheOdd.*;

import static org.junit.Assert.*;

public class SortTheOddTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }

    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{1, 8, 3, 6, 5, 4, 7, 2, 9, 0}, Kata.sortArray(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
    }
}