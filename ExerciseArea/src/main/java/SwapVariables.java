public class SwapVariables {


    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " b = " + b);

        // Explanation: We save a in a temporary variable, move b into a, and then move the saved value into b.
    }



}
