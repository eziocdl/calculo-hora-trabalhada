package presentation;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InputHandler {
    private Scanner scanner;
    private DateTimeFormatter formatter;
    private Pattern pattern = Pattern.compile("^\\d{2}:\\d{2}:\\d{2}$");

    public InputHandler() {
        this.scanner = new Scanner(System.in);
        this.formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    }

    public LocalTime obterHorario(String mensagem) { // Alterado para LocalTime
        LocalTime horario = null; // Alterado para LocalTime
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensagem + " (HH:mm:ss) - Ex: 12:30:45: ");
            String entrada = scanner.nextLine().replaceAll("\\s+", "");


            if (pattern.matcher(entrada).matches()) {
                try {
                    horario = LocalTime.parse(entrada, formatter); // Alterado para LocalTime.parse
                    entradaValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato inválido. Use HH:mm:ss. Exemplo: 12:30:45");
                } catch (Exception e) {
                    System.out.println("Erro inesperado: " + e.getMessage());
                }
            } else {
                System.out.println("Formato inválido. Use HH:mm:ss. Exemplo: 12:30:45");
            }
        }

        return horario;
    }

    public LocalTime obterHorarioEntrada() { // Alterado para LocalTime
        return obterHorario("Digite o horário de entrada: ");
    }

    public LocalTime obterHorarioSaida(LocalTime horarioEntrada) { // Alterado para LocalTime
        return obterHorario("Digite o horário de saída:");
    }
}