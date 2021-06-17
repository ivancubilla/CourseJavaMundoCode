import java.util.Scanner;  //we have than import Scanner class

public class Datos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");

        String fullName = entrada.nextLine();

        System.out.print("Su nombre es: " + fullName);



        /*System.out.print("Ingrese su edad: ");
        int age = entrada.nextInt();
        System.out.print("Su edad es: " + age);*/
    }
}
/*  nextByte()
    nextShort()
    nextInt()
    nextLong()
    nextFloat()
    nextDouble()
    nextBoolean()
    nextLine()
    next()
* */