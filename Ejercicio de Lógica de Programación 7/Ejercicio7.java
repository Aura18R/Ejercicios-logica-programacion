import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio7{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Solicitar día de la semana
        System.out.print("Ingrese un día de la semana (Lunes-Viernes): ");
        String dia = sc.nextLine().toLowerCase();
        
        // Verificar que el día de la semana sea válido
        while (!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles")
                && !dia.equals("jueves") && !dia.equals("viernes")) {
            System.out.print("Día inválido. Ingrese un día de la semana (Lunes-Viernes): ");
            dia = sc.nextLine().toLowerCase();
        }
        
        // Solicitar hora
        System.out.print("Ingrese la hora (formato HH:MM): ");
        String horaString = sc.nextLine();
        LocalTime hora = null;
        try {
            hora = LocalTime.parse(horaString);
        } catch (Exception e) {
            System.out.println("Hora inválida.");
            System.exit(0);
        }
        
        // Obtener la hora de corte (Viernes a las 15:00 hrs)
        LocalDateTime horaCorte = LocalDateTime.now().with(DayOfWeek.FRIDAY).withHour(15).withMinute(0).withSecond(0);
        if (LocalDateTime.now().isAfter(horaCorte)) {
            horaCorte = horaCorte.plusDays(7);
        }
        
        // Obtener la fecha del próximo día de la semana ingresado por el usuario
        LocalDateTime fecha = LocalDateTime.now().with(DayOfWeek.valueOf(dia.toUpperCase()));
        if (fecha.isBefore(LocalDateTime.now())) {
            fecha = fecha.plusDays(7);
        }
        
        // Combinar fecha y hora
        LocalDateTime fechaHora = LocalDateTime.of(fecha.toLocalDate(), hora);
        
        // Calcular la diferencia de minutos entre la fecha/hora ingresada y la hora de corte
        long minutosFaltantes = fechaHora.until(horaCorte, ChronoUnit.MINUTES);
        
        // Mostrar resultado
        System.out.println("Faltan " + minutosFaltantes + " minutos para el fin de semana.");
        
        sc.close();
    }

}