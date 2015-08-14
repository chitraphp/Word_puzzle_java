import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleUnitTest {

  @Test
  public void wordOf_oneChar_vowel() {
    WordPuzzle word = new WordPuzzle();
    String result = "-";
    assertEquals(result, word.vowelReplace("a"));
  }

  @Test
  public void wordOf_oneChar_consonant() {
    WordPuzzle word = new WordPuzzle();
    String result = "b";
    assertEquals(result, word.vowelReplace("b"));
  }

  @Test
  public void wordOf_twoChar_oneVowel() {
    WordPuzzle word = new WordPuzzle();
    String result = "-b";
    assertEquals(result, word.vowelReplace("ab"));
  }

  @Test
  public void wordOf_oneChar_capital_vowel() {
    WordPuzzle word = new WordPuzzle();
    String result = "-";
    assertEquals(result, word.vowelReplace("A"));
  }


  @Test
  public void wordOf_two_vowels() {
    WordPuzzle word = new WordPuzzle();
    String result = "--";
    assertEquals(result, word.vowelReplace("ae"));
  }

  @Test
  public void wordOf_two_consonants() {
    WordPuzzle word = new WordPuzzle();
    String result = "xz";
    assertEquals(result, word.vowelReplace("xz"));
  }

  @Test
  public void stringOf_two_words() {
    WordPuzzle word = new WordPuzzle();
    String result = "-n th-";
    assertEquals(result, word.vowelReplace("an the"));
  }

  @Test
  public void stringOf_special_chars() {
    WordPuzzle word = new WordPuzzle();
    String result = "S-n *r-s-s -n th- --st!";
    assertEquals(result, word.vowelReplace("Sun *rises in the east!"));
  }

  @Test
  public void stringStarstWith_special_chars() {
    WordPuzzle word = new WordPuzzle();
    String result = "!h--r-y";
    assertEquals(result, word.vowelReplace("!hooray"));
  }

  @Test
  public void stringOf_special_chars_capitals() {
    WordPuzzle word = new WordPuzzle();
    String result = "S-n *r-s-s -n th- --st!";
    assertEquals(result, word.vowelReplace("Sun *rises In the East!"));
  }
}
