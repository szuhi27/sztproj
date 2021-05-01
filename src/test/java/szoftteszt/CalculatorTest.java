package szoftteszt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  public void setUp() {
    calculator = new Calculator();
  }

  @Test
  @DisplayName("Average should work")
  public void testAverage() {
    int[] array = {5, 5, 5, 5};
    assertEquals(5.00, calculator.Average(array), "Average should work");
  }

  @RepeatedTest(5)
  @DisplayName("Average repeat should work")
  public void testAverageRepeat() {
    int[] array = {5, 3, 4, 6, 8, 9, 1, 6, 20, 4, 61, 32};
    assertEquals(13.25, calculator.Average(array), "Average repeat should work");
  }

  @Test
  @DisplayName("Average should not be correct")
  public void testAverageFalse(){
    int[] array = {73,24,52,23,654,11,235,4745};
    assertNotEquals(46.53, calculator.Average(array), "Average repeat should work");
  }

  @Test
  @DisplayName("Projection should work")
  public void testProjected() {
    assertEquals(2.08, calculator.ProjPrice(1250, 5, 120), "Projection should work");
  }

  @RepeatedTest(3)
  @DisplayName("Projection repeat should work")
  public void testProjectedRepeat() {
    assertEquals(8.01, calculator.ProjPrice(23000, 8, 359), "Projection repeat should work");
  }

  @Test
  @DisplayName("Projection should not be correct")
  public void testProjectedFalse(){
    assertNotEquals(3.65, calculator.ProjPrice(314,4,233), "Projection should not be correct");
  }

}
