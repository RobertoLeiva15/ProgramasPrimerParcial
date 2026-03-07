package PrimerParcial;

import java.util.Scanner;

public class Ejercicio2 {
	//Ejercicio 2) Escriba un programa que lea un numero y determine si es primo o no. Debe indicar claramente el resultado en la pantalla.
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int n;
	        boolean primo = true;

	        System.out.print("Ingrese un numero: ");
	        n = sc.nextInt();
	        if(n <= 1){
	            primo = false;
	        }else{

	            for(int i = 2; i < n; i++){

	                if(n % i == 0){
	                    primo = false;
	                    break;
	                }

	            }

	        }

	        if(primo){
	            System.out.println("El numero es PRIMO");
	        }else{
	            System.out.println("El numero NO es primo");
	        }

	    }
	}