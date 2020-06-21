package a_Zadania.zadanie1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearch {
  private WebDriver driver;

  @Before
  public void setUp() {
    //point chromedriver.exe file location
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

    driver = new ChromeDriver(); // create chromedriver object
    driver.manage().window().maximize(); // maximize browser screen
    driver.get("http://www.bing.com"); // open browser with given url
  }

  @Test
  public void testBingSearch() {
    WebElement element = driver.findElement(By.name("q"));
    element.clear();
    element.sendKeys("Mistrzostwa Świata w piłce nożnej 2018");
    element.submit();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
}
