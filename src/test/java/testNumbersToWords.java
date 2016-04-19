import org.junit.*;
import static org.junit.Assert.*;

public class testNumbersToWords {

@Test
public void integerConverter_returnsWordsForNumbersInTensPlace_1() {
  NumbersToWords testNumbersToWords = new NumbersToWords();
  String expected = "one" ;
  assertEquals(expected, testNumbersToWords.integerConverter(1));
  }
}
