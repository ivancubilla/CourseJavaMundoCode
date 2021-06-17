import java.util.Scanner;

public class CondicionalesIfElse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18 && edad < 130){
            System.out.println("Eres mayor de edad");
        }
        else if (edad < 18 && edad > 0){
            System.out.println("Eres menor de edad");
        }
        else {
            System.out.println("Edad incorrecta");
        }
    }
}
