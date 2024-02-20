package lsn.example;

import lsn.example.io.InputValidator;
import lsn.example.io.PrintService;
import lsn.example.io.ReadService;

public class Main {

    public static void main(String[] args) {
        //init singleton instances
        PrintService printService = PrintService.getInstance();
        ReadService readService = ReadService.getInstance();
        Proceeder proceeder = Proceeder.getInstance();
        InputValidator inputValidator = InputValidator.getInstance();

        //run app in a loop
        while (true) {
            try {
                String input = readService.readInput();
                inputValidator.validateInput(input);
                if (input.equalsIgnoreCase("exit")) {
                    printService.printExit();
                    break;
                }
                proceeder.processInput(input);
            } catch (Exception exception) {
                printService.printExceptionMessage(exception.getMessage());
            }

        }
    }

}
