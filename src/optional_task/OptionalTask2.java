package optional_task;

import java.util.Scanner;
import java.util.Stack;

public class OptionalTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number you want to fill the stack with: ");

        int number = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        int temp = 1;
        int temp2;
        int stackElement = 0;

        while (number > 0) {
            stack.push(number % 10);
            number /= 10;

        }


        while (!stack.empty()) {
            temp2= stack.pop();

           stackElement = stackElement + temp2 * temp;
            temp*=10;

        }
        System.out.println("The reverse order of digits in the number is: " + stackElement);
    }
}