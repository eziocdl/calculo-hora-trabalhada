package domain;

import domain.command.Command;

public class Invoker {

    public void executeCommand(Command command) { // Método para executar um comando
        command.execute(); // Executa o comando
    }
}
