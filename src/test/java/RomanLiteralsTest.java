import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanLiteralsTest {

  private static final Map<Integer, String> romanNumeralTestParameters = new HashMap<>();

  static {
    romanNumeralTestParameters.put(1, "I");
    romanNumeralTestParameters.put(2, "II");
    romanNumeralTestParameters.put(3, "III");
    romanNumeralTestParameters.put(4, "IV");
    romanNumeralTestParameters.put(5, "V");
    romanNumeralTestParameters.put(6, "VI");
    romanNumeralTestParameters.put(9, "IX");
    romanNumeralTestParameters.put(10, "X");
  }

  @Test
  void TestParameterizedRomanNumerals() {
    for (Map.Entry<Integer, String> item : romanNumeralTestParameters.entrySet()) {
      assertEquals(item.getValue(), convert(item.getKey()));
    }
  }

  private String convert(int number) {
    Converter converter = new Converter();
    return converter.convert(number);
  }
}
