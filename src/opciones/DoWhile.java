package opciones;

import java.util.Scanner;

public class DoWhile {
    private Scanner scanner;

    public DoWhile(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación de DO WHILE");
            System.out.println("2. Programa DO WHILE - Adivina el número");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|               DO WHILE               |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| El bucle DO WHILE busca primero      |");
                    System.out.println("| ejecutar el codigo de                |");
                    System.out.println("| dentro y luego evalúa la             |");
                    System.out.println("| condición. Si la condición es        |");
                    System.out.println("| verdadera, el bloque de código se    |");
                    System.out.println("| repite. El ciclo continúa hasta que  |");
                    System.out.println("| la condición sea falsa.              |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplo:                            |");
                    System.out.println("| do {                                 |");
                    System.out.println("|     // código                        |");
                    System.out.println("| } while (condición);                 |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Programa DO WHILE - Adivina el número|");
                    System.out.println("+--------------------------------------+");
                    int numeroAleatorio = (int) (Math.random() * 10) + 1;
                    int numeroUsuario;
                    do {
                        System.out.println("| Adivina el número (1-10):            |");
                        numeroUsuario = scanner.nextInt();
                        scanner.nextLine();
                        if (numeroUsuario > numeroAleatorio) {
                            System.out.println("| El número es menor.                  |");
                        } else if (numeroUsuario < numeroAleatorio) {
                            System.out.println("| El número es mayor.                  |");
                        }
                    } while (numeroUsuario != numeroAleatorio);

                    System.out.println("+--------------------------------------+");
                    System.out.println("| ¡Felicidades! Adivinaste el número.  |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            if (opcion != 3) {
                System.out.println("Si desea continuar, presione Enter...");
                scanner.nextLine();
            }
        } while (opcion != 3);
    }
}
