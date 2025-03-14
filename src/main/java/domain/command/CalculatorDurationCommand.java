package domain.command;

import domain.TimerCalculator;
import presentation.OutputFormatter;

import java.time.Duration;

import java.time.LocalTime;

public class CalculatorDurationCommand implements Command{

    private OutputFormatter outputFormatter;
    private TimerCalculator timerCalculator;
    private LocalTime horarioEntrada;
    private LocalTime horarioSaida;

    public CalculatorDurationCommand(OutputFormatter outputFormatter, TimerCalculator timerCalculator, LocalTime horarioEntrada, LocalTime horarioSaida) {
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
    }

    @Override
    public void execute() {

        Duration duracao = timerCalculator.calcularDuracao(horarioEntrada, horarioSaida);
        outputFormatter.exibirDuracao(duracao);

    }
}
