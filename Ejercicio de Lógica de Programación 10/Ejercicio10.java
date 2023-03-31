import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Random;
import java.util.Set;

public class Ejercicio10 {

    public static void main(String[] args) {
        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("button", "boton");
        diccionario.put("document", "documento");
        diccionario.put("browser", "navegador");
        diccionario.put("bug", "error");
        diccionario.put("desktop", "escritorio");
        diccionario.put("download", "descargar");
        diccionario.put("link", "enlace");
        diccionario.put("server", "servidor");
        diccionario.put("test", "prueba");
        diccionario.put("upload", "subir");
        diccionario.put("wireless", "inalambrico");
        diccionario.put("execute", "ejecutar");
        diccionario.put("tag", "etiqueta");
        diccionario.put("print", "imprimir");
        diccionario.put("password", "contraseña");
        diccionario.put("keyboard", "teclado");
        diccionario.put("file", "archivo");
        diccionario.put("erase", "borrar");
        diccionario.put("system", "sistema");
        diccionario.put("develop", "desarrollar");

        // Elegir 5 palabras al azar del diccionario
        String[] palabras = {"attachment", "backup", "browser", "bug", "desktop", "download", "link",  "server",  "test",  "upload",  "wireless", "username",  "tag", "print", "password", "keyboard", "file", "erase",  "system",  "develop"};
        String[] palabrasSeleccionadas = new String[5];
        Set<Integer> indicesSeleccionados = new HashSet<>();
        Random random = new Random();


        
        for (int i = 0; i < 5; i++) {
            int indice;
            do { //el do es para no tener indices repetidos generados por el random
                indice = random.nextInt(palabras.length);
            } while (indicesSeleccionados.contains(indice));
            palabrasSeleccionadas[i] = palabras[indice];
            indicesSeleccionados.add(indice);
        }

        // Pedir al usuario que ingrese la traducción al inglés de cada una de las palabras seleccionadas
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;
        for (int i = 0; i < palabrasSeleccionadas.length; i++) {
            String palabra = palabrasSeleccionadas[i];
            System.out.print("Traducción de '" + palabra + "': ");
            String respuesta = scanner.nextLine();
            String traduccion = diccionario.get(palabra);
            if (respuesta.equals(traduccion)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto, la respuesta correcta es: " + traduccion);
                respuestasIncorrectas++;
            }
        }

        // Mostrar al usuario cuántas respuestas tuvo correctas e incorrectas
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);
    }
}

