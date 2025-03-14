package domain.command;

import lombok.Getter;
import presentation.InputHandler;
import presentation.OutputFormatter;

import java.time.LocalTime;

public class RegisterEntryCommand implements Command {

    private InputHandler inputHandler;
    private OutputFormatter outputFormatter;
    @Getter
    private LocalTime entryTime;

    // Construtor
    public RegisterEntryCommand(InputHandler inputHandler, OutputFormatter outputFormatter) {
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
    }

    @Override
    public void execute() {
        entryTime = inputHandler.getEntryTime();
        outputFormatter.displayMessage("Entry time registered.");
    }
}


