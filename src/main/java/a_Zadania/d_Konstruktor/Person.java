package a_Zadania.d_Konstruktor;

public class Person {

  private String name;
  private String surname;
  private int age;
  private char gender;

  Person(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  Person(String name, String surname, int age, char gender) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.gender = gender;
  }
}
