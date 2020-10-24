package javabasics;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido");
		
		System.out.println("Ingresa el primer dígito");
		Scanner scanner_num1 = new Scanner(System.in);
		int dato_num1 = scanner_num1.nextInt();
				
		System.out.println("Ingresa el segundo dígito");
		Scanner scanner_num2 = new Scanner(System.in);
		int dato_num2 = scanner_num2.nextInt();
				
		System.out.println("Suma de números" + " " + (dato_num1 + dato_num2));
		System.out.println("Resta de números" + " " + (dato_num1 - dato_num2));
		System.out.println("Multiplicación de números" + " " + (dato_num1 * dato_num2));
		System.out.println("División de números" + " " + (dato_num1 / dato_num2));
		System.out.println("Módulo de números" + " " + (dato_num1 % dato_num2));
		
		scanner_num1.close();
		scanner_num2.close();
	}

}
