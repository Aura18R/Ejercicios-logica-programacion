import java.util.Scanner;
import java.util.*;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar al usuario 10 números por consola y almacenarlos en un array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un número entero: ");
            numeros[i] = sc.nextInt();
        }

        // Colocar todos los números primos a las primeras posiciones, desplazando el resto al final de forma que ningún número se pierda
        int[] numerosPrimos = new int[10];
        int[] numerosNoPrimos = new int[10];
        int contadorPrimos = 0;
        int contadorNoPrimos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                numerosPrimos[contadorPrimos] = numeros[i];
                contadorPrimos++;
            } else {
                numerosNoPrimos[contadorNoPrimos] = numeros[i];
                contadorNoPrimos++;
            }
        }

        // Combinar los dos arreglos en uno solo
        int[] numerosOrdenados = new int[numeros.length];
        System.arraycopy(numerosPrimos, 0, numerosOrdenados, 0, contadorPrimos);
        System.arraycopy(numerosNoPrimos, 0, numerosOrdenados, contadorPrimos, contadorNoPrimos);

        // Mostrar por consola el array que contiene los números primos al inicio, mostrando el índice seguido del valor de la posición
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println("pos[" + i + "] = " + numerosOrdenados[i]);
        }
    }

    // Método para determinar si un número es primo o no
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
