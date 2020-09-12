package a_Zadania.zadanie2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration {

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
    firstName.clear();
    firstName.sendKeys("Karol");

    WebElement lastName = driver.findElement(By.name("lastName"));
    lastName.clear();
    lastName.sendKeys("Kowalski");

    // WebElement gender = driver.findElements(By.name("gender")).get(0);
    WebElement gender = driver.findElement(By.xpath("//label[text()='Male']/input"));
    gender.click();

    WebElement dateOfBirth = driver.findElement(By.name("dob"));
    dateOfBirth.clear();
    dateOfBirth.sendKeys("05/22/2010" + Keys.ESCAPE);

    WebElement address = driver.findElement(By.name("address"));
    address.clear();
    address.sendKeys("Prosta 51");

    WebElement email = driver.findElement(By.name("email"));
    email.clear();
    email.sendKeys("karol.kowalski@mailinator.com");

    WebElement password = driver.findElement(By.name("password"));
    password.clear();
    password.sendKeys("Pass123");

    WebElement company = driver.findElement(By.name("company"));
    company.clear();
    company.sendKeys("Coders Lab");

    WebElement comment = driver.findElement(By.name("comment"));
    comment.clear();
    comment.sendKeys("To jest mój pierwszy automat testowy.");


    //additional fields
    //Job expectation select
    Select month = new Select(driver.findElement(By.id("expectation")));
    month.selectByValue("12");

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
