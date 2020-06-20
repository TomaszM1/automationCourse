package a_Zadania.f_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        try {
            showLength(null);
        } catch (NullPointerException e) {
            System.out.println("given parameter is null");
        }

    }

    static void showLength(String s) {
        System.out.println(s.length());
    }

}
