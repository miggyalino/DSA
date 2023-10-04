import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<Integer> remainderStack = new Stack<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Input Integer: ");
        int number = input.nextInt();

        System.out.println("Base: ");
        int base = input.nextInt();

        char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q' };

        int result = number;

        if (result == 0) {
            System.out.println("0");
            return;
        }
        while (result > 0) {
            int remainder = result % base;
            result = result / base;
            remainderStack.push(remainder);
        }
        while (!remainderStack.isEmpty()) {
            int digit = remainderStack.pop();
            System.out.print(digits[digit]);
        }
        System.out.println();
    }
}
