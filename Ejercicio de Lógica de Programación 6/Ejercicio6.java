import java.util.Scanner;

public class Ejercicio6 { 

    //Funcion que recibe una cadena y con el metodo reverse la voltea
    public static String cadenaReves(String cadena) { 
		StringBuilder cadenaBuilder = new StringBuilder(cadena);
		cadenaBuilder.reverse();
		String cadenaReversa = cadenaBuilder.toString();
		
		return cadenaReversa;
	}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase; "); //leemos la cadena que queremos voltear
        String frase = scanner.nextLine();
        String cadena = cadenaReves(frase); //aplicamos la funcion cadenaReves
        System.out.println(cadena); //imprimimos el resultado
        scanner.close();
    }

}