package a_Zadania.zadanie3;

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

public class UserRegistrationImproved {

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
      System.out.println("First  name field name: " + firstName.getAttribute("name"));
      firstName.clear();
      firstName.sendKeys("Karol");
    } else {
      Assert.fail();
    }

    WebElement lastName = driver.findElement(By.name("lastName"));
    if (lastName.isEnabled()) {
      System.out.println("Last name field name: " + lastName.getAttribute("name"));
      lastName.clear();
      lastName.sendKeys("Kowalski");
    } else {
      Assert.fail();
    }

    // WebElement gender = driver.findElements(By.name("gender")).get(0);
    WebElement gender = driver.findElement(By.xpath("//label[text()='Male']/input"));
    if (gender.isDisplayed()) {
      System.out.println("Gender field name: " + gender.getAttribute("name"));
      gender.click();
    } else {
      Assert.fail();
    }

    WebElement dateOfBirth = driver.findElement(By.name("dob"));
    if (dateOfBirth.isEnabled()) {
      System.out.println("Date of birth field name: " + dateOfBirth.getAttribute("name"));
      dateOfBirth.clear();
      dateOfBirth.sendKeys("05/22/2010" + Keys.ESCAPE);
    } else {
      Assert.fail();
    }

    WebElement address = driver.findElement(By.name("address"));
    if (address.isEnabled()) {
      System.out.println("Address field name: " + address.getAttribute("name"));
      address.clear();
      address.sendKeys("Prosta 51");
    } else {
      Assert.fail();
    }

    WebElement email = driver.findElement(By.name("email"));
    if (email.isEnabled()) {
      System.out.println("Email field name: " + email.getAttribute("name"));
      email.clear();
      email.sendKeys("karol.kowalski@mailinator.com");
    }else {
      Assert.fail();
    }

    WebElement password = driver.findElement(By.name("password"));
    if (password.isEnabled()) {
      System.out.println("Password field name: " + password.getAttribute("name"));
      password.clear();
      password.sendKeys("Pass123");
    } else {
      Assert.fail();
    }

    WebElement company = driver.findElement(By.name("company"));
    if (company.isEnabled()) {
      System.out.println("Company field name: " + company.getAttribute("name"));
      company.clear();
      company.sendKeys("Coders Lab");
    } else {
      Assert.fail();
    }

    WebElement comment = driver.findElement(By.name("comment"));
    if (comment.isEnabled()) {
      System.out.println("Comment field name: " + comment.getAttribute("name"));
      comment.clear();
      comment.sendKeys("To jest mój pierwszy automat testowy.");
    } else {
      Assert.fail();
    }


    //additional fields
    //Job expectation select
    Select jobExpectation = new Select(driver.findElement(By.id("expectation")));
    jobExpectation.selectByVisibleText("Challenging");

    // Ways of development radio buttons
    final String[] developmentWaysLabels = {"Read books", "Join tech cons"};

    for(String wayLabel : developmentWaysLabels) {
      driver.findElement(By.xpath("//label[text()='" + wayLabel + "']/input")).click();
    }

    comment.submit();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
