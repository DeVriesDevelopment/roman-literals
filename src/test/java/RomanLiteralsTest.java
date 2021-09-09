import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RomanLiteralsTest {

  private static String convert(int i) {
    return Converter.convert(i);
  }

  static Map<String, Integer> parameters = new HashMap<>();

  static {
    parameters.put("I", 1);
  }

  @Test
  public void parameterizedRomanNumeralTest(){
    parameters.forEach((String key, Integer value) -> assertEquals(key, convert(1)));
  }

  @Test
  public void TestConvertTwoToRomanLiterals() {
    assertEquals("II", convert(2));
  }

  @Test
  public void TestConvertThreeToRomanLiterals() {
    assertEquals("III", convert(3));
  }

  @Test
  public void TestConvertFiveToRomanLiterals() {
    assertEquals("V", convert(5));
  }

  @Test
  public void TestConvertTenToRomanLiterals() {
    assertEquals("X", convert(10));
  }

  @Test
  public void TestConvertFiftyToRomanLiterals() {
    assertEquals("L", convert(50));
  }

  @Test
  public void TestConvertHundredToRomanLiterals() {
    assertEquals("C", convert(100));
  }

  @Test
  public void TestConverterFiveHundredToRomanLiterals() {
    assertEquals("D", convert(500));
  }

  @Test
  public void TestConverterThousandToRomanLiterals() {
    assertEquals("M", convert(1000));
  }

  @Test
  public void TestConverterFourToRomanLiterals() {
    assertEquals("IV", convert(4));
  }

  @Test
  public void TestConverterSixToRomanLiterals() {
    assertEquals("VI", convert(6));
  }

  @Test
  public void TestConverterNineToRomanLiterals() {
    assertEquals("IX", convert(9));
  }

  @Test
  public void TestConverterFourteenToRomanLiterals() {
    assertEquals("XIV", convert(14));
  }

  @Test
  public void TestConverterFourtynineToRomanLiterals() {
    assertEquals("XLIX", convert(49));
  }

  @Test
  public void TestConverterNinetynineToRomanLiterals() {
    assertEquals("XCIX", convert(99));
  }

  @Test
  public void TestConverterFourNinetyNineToRomanLiterals() {
    assertEquals("CDXCIX", convert(499));
  }

  @Test
  public void TestConverterNineHunderdNinetyNineToRomanLiterals() {
    assertEquals("CMXCIX", convert(999));
  }

  @Test
  public void TestConverterThreeThousandNineHundredNinetyNineToRomanLiterals() {
    assertEquals("MMMCMXCIX", convert(3999));
  }

  @Test
  public void Test(){
    assertEquals("MDCLXVII", convert(1667));
  }

  @Test
  public void TestConverterFourThousand(){
    assertThrows(IllegalArgumentException.class, () -> convert(4000));
  }
}
