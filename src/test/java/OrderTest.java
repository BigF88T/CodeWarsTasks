import org.junit.*;
import ru.sergey.Order.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class OrderTest {
    @Test
    public void test1() {
        assertThat(Order.order("is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"));
    }

    @Test
    public void test2() {
        assertThat(Order.order("4of Fo1r pe6ople g3ood th5e the2"), equalTo("Fo1r the2 g3ood 4of th5e pe6ople"));
    }

    @Test
    public void test3() {
        assertThat("Empty input should return empty string", Order.order(""), equalTo(""));
    }
}