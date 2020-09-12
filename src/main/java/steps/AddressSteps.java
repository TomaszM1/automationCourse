package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddressPage;
import pages.LoginPage;

public class AddressSteps {
  AddressPage addressPage;
  private static WebDriver driver;

  @Given("^Log in to CodersLab shop$")
  public void userIsLoggedInToCodersLabShop() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().window().maximize();

    driver.get("https://prod-kurs.coderslab.pl/index.php?controller=authentication");
    LoginPage loginPage = new LoginPage(driver);
    loginPage.loginAs("michal.dobrzycki@coderslab.pl", "CodersLab");

    //addressPage = new AddressPage(driver);
  }

  @When("^User goes to AddressPage$")
  public void userGoesToAddressesPage() {
    driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");
    addressPage = new AddressPage(driver);
  }


  @And("^User set following address \"([^\"]*)\"$")
  public void userSetFollowingAddress(String address) {
    addressPage.setAddress(address);
  }

  @And("^User set following city \"([^\"]*)\"$")
  public void userSetFollowingCity(String city) {
    addressPage.setCity(city);
  }

  @And("^User set following post code \"([^\"]*)\"$")
  public void userSetFollowingPostCode(String postCode) {
    addressPage.setPostCode(postCode);
  }

  @And("^User submits add new address form$")
  public void submitAddNewAddress() {
    addressPage.submitNewAddress();
  }

  @And("^Address was submitted correctly$")
  public void addressWasSubmittedCorrectly() {

    Assert.assertEquals("Address1 successfully added!", addressPage.getSuccessAlertText());
  }

  @And("^close driver$")
  public void closeDriver() {
    driver.quit();
  }
}
