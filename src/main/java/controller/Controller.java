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

    private Menu menu; // Menu de opções do aplicativo
    private InputHandler inputHandler; // Lida com a entrada do usuário
    private OutputFormatter outputFormatter; // Formata e exibe a saída para o usuário
    private TimerCalculator timerCalculator; // Calcula a duração do tempo trabalhado
    private Invoker invoker; // Executa os comandos
    private LocalTime entryTime; // Armazena o horário de entrada

    public Controller(Menu menu, InputHandler inputHandler, OutputFormatter outputFormatter, TimerCalculator timerCalculator, Invoker invoker) {
        this.menu = menu;
        this.inputHandler = inputHandler;
        this.outputFormatter = outputFormatter;
        this.timerCalculator = timerCalculator;
        this.invoker = invoker;
    }

    public Controller() {
        // Construtor vazio para permitir a criação de uma instância sem argumentos
    }

    public void start() { // Método para iniciar o aplicativo
        while (true) { // Loop infinito para manter o aplicativo em execução
            int option = menu.displayMenu(); // Exibe o menu e obtém a opção escolhida pelo usuário

            switch (option) {
                case 1: // Opção para registrar o horário de entrada
                    Command registerEntryCommand = new RegisterEntryCommand(inputHandler, outputFormatter); // Cria um comando para registrar a entrada
                    invoker.executeCommand(registerEntryCommand); // Executa o comando
                    entryTime = ((RegisterEntryCommand) registerEntryCommand).getEntryTime(); // Obtém o horário de entrada do comando
                    break;
                case 2: // Opção para registrar o horário de saída
                    if (entryTime == null) { // Verifica se o horário de entrada foi registrado
                        outputFormatter.displayMessage("Escreva primeiro o horário de entrada."); // Exibe uma mensagem informando que o horário de entrada deve ser registrado primeiro
                        break;
                    }
                    Command registerExitCommand = new RegisterExitCommand(inputHandler, outputFormatter, timerCalculator, entryTime); // Cria um comando para registrar a saída
                    invoker.executeCommand(registerExitCommand); // Executa o comando
                    break;
                case 3: // Opção para sair do aplicativo
                    outputFormatter.displayMessage("Saindo do aplicativo."); // Exibe uma mensagem de encerramento
                    return; // Encerra o método e, consequentemente, o aplicativo
                default: // Opção inválida
                    outputFormatter.displayMessage("Opção inválida."); // Exibe uma mensagem de opção inválida
            }
        }
    }
}