package controller;

import domain.TimerCalculator;
import presentation.InputHandler;
import presentation.Menu;
import presentation.OutputFormatter;

import java.time.Duration;
import java.time.LocalDateTime;

public class Controller{

    private Menu menu;
    private InputHandler inputHandler;
    private OutputFormatter outputFormatter;
    private TimerCalculator timerCalculator;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;

    public Controller(Menu menu, InputHandler inputHandler, OutputFormatter outputFormatter, TimerCalculator timerCalculator) {
        this.menu = menu;
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;

    }

    // método

    public void iniciar() {

        // menu repetir até o usuário clicar em sair
        while (true) {
            int opcao = menu.exibirMenu();

            switch (opcao) {
                case 1:
                   horarioEntrada = inputHandler.obterHorarioEntrada();
                   outputFormatter.exibirMensagem("Horário de entrada registrado.");
                   break;
                case 2:
                    if (horarioEntrada == null) {
                        outputFormatter.exibirMensagem("Registre o horário de entrada: ");
                        break;
                    }
                    horarioSaida = inputHandler.obterHorarioSaida(horarioEntrada);
                    Duration duracao = timerCalculator.calcularDuracao(horarioEntrada, horarioSaida);
                    outputFormatter.exibirDuracao(duracao);
                    break;
                case 3:
                    outputFormatter.exibirMensagem("Encerrando o aplicativo.");

                    // encerra o aplicativo
                    return;

                    // opcao inválida
                default:
                outputFormatter.exibirMensagem("Opção Inválida");
            }
        }
    }
}
