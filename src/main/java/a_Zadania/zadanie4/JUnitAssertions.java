package a_Zadania.zadanie4;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnitAssertions {

  private WebDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
  }

  @Test
  public void fillInUserForm() {
    WebElement firstName = driver.findElement(By.name("firstName"));
    if (firstName.isEnabled()) {
      String firstNameValue = "Karol";

      System.out.println("First  name field name: " + firstName.getAttribute("name"));
      firstName.clear();
      firstName.sendKeys(firstNameValue);

      Assert.assertEquals(
          "First name text should be set to " + firstNameValue + ", but is " + firstName
              .getAttribute("value"),
          firstName.getAttribute("value"), firstNameValue);
    } else {
      Assert.fail();
    }

    WebElement lastName = driver.findElement(By.name("lastName"));
    if (lastName.isEnabled()) {
      String lastNameValue = "Kowalski";

      System.out.println("Last name field name: " + lastName.getAttribute("name"));
      lastName.clear();
      lastName.sendKeys(lastNameValue);

      Assert.assertEquals(
          "Last name text should be set to " + lastNameValue + ", but is " + lastName
              .getAttribute("value"),
          lastName.getAttribute("value"), lastNameValue);
    } else {
      Assert.fail();
    }

    String genderValue = "Male";
    // WebElement gender = driver.findElements(By.name("gender")).get(0);
    WebElement gender = driver.findElement(By.xpath("//label[text()='" + genderValue + "']/input"));
    if (gender.isDisplayed()) {
      System.out.println("Gender field name: " + gender.getAttribute("name"));
      gender.click();

      Assert.assertEquals(
          "Gender should be set to " + genderValue + ", but is " + gender.getAttribute("value"),
          gender.getAttribute("value"), gender.getAttribute("value"));
    } else {
      Assert.fail();
    }

    WebElement dateOfBirth = driver.findElement(By.name("dob"));
    if (dateOfBirth.isEnabled()) {
      String dateOfBirthValue = "05/22/2010";

      System.out.println("Date of birth field name: " + dateOfBirth.getAttribute("name"));
      dateOfBirth.clear();
      dateOfBirth.sendKeys(dateOfBirthValue + Keys.ESCAPE);

      Assert.assertEquals(
          "Last name text should be set to " + dateOfBirthValue + ", but is " + dateOfBirth
              .getAttribute("value"),
          dateOfBirth.getAttribute("value"), dateOfBirthValue);
    } else {
      Assert.fail();
    }

    WebElement address = driver.findElement(By.name("address"));
    if (address.isEnabled()) {
      String addressValue = "Prosta 51";

      System.out.println("Address field name: " + address.getAttribute("name"));
      address.clear();
      address.sendKeys(addressValue);

      Assert.assertEquals(
          "Last name text should be set to " + addressValue + ", but is " + address
              .getAttribute("value"),
          address.getAttribute("value"), addressValue);
    } else {
      Assert.fail();
    }

    WebElement email = driver.findElement(By.name("email"));
    if (email.isEnabled()) {
      String emailValue = "karol.kowalski@mailinator.com";

      System.out.println("Email field name: " + email.getAttribute("name"));
      email.clear();
      email.sendKeys(emailValue);

      Assert.assertEquals(
          "Last name text should be set to " + emailValue + ", but is " + email
              .getAttribute("value"),
          email.getAttribute("value"), emailValue);
    } else {
      Assert.fail();
    }

    WebElement password = driver.findElement(By.name("password"));
    if (password.isEnabled()) {
      String passwordValue = "Pass123";

      System.out.println("Password field name: " + password.getAttribute("name"));
      password.clear();
      password.sendKeys(passwordValue);

      Assert.assertEquals(
          "Last name text should be set to " + passwordValue + ", but is " + password
              .getAttribute("value"),
          password.getAttribute("value"), passwordValue);
    } else {
      Assert.fail();
    }

    WebElement company = driver.findElement(By.name("company"));
    if (company.isEnabled()) {
      String companyValue = "Coders Lab";

      System.out.println("Company field name: " + company.getAttribute("name"));
      company.clear();
      company.sendKeys(companyValue);

      Assert.assertEquals(
          "Last name text should be set to " + companyValue + ", but is " + company
              .getAttribute("value"),
          company.getAttribute("value"), companyValue);
    } else {
      Assert.fail();
    }

    WebElement comment = driver.findElement(By.name("comment"));
    if (comment.isEnabled()) {
      String commentValue = "To jest mój pierwszy automat testowy.";

      System.out.println("Comment field name: " + comment.getAttribute("name"));
      comment.clear();
      comment.sendKeys(commentValue);

      Assert.assertEquals(
          "Last name text should be set to " + commentValue + ", but is " + comment
              .getAttribute("value"),
          comment.getAttribute("value"), commentValue);
    } else {
      Assert.fail();
    }

    comment.submit();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
