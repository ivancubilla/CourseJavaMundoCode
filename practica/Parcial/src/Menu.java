import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("1.Humburguesa \n 2.Pizza \n 3.Empanada \n Ingrese una opcion : ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste Hamburguesa");
                break;
            case 2:
                System.out.println("Seleccionaste Pizza");
                break;
            case 3:
                System.out.println("Seleccionaste Empanada");
                break;
            default:
                System.out.println("Seleccion incorrecta!");
        }
    }
}
