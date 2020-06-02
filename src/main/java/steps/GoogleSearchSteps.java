package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchSteps extends SetupDriver {

 // WebDriver driver;

  @Given("^an open browser with \"(.*)\"$")
  public void iAmOnGoogleSearchPage(String url) {
 //   System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
//    driver = new ChromeDriver();
//    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//    driver.manage().window().maximize();
    driver.get(url);
  }

  @When("^a keyword \"(.*)\" is entered in input field$")
  public void typeGoogleSearchText(String searchText) {
    WebElement googleSearchInput = driver.findElement(By.name("q"));
    googleSearchInput.clear();
    googleSearchInput.sendKeys(searchText);
    googleSearchInput.submit();
  }

  @Then("^the first one should contain \"(.*)\"$")
  public void clickSearchButton(String expectedKeyword) {
    WebElement firstResult = driver.findElements(By.xpath("//a/h3")).get(0);
    assert firstResult.getText().equals(expectedKeyword);

  }

  @And("^close browser$")
  public void closeBrowser() {
    driver.quit();
  }
}
