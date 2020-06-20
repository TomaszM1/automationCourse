package a_Zadania.g_Dziedziczenie;


public class SalariedEmployee extends Employee {
  private static final int hoursPerMonth = 190;

  SalariedEmployee(int id, String firstName, String lastName, int wage) {
    super(id, firstName, lastName, wage);
  }

  protected int calculatePayment() {
    return wage * hoursPerMonth;
  }
}
