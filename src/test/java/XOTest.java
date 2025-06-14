import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import ru.sergey.XO.*;

import static org.junit.jupiter.api.Assertions.*;

class XOTest {
    @ParameterizedTest(name = "str = \"{1}\"") @DisplayName("Sample tests")
    @CsvSource(textBlock = """
      true,  ooxx
      false, xooxx
      true,  ooxXm
      true,  zpzpzpp
      false, zzoo
      true,  xxxooo
      true,  xxxXooOo
      false, xxx23424esdsfvxXXOOooo
      false, xXxxoewrcoOoo
      false, XxxxooO
      true,  zssddd
      false, Xxxxertr34
      true,  '' 
  """)
    void sampleTests(boolean expected, String input) {
        assertEquals(expected, XO.getXO(input));
    }
}