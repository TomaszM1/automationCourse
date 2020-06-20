package a_Zadania.f_Wyjatki;


public class Main1 {

  public static void main(String[] args) {
    int number = -1;

    try {
      System.out.println("factional: " + factorial(number));
    } catch (IllegalArgumentException e) {
      System.out.println("Number parameter must be >= 0: " + number);
    }
  }

  static int factorial(int number) {
    if (number >= 0) {
      int result = 1;
      for (int i = 1; i <= number; i++) {
        result *= i;
      }
      return result;
    } else {
      // throw unchecked exception
      throw new IllegalArgumentException();
    }
  }
}
