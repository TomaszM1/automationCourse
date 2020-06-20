package a_Zadania.g_Dziedziczenie;

public class HourlyEmployee extends Employee {
  HourlyEmployee(int id, String firstName, String lastName, int wage) {
    super(id, firstName, lastName, wage);
  }

  protected int calculatePayment(int hours) {
    return wage * hours;
  }
}
