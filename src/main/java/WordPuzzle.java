import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;

public class WordPuzzle {
  public static void main(String[] args) {}


  public static String vowelReplace( String input) {
    input = input.toLowerCase();
    char[] inputCharsArray = input.toCharArray();
    String newInput = "";

    // String newInput = input.replace('b','c');
    // System.out.println(newInput);
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};


    for(char inputChar : inputCharsArray ) {
      System.out.println(inputChar);
      switch (inputChar) {

        case 'a': newInput = input.replace('a', '-');
        //System.out.println(newInput);

                  break;
        case 'e': newInput = input.replace('e', '-');
                  break;
        case 'i': newInput = input.replace('i', '-');
                  break;
        case 'o': newInput = input.replace('o', '-');
                  break;
        case 'u': newInput = input.replace('u', '-');
                  break;
        default:
                  break;
      }
    }
    return newInput;
  }
}
