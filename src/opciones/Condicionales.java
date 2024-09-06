package opciones;

import java.util.Scanner;

public class Condicionales {
    private Scanner scanner;

    public Condicionales(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación de IF");
            System.out.println("2. Explicación de ELSE IF");
            System.out.println("3. Explicación de ELSE");
            System.out.println("4. Programa de IF, ELSE IF, ELSE");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                IF                    |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| IF:                                 |");
                    System.out.println("| La estructura IF se utiliza para    |");
                    System.out.println("| ejecutar un bloque de código si     |");
                    System.out.println("| una condición específica es verdadera.|");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplo:                             |");
                    System.out.println("| if (edad >= 18) {                    |");
                    System.out.println("|     System.out.println(\"Es mayor\");  |");
                    System.out.println("| }                                    |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                ELSE IF               |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| ELSE IF:                             |");
                    System.out.println("| Se utiliza después de un IF para     |");
                    System.out.println("| evaluar otra condición si la primera |");
                    System.out.println("| es falsa.                            |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplo:                             |");
                    System.out.println("| if (edad >= 18) {                    |");
                    System.out.println("|     System.out.println(\"Es mayor\");  |");
                    System.out.println("| } else if (edad >= 13) {             |");
                    System.out.println("|     System.out.println(\"Es adolescente\"); |");
                    System.out.println("| }                                    |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 3:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|                  ELSE               |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| ELSE:                                |");
                    System.out.println("| Se usa después de un IF o ELSE IF    |");
                    System.out.println("| para ejecutar un bloque de código si |");
                    System.out.println("| todas las condiciones anteriores     |");
                    System.out.println("| son falsas.                          |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplo:                             |");
                    System.out.println("| if (edad >= 18) {                    |");
                    System.out.println("|     System.out.println(\"Es mayor\");  |");
                    System.out.println("| } else {                             |");
                    System.out.println("|     System.out.println(\"Es menor\");  |");
                    System.out.println("| }                                    |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 4:
                    System.out.println("Ingrese la edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("+--------------------------------------+");
                    System.out.print("| Resultado: ");
                    if (edad >= 0 && edad <= 12) {
                        System.out.println("Es un niño                |");
                    } else if (edad >= 13 && edad <= 20) {
                        System.out.println("Es joven                 |");
                    } else if (edad >= 21 && edad <= 60) {
                        System.out.println("Es adulto                |");
                    } else if (edad >= 61) {
                        System.out.println("Es tercera edad          |");
                    } else {
                        System.out.println("Edad no válida           |");
                    }
                    System.out.println("+--------------------------------------+");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            if (opcion != 5) {
                System.out.println("Si desea continuar, presione Enter...");
                scanner.nextLine();
            }
        } while (opcion != 5);
    }
}
