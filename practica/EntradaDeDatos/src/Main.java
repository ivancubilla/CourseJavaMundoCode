import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        char inicial;
        System.out.println("Ingrese su inicial: ");
        inicial = entrada.next().charAt(1);

        System.out.println("Su inicial es : " + inicial);
    }
}
