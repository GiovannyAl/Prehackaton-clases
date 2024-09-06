package opciones;

import java.util.Scanner;

public class While {
    private Scanner scanner;

    public While(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación de WHILE");
            System.out.println("2. Programa WHILE");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                WHILE                 |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| El bucle WHILE evalúa una condición  |");
                    System.out.println("| antes de ejecutar el bloque de código.|");
                    System.out.println("| Si la condición es verdadera, el     |");
                    System.out.println("| código dentro del bucle se ejecuta.  |");
                    System.out.println("| El proceso se repite mientras la     |");
                    System.out.println("| condición sea verdadera.             |");
                    System.out.println("|                                      |");
                    System.out.println("| Sintaxis:                            |");
                    System.out.println("| while (condición) {                  |");
                    System.out.println("|     // código                        |");
                    System.out.println("| }                                    |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                WHILE                 |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| El programa calculará la sumatoria   |");
                    System.out.println("| de los números del 1 al 10 utilizando|");
                    System.out.println("| un bucle WHILE.                      |");
                    System.out.println("+--------------------------------------+");

                    int suma = 0;
                    int i = 1;
                    while (i <= 10) {
                        suma += i;
                        i++;
                    }

                    System.out.println("+--------------------------------------+");
                    System.out.println("| La sumatoria de 1 a 10 es: " + suma + "         |");
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
