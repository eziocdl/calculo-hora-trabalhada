package presentation;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // Exibe o menu e obtém a opção do usuário
    public int displayMenu() {
        System.out.println("1. Registro de entrada: ");
        System.out.println("2. Registro de saída: ");
        System.out.println("3. Sair");

        // Obtém uma opção válida do usuário

        int option = getValidOption();
        return option;
    }

    // Obtém uma opção válida do usuário

    private int getValidOption() {
        while (true) {
            System.out.print(" Escolha a opção: ");

            if (scanner.hasNextInt()) {
                int option = scanner.nextInt();
                scanner.nextLine();

                if (option >= 1 && option <= 3) {
                    return option;
                } else {
                    System.out.println("Opção inválida. Escolhe o número entre 1 e 3.");
                }
            } else {
                System.out.println("Opçãi inválida. Digite um número inteiro.");
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }
}