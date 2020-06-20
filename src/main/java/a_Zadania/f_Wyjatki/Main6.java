package a_Zadania.f_Wyjatki;


public class Main6 {

  public static void main(String[] args) {
    try {
      System.out.println(divide(4, 2));
    } catch (IllegalArgumentException ex) {
      System.out.println("you can't divide by 0");
    }

  }

  static int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException();
    }
    return a % b;
  }

}
