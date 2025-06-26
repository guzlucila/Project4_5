import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * This program has been reused and modified from CSC6013, translated from python to java.
 * This program reads integers from standard input,
 * stores them in a LinkedList sorted in ascending order,
 * and displays the contents of the list.
 *
 * The program is made to execute on the command line.
 *
 * @author Lucila Guzman
 * @version 1.0.0
 */
public class linkedList {

    /**
     * Reads integers from the user and returns a sorted LinkedList.
     * @param scanner Scanner object for reading input
     * @return LinkedList of integers sorted in ascending order
     */
    public static LinkedList<Integer> getData(Scanner scanner) {
        LinkedList<Integer> numbers = new LinkedList<>();
        
        System.out.println("Please enter integers separated by spaces and press enter when done:");
        String[] input = scanner.nextLine().split("\\s+");
        
        for (String str : input) {
            numbers.add(Integer.parseInt(str));
        }

        Collections.sort(numbers); // Sorts the list in ascending order
        return numbers;
    }

    /**
     * Prints the contents of the LinkedList.
     * @param list LinkedList of integers
     */
    public static void printList(LinkedList<Integer> list) {
        System.out.println("Your Linked List:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Main method to execute program.
     * @param args command line arguments - not used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = getData(scanner);
        printList(numbers);
        scanner.close();
    }
}
