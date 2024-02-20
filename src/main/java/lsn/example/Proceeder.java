package lsn.example;

import lsn.example.io.PrintService;

import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Proceeder {

    private static Proceeder instance;
    private final PrintService printService;

    private Proceeder() {
        printService = PrintService.getInstance();
    }

    public static Proceeder getInstance() {
        if (instance == null) {
            instance = new Proceeder();
        }
        return instance;
    }

    public void processInput(String input) throws NumberFormatException {
        StringTokenizer tokenizer = new StringTokenizer(input);
        int count = tokenizer.countTokens();
        TreeSet<Integer> numbers = new TreeSet<>();
        populateTreeSet(tokenizer, numbers);
        printService.printCorrectOutput(numbers, count);
    }

    private void populateTreeSet(StringTokenizer tokenizer, Set<Integer> numbers) throws NumberFormatException {
        while (tokenizer.hasMoreTokens()) {
            try{
                int number = Integer.parseInt(tokenizer.nextToken());
                numbers.add(number);
            } catch (NumberFormatException exception) {
                throw new NumberFormatException("Input contains a number that is too large!");
            }

        }
    }
}
