package a_Zadania.b_Atrybuty;


public class Main2 {

    public static void main(String[] args) {
        //1. create AccessModifier object
        AccessModifier testAttribute = new AccessModifier();

        //2. set AccessModifier attributes values
        testAttribute.protectedAttribute = "protected attribute";
        testAttribute.publicAttribute = "public attribute";

        //3. display all available attributes of AccessModifier
        System.out.println("protectedAttribute: " + testAttribute.protectedAttribute);
        System.out.println("publicAttribute: " + testAttribute.publicAttribute);
    }
}
