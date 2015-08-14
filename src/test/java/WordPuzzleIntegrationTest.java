import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class WordPuzzleIntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
  goTo("http://localhost:4567/");
  assertThat(pageSource()).contains("Word Puzzle");
  }

  @Test
  public void enterCoins() {
  goTo("http://localhost:4567/");
  fill("#userInput").with("a");
  submit(".btn");
  assertThat(title()).contains("Word Puzzle");
  }

  @Test
  public void enterString() {
  goTo("http://localhost:4567/");
  fill("#userInput").with("a");
  submit(".btn");
  assertThat(pageSource()).contains("Word Puzzle to solve ");
  }

  @Test
  public void enterStringOutput() {
  goTo("http://localhost:4567/");
  fill("#userInput").with("a");
  submit(".btn");
  assertThat(pageSource()).contains("-");
  }
}
