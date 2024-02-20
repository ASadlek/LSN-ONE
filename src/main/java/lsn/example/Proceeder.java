package lsn.example;

import lsn.example.io.InputValidator;
import lsn.example.io.PrintService;

import java.io.IOException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Proceeder {

    private static Proceeder instance;
    private final PrintService printService;
    private final InputValidator inputValidator;

    private Proceeder() {
        printService = PrintService.getInstance();
        inputValidator = InputValidator.getInstance();
    }

    public static Proceeder getInstance() {
        if (instance == null) {
            instance = new Proceeder();
        }
        return instance;
    }

    public void processInput(String input) throws IOException, NumberFormatException {
        inputValidator.validateInput(input);
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
