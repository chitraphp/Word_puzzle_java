import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class WordPuzzle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");


get("/", (request, response) -> {
  Map<String, Object> model = new HashMap<String, Object>();
  model.put("template", "templates/home.vtl");
  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

get("/results", (request, response) -> {
  Map<String, Object> model = new HashMap<String, Object>();
  model.put("template", "templates/results.vtl");

  String userInput = request.queryParams("userInput");
  String output = vowelReplace(userInput);

  model.put("output", output);

  return new ModelAndView(model, layout);
}, new VelocityTemplateEngine());

  }


  public static String vowelReplace( String input) {
    //String newInput = input;
    char[] inputCharsArray = input.toCharArray();

    String newInput = input.replaceAll("[aeiouAEIOU]", "-");
    return newInput;
  }
}
