package a_Zadania.f_Wyjatki;


public class Main5 {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt("xyz");
            System.out.println(num);
        } catch (NumberFormatException ex) {
            System.out.println("given param is not a number");
        }

    }

}
