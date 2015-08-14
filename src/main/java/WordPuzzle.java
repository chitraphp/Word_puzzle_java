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
    String newInput = input;
    char[] inputCharsArray = input.toCharArray();

    for(char inputChar : inputCharsArray ) {
      //System.out.println(inputChar);
      switch (inputChar) {
        case 'a': newInput = newInput.replace('a', '-');
        //System.out.println(newInput);
                  break;
        case 'e': newInput = newInput.replace('e', '-');
                  break;
        case 'i': newInput = newInput.replace('i', '-');
                  break;
        case 'o': newInput = newInput.replace('o', '-');
                  break;
        case 'u': newInput = newInput.replace('u', '-');
                  break;
        case 'A': newInput = newInput.replace('A', '-');
                  break;
        case 'E': newInput = newInput.replace('E', '-');
                  break;
        case 'I': newInput = newInput.replace('I', '-');
                  break;
        case 'O': newInput = newInput.replace('O', '-');
                  break;
        case 'U': newInput = newInput.replace('U', '-');
                  break;

        default:
        //System.out.println(newInput);
                  break;
      }
    }
    return newInput;
  }
}
