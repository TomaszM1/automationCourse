package a_Zadania.c_Metody;

public class Person {

  private String name = "Anna";
  private String surname = "Nowak";
  private int age = 30;
  private char gender = 'F';

  public void increaseAge() {
    ++this.age;
  }

  // getter methods
  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public char getGender() {
    return gender;
  }

  public String getFullName() {
    return this.name + " " + this.surname;
  }

  // setter methods
  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }
}
