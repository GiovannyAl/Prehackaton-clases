import java.util.Scanner;
import opciones.DatosPrimitivos;
public class Main {
    private Scanner scanner;
    public Main() {
        this.scanner = new Scanner(System.in);
    }
    public void iniciar() {
        int opcion;
        do {
            MostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    opciones.DatosPrimitivos datosPrimitivos = new opciones.DatosPrimitivos(scanner);
                    datosPrimitivos.menu();
                    break;
                case 2:
                    opciones.String string = new opciones.String(scanner);
                    string.menu();
                    break;

                case 3:
                    opciones.Constantes constantes = new opciones.Constantes(scanner);
                    constantes.menu();
                    break;

                case 4:
                    opciones.TipoOperadores tipooperadores = new opciones.TipoOperadores(scanner);
                    tipooperadores.menu();
                    break;

                case 5:
                    opciones.Condicionales condicionales = new opciones.Condicionales(scanner);
                    condicionales.menu();
                    break;

                case 6:
                    opciones.Switch aswitch = new opciones.Switch(scanner);
                    aswitch.menu();
                    break;

                case 7:
                    opciones.Ternaria ternaria = new opciones.Ternaria(scanner);
                    ternaria.menu();
                    break;

                case 8:
                    opciones.DoWhile dowhile = new opciones.DoWhile(scanner);
                    dowhile.menu();
                    break;
                case 9:
                    opciones.While awhile = new opciones.While(scanner);
                    awhile.menu();
                    break;

                case 10:
                    opciones.For afor = new opciones.For(scanner);
                    afor.menu();
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);
        scanner.close();
    }
    private void MostrarMenu() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Datos primitivos");
        System.out.println("2. String");
        System.out.println("3. Constantes");
        System.out.println("4. Tipo operadores");
        System.out.println("5. Condicional IF, ELSE IF, ELSE");
        System.out.println("6. Condicional Switch");
        System.out.println("7. Condicional ternaria");
        System.out.println("8. Bucle DO WHILE");
        System.out.println("9. Bucle WHILE");
        System.out.println("10. Bucle FOR");
        System.out.println("0. Salir");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }
}