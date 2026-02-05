import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio24BusquedaPalabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique una palabra para buscar:");
        String palabra = sc.nextLine();
        System.out.println("Indique el nombre del archivo en el que buscar:");
        String archivo = sc.nextLine();
        int contador = 0;

        System.out.println();
        System.out.println("MUESTRO EL CONTENIDO DEL ARCHIVO DE TEXTO");
        try (BufferedReader reader = new BufferedReader(new FileReader("../"+archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader("../"+archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.contains(palabra)) {
                    contador++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println("La palabra " + palabra + " aparece en " +  contador + " líneas.");
    }
}