import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleUnitTest {

  @Test
  public void wordOf_oneChar() {
    WordPuzzle word = new WordPuzzle();
    String result = "-";
    assertEquals(result, word.vowelReplace("a"));
  }
}
