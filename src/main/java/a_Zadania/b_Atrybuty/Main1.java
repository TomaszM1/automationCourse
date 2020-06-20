package a_Zadania.b_Atrybuty;


public class Main1 {

    public static void main(String[] args) {
        //1. create AccessModifier object
        AccessModifier testAttribute = new AccessModifier();

        //2. check availabe attributes
        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);
        //private attribute is non accessible
    }
}
