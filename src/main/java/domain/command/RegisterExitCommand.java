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
    private LocalTime horarioEntrada;
    private LocalTime getHorarioSaida;

    public RegisterExitCommand(InputHandler inputHandler, OutputFormatter outputFormatter, TimerCalculator timerCalculator, LocalTime horarioEntrada) {
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;
        this.horarioEntrada = horarioEntrada;
    }


    @Override
    public void execute() {
        getHorarioSaida = inputHandler.obterHorarioSaida(horarioEntrada);
        Duration duracao = timerCalculator.calcularDuracao(horarioEntrada, getHorarioSaida);
        outputFormatter.exibirDuracao(duracao);
    }
}
