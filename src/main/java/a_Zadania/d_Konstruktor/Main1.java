package a_Zadania.d_Konstruktor;


import a_Zadania.c_Metody.Car;
import a_Zadania.c_Metody.Person;

public class Main1 {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Calculator calculator2 = new Calculator();

    calculator.multiply(1, 2);
    calculator.add(12, 4);
    calculator.divide(0, 9);
    calculator.multiply(3, 4);
    calculator.substract(7, 5);

    calculator2.multiply(7, 3);
    calculator2.add(9, 4);
    calculator2.divide(4, 9);
    calculator2.multiply(7, 4);

    System.out.println("calculator results:");
    calculator.printResults();
    System.out.println("---");

    System.out.println("calculator2 results:");
    calculator2.printResults();
    System.out.println("---");

    System.out.println("clear calculator results:");
    calculator.clearResults();

    System.out.println("calculator results:");
    calculator.printResults();
    System.out.println("---");

    System.out.println("calculator2 results:");
    calculator2.printResults();
    System.out.println("---");
  }

}
