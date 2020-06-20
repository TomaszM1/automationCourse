package a_Zadania.c_Metody;

public class Car {

  private String brand = "Fiat";
  private String model = "Multipla";
  private int price = 30;

  //setters
  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  //getters
  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

  public void getBrandAndPrice() {
    System.out.println("Brand:" + brand + ", price:" + price);
  }
}
