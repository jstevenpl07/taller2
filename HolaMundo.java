package taller1;

// Importar Scanner
import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // Mensaje de bienvenida al usuario
        System.out.println("Bienvenidos a mi proyecto taller 1");

        // Mensaje para solicitar los datos del usuario
        System.out.println("Ingresa tu Nombre");

        // Scanner para el ingreso del nombre
        Scanner scanner = new Scanner(System.in);

        // Variable para almacenar los datos escritos por el usuario
        String Nombre = scanner.nextLine();

        // Mensaje para solicitar la cantidad de los integrantes
        System.out.println("Ingresa el número de integrantes del equipo");

        // Variable para almacenar el número de integrantes
        String Nintegrantes = scanner.nextLine();

        // Mensaje para solicitar el nombre de los integrantes
        System.out.println("Ingresa el nombre de los integrantes del equipo");

        String NombreIntegrantes = scanner.nextLine();

        // Linea para imprimir la información
        System.out.println("Hola, " + Nombre + " Nuestro Equipo Esta Conformado por " + Nintegrantes + " integrantes y son: " + NombreIntegrantes);
    }
}
