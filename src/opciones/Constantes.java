package opciones;
import java.util.Scanner;
public class Constantes {
    private Scanner scanner;

    public Constantes(Scanner scanner) {
        this.scanner = scanner;
    }

    public void menu() {
        System.out.println("+--------------------------------------+");
        System.out.println("|                Constantes            |");
        System.out.println("+--------------------------------------+");
        System.out.println("| Constantes: Sirve para declarar un   |");
        System.out.println("| valor que no se puede modificar.     |");
        System.out.println("|                                      |");
        System.out.println("| Ejemplo:                             |");
        System.out.println("| final int numero = 10;               |");
        System.out.println("+--------------------------------------+");

        System.out.println("Si desea continuar, presione Enter...");
        scanner.nextLine();
        scanner.nextLine();
    }
}