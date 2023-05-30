package ui;
import model.Ia;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Ia prototype = new Ia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n¡Bienvenido al prototipo de preguntas y respuestas sobre planetas!");
        System.out.println("\n!!Puedes hacer preguntas sobre los planetas del sistema solar.!!" + "\nescribe 'salir' para terminar...");

        String input;
        while (true) {
            System.out.print("\nIngresa tu pregunta: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("salir")) {
                System.out.print("¡Hasta luego!");
                break;
            }

            prototype.input(input);
        }

        scanner.close();
    }

}
