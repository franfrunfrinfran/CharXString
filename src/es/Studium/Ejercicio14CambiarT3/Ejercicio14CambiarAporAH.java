package es.Studium.Ejercicio14CambiarT3;

import java.util.Scanner;

public class Ejercicio14CambiarAporAH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner teclado = new Scanner(System.in);
		
		String cad1;
		
		System.out.println("Escriba una cadena");
		cad1=teclado.next();
		
		
		cad1=cad1.replaceAll("a", "ah");
		
		System.out.println(cad1);
		
		
		
		teclado.close();
	}

}
