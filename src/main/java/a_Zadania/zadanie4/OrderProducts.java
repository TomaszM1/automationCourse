package a_Zadania.zadanie4;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderProducts {

  private WebDriver driver;

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver
        .get("https://prod-kurs.coderslab.pl/index.php?controller=authentication&back=my-account");
  }

  @Test
  public void searchProducts() {
    signIn("wp1@wp.pl", "123456789");
    chooseProductCategory("Men");
  }

  private void signIn(String userName, String password) {
    driver.findElement(By.name("email")).sendKeys(userName);
    driver.findElement(By.name("password")).sendKeys(password);
    driver.findElement(By.id("submit-login")).click();
  }

  private void chooseProductCategory(String categoryName) {
    driver.findElement(By.xpath("//li/a[contains(text(),'" + categoryName + "')]")).click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
