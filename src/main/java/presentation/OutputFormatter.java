package presentation;

import java.time.Duration;

public class OutputFormatter {

    public void exibirDuracao(Duration duration){
        long horas = duration.toHours();
        long minutos = duration.toMinutesPart();
        System.out.println("Duração: " + horas + " horas e " + minutos + " minutos");
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
