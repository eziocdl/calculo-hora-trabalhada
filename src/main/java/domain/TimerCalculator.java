package domain;

import java.time.Duration;
import java.time.LocalTime;

public class TimerCalculator {

    public Duration calculateDuration(LocalTime entryTime, LocalTime exitTime) { // Método para calcular a duração entre dois horários
        if (entryTime == null || exitTime == null) { // Verifica se os horários são nulos
            // Retorna null se os horários não foram registrados
            return null;
        }

        return Duration.between(entryTime, exitTime); // Calcula e retorna a duração entre os horários
    }
}