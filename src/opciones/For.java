package opciones;

import java.util.Scanner;

public class For {
    private Scanner scanner;

    public For(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación de FOR");
            System.out.println("2. Programa FOR");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                  FOR                 |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| El bucle FOR se utiliza cuando se    |");
                    System.out.println("| conoce de antemano cuántas veces se  |");
                    System.out.println("| desea que se ejecute un bloque de    |");
                    System.out.println("| código. Es ideal para iteraciones    |");
                    System.out.println("| controladas por un contador.         |");
                    System.out.println("|                                      |");
                    System.out.println("| Sintaxis:                            |");
                    System.out.println("| for (inicialización; condición;      |");
                    System.out.println("| incremento) {                        |");
                    System.out.println("|     // código                        |");
                    System.out.println("| }                                    |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|             Programa FOR             |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| El programa calculará la sumatoria   |");
                    System.out.println("| de los números del 1 al 10 utilizando|");
                    System.out.println("| un bucle FOR.                        |");
                    System.out.println("+--------------------------------------+");

                    int sum = 0;
                    for (int j = 1; j <= 10; j++) {
                        sum += j;
                    }

                    System.out.println("+--------------------------------------+");
                    System.out.println("| La sumatoria de 1 a 10 es: " + sum + "         |");
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

