import java.util.Scanner;

public class Ejercicio6 { 

    public static String cadenaReves(String cadena) {
		StringBuilder cadenaBuilder = new StringBuilder(cadena);
		cadenaBuilder.reverse();
		String cadenaReversa = cadenaBuilder.toString();
		
		return cadenaReversa;
	}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase; ");
        String frase = scanner.nextLine();
        String cadena = cadenaReves(frase);
        System.out.println(cadena);
        scanner.close();
    }

}