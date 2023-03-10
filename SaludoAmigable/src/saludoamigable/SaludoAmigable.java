package saludoamigable;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Scanner
 * Este programa despliega un saludo Hola personalizado.
 *
 */

public class SaludoAmigable {
    //Scanner stdIn = new Scanner(System.in);
    String nombre = "Eli";
    public void Nombree() {
       //System.out.print("Introduce tu nombre: ");
       //nombre = stdIn.nextLine();
       System.out.println("Hola " + nombre + "!");
    }
    public static void main(String[] args) {
        SaludoAmigable Nombre = new SaludoAmigable();
        Nombre.Nombree();
    }

}
