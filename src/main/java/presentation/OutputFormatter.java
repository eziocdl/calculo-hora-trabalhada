package presentation;

import java.time.Duration;

public class OutputFormatter {

    public void displayDuration(Duration duration) {
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        System.out.println("Duration: " + hours + " hours and " + minutes + " minutes");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}