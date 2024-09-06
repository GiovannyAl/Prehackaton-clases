package opciones;

import java.util.Scanner;

public class Ternaria {
    private Scanner scanner;

    public Ternaria(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        int opcion;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Explicación de ternaria");
            System.out.println("2. Programa de ternaria");
            System.out.println("3. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|            Operador Ternario         |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| El operador ternario es una forma    |");
                    System.out.println("|         de realizar una evaluación   |");
                    System.out.println("| condicional. Tiene la forma:         |");
                    System.out.println("|                                      |");
                    System.out.println("| condición ? valor1 : valor2          |");
                    System.out.println("|                                      |");
                    System.out.println("| Si la condición es verdadera, se     |");
                    System.out.println("| evalúa y retorna valor1, si es falsa,|");
                    System.out.println("| retorna valor2.                      |");
                    System.out.println("|                                      |");
                    System.out.println("| Ejemplo:                             |");
                    System.out.println("| int edad = 18;                       |");
                    System.out.println("| String resultado = (edad >= 18) ?    |");
                    System.out.println("| \"Mayor de edad\" : \"Menor de edad\";   |");
                    System.out.println("+--------------------------------------+");
                    break;
                case 2:
                    System.out.println("+--------------------------------------+");
                    System.out.println("|   Programa con Operador Ternario     |");
                    System.out.println("+--------------------------------------+");
                    System.out.println("| Ingrese un número para verificar si  |");
                    System.out.println("| es par o impar:                      |");
                    System.out.println("+--------------------------------------+");

                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    java.lang.String resultado = (numero % 2 == 0) ? "Es par" : "Es impar";

                    System.out.println("+--------------------------------------+");
                    System.out.println("| Resultado: " + resultado + "          |");
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
