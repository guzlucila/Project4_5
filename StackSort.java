import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * This program has been reused and modified from CSC6013, translated from Python to Java.
 * This program reads integers from standard input,
 * stores them in a Stack sorted in ascending order,
 * and displays the contents of the Stack by popping elements.
 *
 * The program is made to execute on the command line.
 *
 * @author Lucila Guzman
 * @version 1.0.0
 */
public class StackSort {

    /**
     * Reads integers from the user and returns a Stack with elements sorted in ascending order.
     * @param scanner Scanner object for reading input
     * @return Stack of integers sorted in ascending order
     */
    public static Stack<Integer> getData(Scanner scanner) {
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Please enter integers separated by spaces and press enter when done:");
        String[] input = scanner.nextLine().split("\\s+");

        for (String str : input) {
            numbers.add(Integer.parseInt(str));
        }

        Collections.sort(numbers); // Sorts the list in ascending order

        Stack<Integer> stack = new Stack<>();
        // Push elements onto the stack so the smallest is on top
        for (int i = numbers.size() - 1; i >= 0; i--) {
            stack.push(numbers.get(i));
        }

        return stack;
    }

    /**
     * Prints the contents of the Stack from smallest to largest by popping elements.
     * @param stack Stack of integers
     */
    public static void printStack(Stack<Integer> stack) {
        System.out.println("Your Stack (smallest to largest):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    /**
     * Main method to execute program.
     * @param args command line arguments - not used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> numbers = getData(scanner);
        printStack(numbers);
        scanner.close();
    }
}
