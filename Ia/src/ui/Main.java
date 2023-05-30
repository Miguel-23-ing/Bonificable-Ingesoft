package ui;
import model.*;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Ia prototype = new Ia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al prototipo de preguntas y respuestas sobre planetas!");
        System.out.println("Puedes hacer preguntas sobre los planetas del sistema solar. Escribe 'salir' para terminar.");

        String input;
        while (true) {
            System.out.print("\nIngresa tu pregunta: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("¡Hasta luego!");
                break;
            }

            String planetInfo = prototype.getPlanetInfo(input);
            System.out.println("Respuesta: " + planetInfo);
        }

        scanner.close();
    }

}
