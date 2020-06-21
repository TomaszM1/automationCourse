package a_Zadania.zadanie1dodatkowe;

import java.util.Random;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RandomProductSearch {
  private WebDriver driver;
  private static final String[] products = {"mug", "t-shirt", "notebook", "bicycle", "book"};

  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://prod-kurs.coderslab.pl");
  }

  @Test
  public void searchRandomProduct() {
    String randomProduct = getRandomArrayElement(products);
    System.out.println("Search product " + randomProduct);

    WebElement element = driver.findElement(By.name("s"));
    element.clear();
    element.sendKeys(randomProduct);
    element.submit();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

  private String getRandomArrayElement(String[] stringArray) {
    Random random = new Random();
    int randomIndex = random.nextInt(stringArray.length);

    return stringArray[randomIndex];
  }
}
