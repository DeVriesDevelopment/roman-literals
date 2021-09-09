import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RomanLiteralsTest {

  private static String convert(int i) {
    return Converter.convert(i);
  }

  private static final Map<String, Integer> PARAMETERS = new HashMap<>();

  static {
    PARAMETERS.put("I", 1);
    PARAMETERS.put("II", 2);
    PARAMETERS.put("III", 3);
    PARAMETERS.put("V", 5);
    PARAMETERS.put("X", 10);
    PARAMETERS.put("L", 50);
    PARAMETERS.put("C", 100);
    PARAMETERS.put("D", 500);
    PARAMETERS.put("M", 1000);
    PARAMETERS.put("IV", 4);
    PARAMETERS.put("VI", 6);
    PARAMETERS.put("XIV", 14);

    PARAMETERS.put("XLIX", 49);
    PARAMETERS.put("XCIX", 99);
    PARAMETERS.put("CDXCIX", 499);
    PARAMETERS.put("CMXCIX", 999);
    PARAMETERS.put("MMMCMXCIX", 3999);
    PARAMETERS.put("MDCLXVII", 1667);
  }

  @Test
  public void parameterizedRomanNumeralTest(){
    PARAMETERS.forEach((String key, Integer value) -> assertEquals(key, convert(value)));
  }

  @Test
  public void TestConverterFourThousand(){
    assertThrows(IllegalArgumentException.class, () -> convert(4000));
  }
}
