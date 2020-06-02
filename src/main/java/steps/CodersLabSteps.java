package steps;

import io.cucumber.java.en.When;
import java.security.InvalidParameterException;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CodersLabSteps extends SetupDriver {

  @When("^I click sign in$")
  public void clickSignIn() {
    WebElement signInButton = driver.findElement(By.xpath("//span[text()='Sign in']"));
    signInButton.click();
  }

  @When("^I enter following email address \"(.*)\" and submit$")
  public void enterEmailAddress(String emailAddress) {
    WebElement emailAddressInput = driver.findElement(By.name("email_create"));
    emailAddressInput.sendKeys(emailAddress);

    WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
    createAccountButton.click();
  }

  @When("^I fill in personal information$")
  public void fillInPersonalInformation(Map<String, String> inboxParams) {
    WebElement genderCheckBox;
    switch (inboxParams.get("Title").toLowerCase()) {
      case "mr.":
        genderCheckBox = driver.findElement(By.id("id_gender1"));
        break;
      case "mrs.":
        genderCheckBox = driver.findElement(By.id("id_gender2"));
        break;
      default:
        throw new InvalidParameterException(
            "Wrong gender parameter. Mr., Mrs. available.");
    }
    genderCheckBox.click();

    WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
    firstNameInput.sendKeys(inboxParams.get("FirstName"));

    WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
    lastNameInput.sendKeys(inboxParams.get("LastName"));

    WebElement emailAddressInput = driver.findElement(By.id("email"));
    emailAddressInput.click();

    WebElement passwordInput = driver.findElement(By.id("passwd"));
    passwordInput.sendKeys(inboxParams.get("Password"));

    String[] dateOfBirth = inboxParams.get("DateOfBirth").split("-");
    Select dayOfBirthSelect = new Select(driver.findElement(By.id("days")));
    dayOfBirthSelect.selectByValue(dateOfBirth[0]);

    Select monthOfBirthSelect = new Select(driver.findElement(By.id("months")));
    monthOfBirthSelect.selectByValue(dateOfBirth[1]);

    Select yearOfBirthSelect = new Select(driver.findElement(By.id("years")));
    yearOfBirthSelect.selectByValue(dateOfBirth[2]);

    WebElement newsLetterCheckbox = driver.findElement(By.id("newsletter"));

    if (newsLetterCheckbox.isSelected()) {
      newsLetterCheckbox.click();
    }

    WebElement specialOffersCheckbox = driver.findElement(By.id("uniform-optin"));

    if (specialOffersCheckbox.isSelected()) {
      specialOffersCheckbox.click();
    }
  }

  @When("^I register new user$")
  public void registerNewUser() {
    WebElement specialOffersCheckbox = driver.findElement(By.id("submitAccount"));
    specialOffersCheckbox.click();
  }

  @When("^Account was created and I can see following information \"(.*)\"$")
  public void accountWasCreated(String expectedTxt) {
    WebElement specialOffersCheckbox = driver.findElement(By.xpath("//p[contains(@class,'alert-success')]"));
    assert specialOffersCheckbox.getText().equals(expectedTxt);
  }
}
