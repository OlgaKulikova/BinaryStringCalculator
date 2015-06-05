import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestString {
  BinaryStringCalculator calc;

  @Before
  public void createInstance() {
    calc = new BinaryStringCalculator();
  }

  @Test
  public void calculateStringsWithEqualsLength() {
    String s1 = "0101001";
    String s2 = "1110101";
    String expected = "10011110";
    String actual = calc.add(s1, s2);
    assertEquals(expected, actual);
  }

  @Test
  public void givenTheFirstStringWithLengthNull_WhenCalculate_ThenResultShouldBeTheSecondString() {
    String s1 = "";
    String s2 = "1110101";
    String expected = "1110101";
    String actual = calc.add(s1, s2);
    assertEquals(expected, actual);
  }

  @Test
  public void calculateStringsWithDifferentLength() {
    String s1 = "110";
    String s2 = "1110101";
    String expected = "1111011";
    String actual = calc.add(s1, s2);
    assertEquals(expected, actual);
  }

  @Test
  public void calculateTwoEmptyStrings() {
    String s1 = "";
    String s2 = "";
    String expected = "";
    String actual = calc.add(s1, s2);
    assertEquals(expected, actual);
  }
}
