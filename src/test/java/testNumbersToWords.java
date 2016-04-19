import org.junit.*;
import static org.junit.Assert.*;

public class testNumbersToWords {

@Test
public void integerConverter_returnsWordsForNumbersInOnesPlace_9() {
  NumbersToWords testNumbersToWords = new NumbersToWords();
  String expected = "nine" ;
  assertEquals(expected, testNumbersToWords.integerConverter(9));
  }

@Test
public void integerConverter_returnsWordsForNumbersInTensPlace_30() {
  NumbersToWords testNumbersToWords = new NumbersToWords();
  String expected = "thirty" ;
  assertEquals(expected, testNumbersToWords.integerConverter(30));
  }
}
