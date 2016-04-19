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

      conversions.put(11 ,"eleven");
      conversions.put(12,"twelve");
      conversions.put(13,"thirteen");
      conversions.put(14,"fourteen");
      conversions.put(15,"fiften");
      conversions.put(16,"sixteen");
      conversions.put(17,"seventeen");
      conversions.put(18,"eighteen");
      conversions.put(19,"nineteen");

      conversions.put(10, "ten");
      conversions.put(20,"twenty");
      conversions.put(30,"thirty");
      conversions.put(40,"forty");
      conversions.put(50,"fifty");
      conversions.put(60,"sixty");
      conversions.put(70,"seventy");
      conversions.put(80,"eighty");
      conversions.put(90,"ninety");


    String result = "";
    if(newNumber > 99  && newNumber % 100 != 0){     //121
      Integer dividednum = newNumber / 100; //1
      Integer modulusRemainder = newNumber % 100;  //21
      Integer modulusRemainder2 = modulusRemainder % 10; //1
      Integer finalNum = modulusRemainder - modulusRemainder2; //20
      result = ((conversions.get(dividednum) + " hundred " + (conversions.get(finalNum)) + "-" + (conversions.get(modulusRemainder2))));
    } else if(newNumber > 19  && newNumber % 10 != 0){
      Integer modulusRemainder = newNumber % 10;
      Integer tensPlace = newNumber - modulusRemainder;
      result = ((conversions.get(tensPlace) + "-" + (conversions.get(modulusRemainder))));
    }else {
      result = conversions.get(newNumber);
    }


    return result;


  }


//Program takes number from 21-99
//by reading first number, then second
//number, combining both and returns
//the written word version




}
