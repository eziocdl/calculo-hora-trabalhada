package application;

import controller.Controller;
import domain.Invoker;
import domain.TimerCalculator;
import presentation.InputHandler;
import presentation.Menu;
import presentation.OutputFormatter;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        InputHandler inputHandler = new InputHandler();
        OutputFormatter outputFormatter = new OutputFormatter();
        TimerCalculator timerCalculator = new TimerCalculator();
        Invoker invoker = new Invoker();

        Controller controller = new Controller(menu, inputHandler, outputFormatter, timerCalculator, invoker);
        controller.start();
    }
}
