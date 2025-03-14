package domain.command;

import domain.TimerCalculator;
import presentation.OutputFormatter;

import java.time.Duration;
import java.time.LocalTime;

public class CalculatorDurationCommand implements Command {

    private OutputFormatter outputFormatter;
    private TimerCalculator timerCalculator;
    private LocalTime entryTime;
    private LocalTime exitTime;

    public CalculatorDurationCommand(OutputFormatter outputFormatter, TimerCalculator timerCalculator, LocalTime entryTime, LocalTime exitTime) {
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
    }

    @Override
    public void execute() {
        Duration duration = timerCalculator.calculateDuration(entryTime, exitTime);
        outputFormatter.displayDuration(duration);
    }
}