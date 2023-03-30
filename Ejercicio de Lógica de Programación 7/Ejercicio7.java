
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
//import java.time.temporal.TemporalAdjusters;
import java.time.temporal.ChronoUnit;


public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario el día de la semana y verifica que la entrada sea válida
        DayOfWeek diaSemana = null;
        while (diaSemana == null) {
            System.out.print("Introduce un día de la semana (Lunes - Viernes): ");
            String diaSemanaString = scanner.nextLine().toLowerCase();
            try {
                diaSemana = DayOfWeek.valueOf(diaSemanaString.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Entrada inválida. Por favor, introduce un día de la semana válido.");
            }
        }

        // Solicita al usuario la hora y verifica que la entrada sea válida
        LocalTime hora = null;
        while (hora == null) {
            System.out.print("Introduce una hora (hh:mm): ");
            String horaString = scanner.nextLine().trim();
            try {
                hora = LocalTime.parse(horaString);
            } catch (DateTimeParseException e) {
                System.out.println("Entrada inválida. Por favor, introduce una hora válida en formato hh:mm.");
            }
        }

        scanner.close();

        // Calcula cuántos minutos faltan para el fin de semana
        LocalDateTime horaCorte = LocalDateTime.now().with(DayOfWeek.FRIDAY).withHour(15).withMinute(0).withSecond(0);

        // Combinar fecha y hora
        LocalDateTime fecha = LocalDateTime.now().with(diaSemana);
        LocalDateTime fechaHora = LocalDateTime.of(fecha.toLocalDate(), hora);

        // Calcular la diferencia de minutos entre la fecha/hora ingresada y la hora de corte
        long minutosFaltantes = fechaHora.until(horaCorte, ChronoUnit.MINUTES);
        
        // Mostrar resultado
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
        

/* 
        LocalDateTime ahora = LocalDateTime.now();
        LocalDateTime viernes15 = ahora.withHour(15).withMinute(0).withSecond(0).withNano(0).with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        LocalDateTime siguienteFinDeSemana = ahora.isBefore(viernes15) ? viernes15 : viernes15.plusWeeks(1);
        long minutosFaltantes = ahora.until(siguienteFinDeSemana, ChronoUnit.MINUTES);

        // Muestra el resultado por un mensaje en consola
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana."); */
    }
}