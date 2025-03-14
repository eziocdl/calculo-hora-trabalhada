package presentation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputHandler {
    private Scanner scanner;
    private DateTimeFormatter formatter;


    // Constructor Scanner para receber a entrada do usuário
    public InputHandler() {
        this.scanner = new Scanner(System.in);
        this.formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    public LocalDateTime obterHorarioEntrada() {

        // chamando o método auxiliar
        return obterHorario("Digite o horário de entrada (HH:mm:ss): ");


    }

    public LocalDateTime obterHorarioSaida(LocalDateTime horarioEntrada) {
        while (true) {
            LocalDateTime horarioSaida = obterHorario("\"Digite o horário de entrada (HH:mm:ss): ");

            if (horarioSaida.isAfter(horarioEntrada)) {
                return horarioSaida;
            } else {
                System.out.println("Horário de saída deve ser posterior ao horário de entrada:");
            }
        }
    }

    // metodo auxiliar usado para evitar código duplicado Dry(Don't repeat yourself)

    private LocalDateTime obterHorario(String mensagem) {
        while (true) {
            System.out.println(mensagem);
            String entrada = scanner.nextLine();

            // validação da entrada

            if (entrada == null || entrada.trim().isEmpty()) {
                System.out.println("Entrada não pode serr vazia");
                continue;
            }

            try {

                // validando formato
                return LocalDateTime.parse(entrada, formatter);

            } catch (DateTimeParseException e) {
                System.out.println("Formato inválido. Use HH: mm:ss.");
            }
        }
    }


}
