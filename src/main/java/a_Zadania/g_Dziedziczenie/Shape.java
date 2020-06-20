package a_Zadania.g_Dziedziczenie;

public class Shape {
  private int x;
  private int y;
  private String color;

  //NIE ROZUMIEM TEGO ZADANIA
  Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  protected String getDescription() {
    return "Middle of shape: " + this.x + ", " + this.y + ". Color: " + this.color;
  }

  private double getDistance(Shape shape) {
    return 4.0;
  }

}
