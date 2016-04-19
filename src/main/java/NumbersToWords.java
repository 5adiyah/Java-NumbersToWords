//import java.util.Map;
//import java.util.HashMap;
import java.util.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class NumbersToWords {
  public static void main(String[] args) {
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

  get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      String userInput = request.queryParams("number");
      NumbersToWords newNumbers = new NumbersToWords();
      String convertedNumber = newNumbers.integerConverter(userInput);
      model.put("convertedNumber", convertedNumber);

      model.put("template", "templates/detector.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }


  public static String integerConverter(String number) {
    Integer newNumber = Integer.parseInt(number);
    HashMap<Integer, String> conversions = new HashMap<Integer, String>();
      conversions.put(1 ,"one");
      conversions.put(2,"two");
      conversions.put(3,"three");
      conversions.put(4,"four");
      conversions.put(5,"five");
      conversions.put(6,"six");
      conversions.put(7,"seven");
      conversions.put(8,"eight");
      conversions.put(9,"nine");

      conversions.put(10, "ten");
      conversions.put(20,"twenty");
      conversions.put(30,"thirty");
      conversions.put(40,"forty");
      conversions.put(50,"fifty");
      conversions.put(60,"sixty");
      conversions.put(70,"seventy");
      conversions.put(80,"eighty");
      conversions.put(90,"ninety");


    // for(int i = 0; i < conversions.size(); i++){
    // //   if(number == conversions.get("one")){
    // //     convertedNumber = "one";
    // //   }else if(number == conversions.get("ten")){
    // //     convertedNumber = "ten";
    // //   } else {
    // //     convertedNumber = "";
    // //   }
    // // } return convertedNumber;
    // }
    String result = conversions.get(newNumber);
return result;
}

}
