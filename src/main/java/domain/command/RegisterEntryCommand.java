package domain.command;

import lombok.Getter;
import presentation.InputHandler;
import presentation.OutputFormatter;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class RegisterEntryCommand implements Command{
    private InputHandler inputHandler;
    private OutputFormatter outputFormatter;
    @Getter
    private LocalTime horarioEntrada;

    // constructor


    public RegisterEntryCommand(InputHandler inputHandler, OutputFormatter outputFormatter) {
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
    }

    @Override
    public void execute() {
        horarioEntrada = inputHandler.obterHorarioEntrada();
        outputFormatter.exibirMensagem("Horário de entrada foi registrado.");


    }

}
