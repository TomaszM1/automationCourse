package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
  static WebDriver driver;

  static {
    System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }
}
