package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  private static WebDriver driver;

  @FindBy(name="email") WebElement loginInput;
  @FindBy(name="password") WebElement passwordInput;
  @FindBy(id="submit-login") WebElement signInButton;
  @FindBy(xpath="//a[@class='account']") WebElement userName;

  public LoginPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public UserInfoPage loginAs(String email, String password) {
    loginInput.click();
    loginInput.clear();
    loginInput.sendKeys(email);

    passwordInput.click();
    passwordInput.clear();
    passwordInput.sendKeys(password);

    signInButton.click();

    return new UserInfoPage(driver);
  }

  public String getLoggedUsername() {
    return userName.getText();
  }
}
