import java.util.HashMap;
import java.util.Scanner;


public class Ejercicio9 {

   public static void main(String[] args) {

        // Crear el diccionario Español-Inglés
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("boton","button");
        diccionario.put("documento","document");
        diccionario.put("navegador", "browser");
        diccionario.put("error", "bug");
        diccionario.put("escritorio", "desktop");
        diccionario.put("descargar", "download");
        diccionario.put("enlace", "link");
        diccionario.put("servidor", "server");
        diccionario.put("prueba", "test");
        diccionario.put("subir", "upload");
        diccionario.put("inalambrico", "wireless");
        diccionario.put("ejecutar", "execute");
        diccionario.put("etiqueta", "tag");
        diccionario.put("imprimir", "print");
        diccionario.put("contraseña", "password");
        diccionario.put("teclado", "keyboard");
        diccionario.put("archivo", "file");
        diccionario.put("borrar", "erase");
        diccionario.put("sistema", "system");
        diccionario.put("desarrollar", "develop");

        
        Scanner scanner = new Scanner(System.in);

        //Leemos la palabra que queremos traducir
        System.out.println("Ingresa la palabra que quieres traducir: ");
        String palabra = scanner.nextLine();

        //Buscamos las coincidencias dentro del diccionario, si existe la muestra y en caso contrario envia un mensaje de que esa palabra no existe en el diccionario
        if (diccionario.containsKey(palabra)) {
            String traduccion = diccionario.get(palabra);
            System.out.println("La traducción de " + palabra + " es " + traduccion);
        } else {
            System.out.println(palabra + " no está en el diccionario");
            System.exit(1);

        }

   }
}
