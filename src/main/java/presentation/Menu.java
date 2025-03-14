package presentation;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Exibe o menu e obtém a opção do usuário
    public int displayMenu() {
        System.out.println("1. Register Entry");
        System.out.println("2. Register Exit");
        System.out.println("3. Exit");

        // Obtém uma opção válida do usuário

        int option = getValidOption();
        return option;
    }

    // Obtém uma opção válida do usuário

    private int getValidOption() {
        while (true) {
            System.out.print("Choose an option: ");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option >= 1 && option <= 3) {
                    return option;
                } else {
                    System.out.println("Invalid option. Enter a number between 1 and 3.");
                }
            } else {
                System.out.println("Invalid option. Enter an integer.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }
}