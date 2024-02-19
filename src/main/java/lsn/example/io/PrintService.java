package lsn.example.io;

import java.util.TreeSet;

public class PrintService {

    private static PrintService instance;

    private PrintService() {
    }

    public static PrintService getInstance() {
        if (instance == null) {
            instance = new PrintService();
        }
        return instance;
    }

    public void printEntry() {
        System.out.println("Enter numbers separated by spaces or type 'exit' to quit:");
    }

    public void printExceptionMessage(String message) {
        System.out.println("Wrong Input! " + message + "\n");
    }

    public void printExit() {
        System.out.println("Exiting... \n");
    }

    public void printCorrectOutput(TreeSet<Integer> numbers, int count) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("count: " + count);
        System.out.println("distinct: " + numbers.size());
        System.out.println("min: " + numbers.first());
        System.out.println("max: " + numbers.last());
        System.out.println();
    }

}
