package domain.command;

import domain.TimerCalculator;
import presentation.InputHandler;
import presentation.OutputFormatter;

import java.time.Duration;
import java.time.LocalTime;

public class RegisterExitCommand implements Command {

    private InputHandler inputHandler;
    private OutputFormatter outputFormatter;
    private TimerCalculator timerCalculator;
    private LocalTime entryTime;
    private LocalTime exitTime;

    public RegisterExitCommand(InputHandler inputHandler, OutputFormatter outputFormatter, TimerCalculator timerCalculator, LocalTime entryTime) {
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;
        this.entryTime = entryTime;
    }

    @Override
    public void execute() {
        exitTime = inputHandler.getExitTime(entryTime);
        Duration duration = timerCalculator.calculateDuration(entryTime, exitTime);
        outputFormatter.displayDuration(duration);
    }
}