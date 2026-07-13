import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        int number1, number2, sum;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add your first number");
        number1 = scanner.nextInt();
        System.out.println("Add your second number");
        number2 = scanner.nextInt();

        sum = number1 + number2;
        System.out.println("this is the sum " + sum);

    }
}
