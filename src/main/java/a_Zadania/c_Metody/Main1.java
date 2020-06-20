package a_Zadania.c_Metody;


import java.sql.SQLOutput;

public class Main1 {

  public static void main(String[] args) {
    Person person = new Person();
    Car car = new Car();

    person.setName("Adam");
    person.setSurname("Michalski");
    person.setAge(12);
    person.setGender('M');

    System.out.println("Name: " + person.getName());
    System.out.println("Surname: " + person.getSurname());
    System.out.println("Age: " + person.getAge());
    System.out.println("Gender: " + person.getGender());

    System.out.println("Full name:" + person.getFullName());

    person.increaseAge();
    System.out.println("Increased age: " + person.getAge());
  }

}
