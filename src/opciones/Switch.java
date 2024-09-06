package opciones;

import java.util.Scanner;

public class Switch {
    private Scanner scanner;

    public Switch(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación de switch");
            System.out.println("2. Programa de switch");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                switch                |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| La estructura switch se utiliza para |");
                    System.out.println("| ejecutar uno entre varios bloques de |");
                    System.out.println("| código, dependiendo del valor de una |");
                    System.out.println("| expresión.                           |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplo:                             |");
                    System.out.println("| switch (calificacion) {              |");
                    System.out.println("|     case 1:                          |");
                    System.out.println("|         // código                    |");
                    System.out.println("|         break;                       |");
                    System.out.println("|     case 2:                          |");
                    System.out.println("|         // código                    |");
                    System.out.println("|         break;                       |");
                    System.out.println("|     // otros casos                   |");
                    System.out.println("|     default:                         |");
                    System.out.println("|         // código                    |");
                    System.out.println("| }                                    |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|         Programa de switch           |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Ingrese la calificación (1-10):      |");
                    int calificacion = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("+--------------------------------------+");
                    switch (calificacion) {
                        case 1:
                        case 2:
                            System.out.println("| Su calificación es: F                |");
                            break;
                        case 3:
                        case 4:
                            System.out.println("| Su calificación es: D                |");
                            break;
                        case 5:
                        case 6:
                            System.out.println("| Su calificación es: C                |");
                            break;
                        case 7:
                        case 8:
                            System.out.println("| Su calificación es: B                |");
                            break;
                        case 9:
                        case 10:
                            System.out.println("| Su calificación es: A                |");
                            break;
                        default:
                            System.out.println("| Número no válido                     |");
                            break;
                    }
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
