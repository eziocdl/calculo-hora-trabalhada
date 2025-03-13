package presentation;

import java.util.Scanner;

public class Menu {


   // objeto para ler a entrada do usuário
    private Scanner scanner;


 // Constructor da classe menu para iniciar o Scanner com a entrada do usuário
    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    // método de exibição do menu para obter a opção do usuário
    public int exibirMenu(){
        System.out.println("1. Registrar Entrada");
        System.out.println("2. Registrar Saída");
        System.out.println("3. Sair");


        // metodo obter opcao válida
        int opcao = obterOpcaoValida();
        return opcao;
    }

    private int obterOpcaoValida() {
        while(true) {
            System.out.println("Escolha uma opção: ");

            if(scanner.hasNextInt()) {
                int opcao = scanner.nextInt();

                if(opcao >=1 && opcao <=3) {
                    return opcao;
                }else{
                    System.out.println("Opção inválida. Digite os números entre 1 e 3");
                }
            }else {
                System.out.println("Opção inválida. Digite um número inteiro.");
            }
        }
    }

}
