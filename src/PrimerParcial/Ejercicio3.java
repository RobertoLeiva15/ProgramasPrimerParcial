package PrimerParcial;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        String correo;

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        apellido = sc.nextLine();

        // Con .toLower se convierte a minuscula
        nombre = nombre.toLowerCase();
        apellido = apellido.toLowerCase();

        // Con.replace borro o elimino los espacios
        nombre = nombre.replace(" ", "");
        apellido = apellido.replace(" ", "");

        //Solo se le agrega el @umg.edu.gt al nombre y apellido que el usuario dio
        correo = nombre + apellido + "@umg.edu.gt";

        System.out.println("Su correo es: " + correo);
	}
}
