package controller;

import domain.Invoker;
import domain.TimerCalculator;
import domain.command.Command;
import domain.command.RegisterEntryCommand;
import domain.command.RegisterExitCommand;
import presentation.InputHandler;
import presentation.Menu;
import presentation.OutputFormatter;


import java.time.LocalTime;

public class Controller {

    private Menu menu;
    private InputHandler inputHandler;
    private OutputFormatter outputFormatter;
    private TimerCalculator timerCalculator;
    private Invoker invoker;
    private LocalTime horarioEntrada;


    public Controller(Menu menu, InputHandler inputHandler, OutputFormatter outputFormatter, TimerCalculator timerCalculator, Invoker invoker) {
        this.menu = menu;
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;
        this.invoker = invoker;
    }

    public Controller() {

    }

    public void iniciar() {
        while (true) {
            int opcao = menu.exibirMenu();

            switch (opcao) {
                case 1:
                    Command registerEntryCommand = new RegisterEntryCommand(inputHandler, outputFormatter);
                    invoker.executarComando(registerEntryCommand);
                    horarioEntrada = ((RegisterEntryCommand) registerEntryCommand).getHorarioEntrada();
                    break;
                case 2:
                    if (horarioEntrada == null) {
                        outputFormatter.exibirMensagem("Registre o horário de entrada: ");
                        break;
                    }
                    Command registerExitCommand = new RegisterExitCommand(inputHandler, outputFormatter, timerCalculator, horarioEntrada);
                    invoker.executarComando(registerExitCommand);
                    break;
                case 3:
                    outputFormatter.exibirMensagem("Encerrando o aplicativo.");
                    return;
                default:
                    outputFormatter.exibirMensagem("Opção Inválida");
            }
        }
    }
}