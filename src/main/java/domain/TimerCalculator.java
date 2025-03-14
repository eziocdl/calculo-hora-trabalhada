package domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class TimerCalculator {
    public Duration calcularDuracao(LocalDateTime entrada, LocalDateTime saida) {
        if(entrada == null || saida == null) {
            // retorna null se os horários não foram registrados
            return null;
        }

        return Duration.between(entrada, saida);
    }
}
