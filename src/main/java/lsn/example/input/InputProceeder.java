package lsn.example.input;

import lsn.example.io.PrintService;

import java.io.IOException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class InputProceeder {

    private static InputProceeder instance;
    private final PrintService printService;
    private final InputValidator inputValidator;

    private InputProceeder() {
        printService = PrintService.getInstance();
        inputValidator = InputValidator.getInstance();
    }

    public static InputProceeder getInstance() {
        if (instance == null) {
            instance = new InputProceeder();
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
