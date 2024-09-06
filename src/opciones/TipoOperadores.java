package opciones;

import java.util.Scanner;

public class TipoOperadores {
    private Scanner scanner;

    public TipoOperadores(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Aritméticos");
            System.out.println("2. Relacionales");
            System.out.println("3. Lógicos");
            System.out.println("4. Asignación");
            System.out.println("5. Incremento y decremento");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            Operadores                |");
                    System.out.println("|            Aritméticos               |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Los operadores aritméticos realizan  |");
                    System.out.println("| operaciones matemáticas básicas como |");
                    System.out.println("| suma, resta, multiplicación, etc.    |");
                    System.out.println("|                                      |");
                    System.out.println("| +, -, *, /, %                        |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplos:                            |");
                    System.out.println("| int suma = 5 + 5;                    |");
                    System.out.println("| int resta = 5 - 5;                   |");
                    System.out.println("| int multiplicacion = 5 * 5;          |");
                    System.out.println("| int division = 5 / 5;                |");
                    System.out.println("| int modulo = 5 % 5;                  |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|             Operadores               |");
                    System.out.println("|            Relacionales              |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Los operadores relacionales se usan  |");
                    System.out.println("| para comparar dos valores. El        |");
                    System.out.println("| resultado de la comparación indica   |");
                    System.out.println("| si la relación es verdadera o falsa. |");
                    System.out.println("|                                      |");
                    System.out.println("| ==, !=, >, <, >=, <=                 |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplos:                            |");
                    System.out.println("| 5 == 5   (igual a)                   |");
                    System.out.println("| 5 != 4   (diferente de)              |");
                    System.out.println("| 5 > 3    (mayor que)                 |");
                    System.out.println("| 3 < 5    (menor que)                 |");
                    System.out.println("| 5 >= 5   (mayor o igual a)           |");
                    System.out.println("| 3 <= 4   (menor o igual a)           |");
                    System.out.println("+--------------------------------------+");
                    break;

                case 3:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|           Operadores                 |");
                    System.out.println("|             Lógicos                  |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Los operadores lógicos se usan para  |");
                    System.out.println("| combinar múltiples condiciones. Esto |");
                    System.out.println("| permite realizar comparaciones más   |");
                    System.out.println("| complejas.                           |");
                    System.out.println("|                                      |");
                    System.out.println("| && (y lógico), || (o lógico), ! (no) |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplos:                            |");
                    System.out.println("| (5 > 3) && (8 > 6)  (verdadero si    |");
                    System.out.println("| ambas condiciones son ciertas)       |");
                    System.out.println("| (5 > 3) || (8 < 6)  (verdadero si    |");
                    System.out.println("| al menos una condición es cierta)    |");
                    System.out.println("| !(5 > 3)    (falso porque niega la   |");
                    System.out.println("| condición)                           |");
                    System.out.println("+--------------------------------------+");
                    break;

                case 4:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            Operadores                |");
                    System.out.println("|            Asignación                |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Los operadores de asignación se      |");
                    System.out.println("| utilizan para asignar valores a las  |");
                    System.out.println("| variables.                           |");
                    System.out.println("|                                      |");
                    System.out.println("| =, +=, -=, *=, /=, %=                |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplos:                            |");
                    System.out.println("| int numero = 5;                      |");
                    System.out.println("| numero += 5;                         |");
                    System.out.println("| numero -= 5;                         |");
                    System.out.println("| numero *= 5;                         |");
                    System.out.println("| numero /= 5;                         |");
                    System.out.println("| numero %= 5;                         |");
                    System.out.println("+--------------------------------------+");
                    break;

                case 5:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            Operadores                |");
                    System.out.println("|      Incremento y Decremento         |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Los operadores de incremento y       |");
                    System.out.println("| decremento aumentan o disminuyen el  |");
                    System.out.println("| valor de una variable en uno.        |");
                    System.out.println("|                                      |");
                    System.out.println("| ++, --                               |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplos:                            |");
                    System.out.println("| numero++;                            |");
                    System.out.println("| numero--;                            |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            if (opcion != 6) {
                System.out.println("Si desea continuar, presione Enter...");
                scanner.nextLine();
            }
        } while (opcion != 6);
        }
}
