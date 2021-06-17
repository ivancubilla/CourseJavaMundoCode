import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");

        String nombre = entrada.nextLine();

        System.out.println("Su nombre es : " + nombre);
    }
}
/* nextByte()
   nextShort()
   nextInt()
   nextLong()
   nextFloat()
   nextDouble()
   nextBoolean()
   nextLine()
   next()
 */