package pckg2;

public class Test {

    public int publicVariable = 10;
    private int privateVariable = 20;
    protected int protectedVariable = 30;
    int defaultVariable = 40;

    public static void main(String[] args) {

        Test obj4  = new Test();

        //Aici putem accessat modified de tip: public, private, protected, default,
        System.out.println(obj4.publicVariable); //Accessible within the class
        System.out.println(obj4.privateVariable); //Accessible within the class
        System.out.println(obj4.protectedVariable);//Accessible within the class
        System.out.println(obj4.defaultVariable); //Accessible within the class



    }


}
