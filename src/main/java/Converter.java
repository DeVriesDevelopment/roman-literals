import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Converter {

  static final Map<Integer, String> romanNumerals = new TreeMap<>(());

  static {
    romanNumerals.put(1, "I");
    romanNumerals.put(5, "V");
    romanNumerals.put(10, "X");
    romanNumerals.put(50, "L");
  }

  public static String convert(int i) {
    if (i == 5) {
      return "V";
    } if (i == 10) {
      return "X";
    } if (i == 50) {
      return "L";
    } else {
      return "I".repeat(i);
    }
  }
}
