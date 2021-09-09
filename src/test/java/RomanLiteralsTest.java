import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanLiteralsTest {

  private static String convert(int i) {
    return Converter.convert(i);
  }

  @Test
  public void TestConvertOneToRomanLiterals() {
    assertEquals("I", convert(1));
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
}
