package a_Zadania.a_Pierwsza_klasa;


public class Main1 {

  public static void main(String[] args) {
    Cat cat = new Cat();
    Dog dog = new Dog();

    if (cat.equals(dog)) {
      System.out.println("Cat is equal to Dog");
    } else {
      System.out.println("Cat is NOT equal to Dog");
    }
  }
}
