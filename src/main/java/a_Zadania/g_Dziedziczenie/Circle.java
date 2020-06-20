package a_Zadania.g_Dziedziczenie;

public class Circle extends Shape {
  //NIE ROZUMIEM TEGO ZADANIA
  private double radius;

  Circle(int x, int y, String color, double radius) {
    super(x, y, color);
    this.radius = radius;
  }

  @Override
  public String getDescription() {
    return "Circle shape description";
  }

  protected double getArea(double radius) {
    return Math.PI * Math.pow(radius,2);
  }

  protected double getCircuit(double radius) {
    return 2 * Math.PI * radius;
  }
}
