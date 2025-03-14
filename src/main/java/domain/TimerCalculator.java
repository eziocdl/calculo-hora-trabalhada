package domain;

import java.time.Duration;
import java.time.LocalTime;

public class TimerCalculator {
    public Duration calcularDuracao(LocalTime horarioEntrada, LocalTime horarioSaida) {
        if(horarioEntrada == null || horarioSaida == null) {
            // retorna null se os horários não foram registrados
            return null;
        }

        return Duration.between(horarioEntrada, horarioSaida);
    }
}
