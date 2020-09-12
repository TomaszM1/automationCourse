package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

  private static WebDriver driver;

  @FindBy(name = "address1")
  WebElement addressInput;
  @FindBy(name = "city")
  WebElement cityInput;
  @FindBy(name = "postcode")
  WebElement postCodeInput;
  @FindBy(xpath = "//footer/button[@*='submit']")
  WebElement submitAddress;
  @FindBy(xpath = "//article[@*='success']")
  WebElement successAlert;

  public AddressPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  public void setAddress(String address) {
    addressInput.clear();
    addressInput.sendKeys(address);
  }

  public void setCity(String city) {
    cityInput.clear();
    cityInput.sendKeys(city);
  }

  public void setPostCode(String postCode) {
    postCodeInput.clear();
    postCodeInput.sendKeys(postCode);
  }

  public void submitNewAddress() {
    submitAddress.submit();
  }

  public String getSuccessAlertText() {
    return successAlert.getText();
  }
}
