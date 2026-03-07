package PrimerParcial;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        String usuario;

        System.out.print("Ingrese nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        apellido = sc.nextLine();

        // Con .toLower se convierte a minuscula
        nombre = nombre.toLowerCase();
        apellido = apellido.toLowerCase();

        // Con.replace borro o elimino los espacios
        nombre = nombre.replace(" ", "");
        apellido = apellido.replace(" ", "");

        // Tengo la primer letra del nombre
        char inicial = nombre.charAt(0);
        
        // Aca nos da el usuario
        usuario = inicial + apellido;

        System.out.println("Usuario generado: " + usuario);

    }
}
