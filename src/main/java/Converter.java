import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Converter {

  private static final Map<Integer, String> ROMAN_NUMERALS = new TreeMap<>(Comparator.reverseOrder());
  private static final Map<String, String> ROMAN_NUMERALS_REPLACEMENT_MAPPER = new LinkedHashMap<>();

  static {
    ROMAN_NUMERALS.put(1, "I");
    ROMAN_NUMERALS.put(5, "V");
    ROMAN_NUMERALS.put(10, "X");
    ROMAN_NUMERALS.put(50, "L");
    ROMAN_NUMERALS.put(100, "C");
    ROMAN_NUMERALS.put(500, "D");
    ROMAN_NUMERALS.put(1000, "M");

    ROMAN_NUMERALS_REPLACEMENT_MAPPER.put("DCCCC", "CM");
    ROMAN_NUMERALS_REPLACEMENT_MAPPER.put("CCCC", "CD");
    ROMAN_NUMERALS_REPLACEMENT_MAPPER.put("LXXXX", "XC");
    ROMAN_NUMERALS_REPLACEMENT_MAPPER.put("XXXX", "XL");
    ROMAN_NUMERALS_REPLACEMENT_MAPPER.put("VIIII", "IX");
    ROMAN_NUMERALS_REPLACEMENT_MAPPER.put("IIII", "IV");
  }

  static String convert(int i) {
    if(i >= 4000 || i < 1){
      throw new IllegalArgumentException();
    }

    int remaining = i;
    String romanNumeral = "";
    while(remaining > 0) {
      int finalRemaining = remaining;
      int biggestNumeral = ROMAN_NUMERALS.keySet().stream().filter(k -> finalRemaining >= k).findFirst().orElse(1);
      romanNumeral += (ROMAN_NUMERALS.get(biggestNumeral));
      remaining -= biggestNumeral;
    }
    System.out.println(romanNumeral);
    for (Map.Entry<String, String> replacement: ROMAN_NUMERALS_REPLACEMENT_MAPPER.entrySet()) {
      romanNumeral = romanNumeral.replace(replacement.getKey(), replacement.getValue());
    };
    return romanNumeral;
  }
}
