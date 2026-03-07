package PrimerParcial;
import java.util.Scanner;
public class Ejercicio1 {
//Ejercicio 1) Escriba un programa que lea un numero n (entre 1 y 12) y genere la tabla de multiplicar de n del 1 al .
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int n;

	        System.out.print("Ingrese un numero entre 1 y 12: ");
	        n = sc.nextInt();

	        if(n >= 1 && n <= 12){

	            for(int i = 1; i <= 10; i++){

	                System.out.println(n + " x " + i + " = " + (n * i));

	            }

	        }else{

	            System.out.println("Numero fuera de rango");

	        }

	    }
	}

