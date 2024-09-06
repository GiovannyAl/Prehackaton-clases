package opciones;

import java.util.Scanner;

public class DatosPrimitivos {
    private Scanner scanner;

    public DatosPrimitivos(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación byte");
            System.out.println("2. Explicación short");
            System.out.println("3. Explicación int");
            System.out.println("4. Explicación long");
            System.out.println("5. Explicación float");
            System.out.println("6. Explicación double");
            System.out.println("7. Explicación char");
            System.out.println("8. Explicación boolean");
            System.out.println("9. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("+-----------------------------+");
                    System.out.println("|             byte            |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| byte: 8 bits, rango de      |");
                    System.out.println("| -128 a 127.                 |");
                    System.out.println("+-----------------------------+");                                break;
                case 2:
                    System.out.println("+-----------------------------+");
                    System.out.println("|             short           |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| short: 16 bits, rango de    |");
                    System.out.println("| -32,768 a 32,767.           |");
                    System.out.println("+-----------------------------+");
                    break;
                case 3:
                    System.out.println("+-----------------------------+");
                    System.out.println("|              int            |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| int: 32 bits, rango de      |");
                    System.out.println("| -2,147,483,648 a 2,147,483,647|");
                    System.out.println("+-----------------------------+");
                    break;
                case 4:
                    System.out.println("+-----------------------------+");
                    System.out.println("|              long           |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| long: 64 bits, rango de     |");
                    System.out.println("| -9,223,372,036,854,775,808  |");
                    System.out.println("| a 9,223,372,036,854,775,807.|");
                    System.out.println("+-----------------------------+");
                    break;
                case 5:
                    System.out.println("+-----------------------------+");
                    System.out.println("|              float          |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| float: 32 bits, rango de    |");
                    System.out.println("| 1.4e-045 a 3.4e+038.        |");
                    System.out.println("+-----------------------------+");
                    break;
                case 6:
                    System.out.println("+-----------------------------+");
                    System.out.println("|              double         |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| double: 64 bits, rango de   |");
                    System.out.println("| 4.9e-324 a 1.8e+308.        |");
                    System.out.println("+-----------------------------+");
                    break;
                case 7:
                    System.out.println("+-----------------------------+");
                    System.out.println("|             char            |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| char: 16 bits, rango de     |");
                    System.out.println("| 0 a 65,535.                 |");
                    System.out.println("+-----------------------------+");
                    break;
                case 8:
                    System.out.println("+-----------------------------+");
                    System.out.println("|            boolean          |");
                    System.out.println("+-----------------------------+");
                    System.out.println("| boolean: 1 bit, puede ser   |");
                    System.out.println("| true o false.               |");
                    System.out.println("+-----------------------------+");
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
            if (opcion != 9) {
                System.out.println("Si desea continuar, presione Enter...");
                scanner.nextLine();
                scanner.nextLine();
            }
        } while (opcion != 9);
    }
}
