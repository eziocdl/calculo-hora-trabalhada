package presentation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputHandler {

    private Scanner scanner;
    private DateTimeFormatter formatter;
    private Pattern pattern = Pattern.compile("^\\d{2}:\\d{2}:\\d{2}$");

    public InputHandler() {
        this.scanner = new Scanner(System.in);
        this.formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    public LocalTime getTime(String message) {
        LocalTime time = null;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(message + " (HH:mm:ss) - Ex: 12:30:45: ");
            String input = scanner.nextLine().replaceAll("\\s+", "");

            if (pattern.matcher(input).matches()) {
                try {
                    time = LocalTime.parse(input, formatter);
                    validInput = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid format. Use HH:mm:ss. Example: 12:30:45");
                } catch (Exception e) {
                    System.out.println("Unexpected error: " + e.getMessage());
                }
            } else {
                System.out.println("Invalid format. Use HH:mm:ss. Example: 12:30:45");
            }
        }

        return time; // Retorna o horário obtido
    }

    public LocalTime getEntryTime() {
        return getTime("Enter entry time: ");
    }

    public LocalTime getExitTime(LocalTime entryTime) {
        return getTime("Enter exit time: ");
    }

}