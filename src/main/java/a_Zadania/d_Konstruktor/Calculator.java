package a_Zadania.d_Konstruktor;

public class Calculator {

  private int numberOfResults = 0;
  protected String[] results;

  public Calculator() {
    results = new String[numberOfResults];
  }

  public double add(double num1, double num2) {
    double result = num1 + num2;
    addElementToArray("added " + num1 + " to " + num2 + " got " + result, this.results);

    return result;
  }

  public double multiply(double num1, double num2) {
    double result = num1 * num2;
    addElementToArray("multiplied " + num1 + " to " + num2 + " got " + result, this.results);

    return result;
  }

  public double substract(double num1, double num2) {
    double result = num1 - num2;
    addElementToArray("subtracted " + num1 + " to " + num2 + " got " + result, this.results);

    return result;
  }

  public double divide(double num1, double num2) {
    double result = num1 / num2;
    addElementToArray("divided " + num1 + " to " + num2 + " got " + result, this.results);

    return result;
  }


  public void printResults() {
    for (String result : this.results) {
      System.out.println("result: " + result);
    }
  }

  public void clearResults() {
    this.results = new String[0];
  }

  protected void addElementToArray(String element, String[] results) {
    String[] tempArray = {element};
    this.results = new String[++numberOfResults];

    System.arraycopy(results, 0, this.results, 0, results.length);
    System.arraycopy(tempArray, 0, this.results, results.length, 1);
  }
}
