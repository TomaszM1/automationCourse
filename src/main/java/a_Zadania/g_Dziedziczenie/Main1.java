package a_Zadania.g_Dziedziczenie;


import a_Zadania.d_Konstruktor.Calculator;

public class Main1 {

  public static void main(String[] args) {
    AdvancedCalculator advancedCalculator = new AdvancedCalculator();

    advancedCalculator.multiply(1, 2);
    advancedCalculator.add(12, 4);
    advancedCalculator.divide(0, 9);
    advancedCalculator.pow(8, 3);
    advancedCalculator.multiply(3, 4);
    advancedCalculator.root(8, 3);
    advancedCalculator.substract(7, 5);



    System.out.println("calculator results:");
    advancedCalculator.printResults();
    System.out.println("---");



    System.out.println("clear calculator results:");
    advancedCalculator.clearResults();

    System.out.println("calculator results:");
    advancedCalculator.printResults();
    System.out.println("---");
  }

}
