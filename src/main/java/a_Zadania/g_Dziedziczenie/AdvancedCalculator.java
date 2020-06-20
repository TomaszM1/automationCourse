package a_Zadania.g_Dziedziczenie;

import a_Zadania.d_Konstruktor.Calculator;

public class AdvancedCalculator extends Calculator {

  public double pow(double num1, double num2) {
    double result = Math.pow(num1, num2);
    addElementToArray(num1 + " ^ " + num2 + " equals " + result, this.results);

    return result;
  }

  public double root(double num1, double num2) {
    double result = Math.pow(num1, 1.0 / num2);
    addElementToArray(num1 + " root of " + num2 + " equals " + result, this.results);

    return result;
  }

}
