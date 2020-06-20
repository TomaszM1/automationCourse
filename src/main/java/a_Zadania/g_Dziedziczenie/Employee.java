package a_Zadania.g_Dziedziczenie;


public class Employee {

  public int id;
  public String firstName;
  public String lastName;
  public int wage;

  Employee(int id, String firstName, String lastName, int wage) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.wage = wage;
  }

  protected void raiseWage(int percent, int wage) {
    if (percent >= 0) {
      this.wage = (percent * wage) / 100;
    } else {
      throw new IllegalArgumentException();
    }
  }
}
