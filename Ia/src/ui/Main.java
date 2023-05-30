package ui;
import model.Ia;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Ia prototype = new Ia();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n¡Welcome to the prototype of questions and answers about planets.!");
        System.out.println("\n!!You can ask questions about the planets of the solar system.!!" + "\netype 'exit' to finish...");

        String input;
        while (true) {
            System.out.print("\nEnter your question:: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Exit")) {
                System.out.print("¡See you later!");
                break;
            }

            prototype.input(input);
        }

        scanner.close();
    }

}
