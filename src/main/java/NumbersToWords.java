import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumbersToWords {
  public static void main(String[] args) {}

  public static String integerConverter(Integer number) {
    HashMap conversions = new HashMap();
      conversions.put("1", "one");
      conversions.put("2", "two");
      conversions.put("3", "three");
      conversions.put("4", "four");
      conversions.put("5", "five");
      conversions.put("6", "six");
      conversions.put("7", "seven");
      conversions.put("8", "eight");
      conversions.put("9", "nine");
  }

}
