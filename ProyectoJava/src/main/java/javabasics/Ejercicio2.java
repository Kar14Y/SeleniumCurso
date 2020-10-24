package javabasics;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bienvenido");
		
		String numero1 = JOptionPane.showInputDialog("Introduce número1");
		int dato_num1 = Integer.parseInt(numero1);

		String numero2 = JOptionPane.showInputDialog("Introduce número2");
		int dato_num2 = Integer.parseInt(numero2);
		
		
		JOptionPane.showMessageDialog(null, "Resultado suma: " + (dato_num1 + dato_num2));
		JOptionPane.showMessageDialog(null, "Resultado resta: " + (dato_num1 - dato_num2));
		JOptionPane.showMessageDialog(null, "Resultado multiplicación: " + (dato_num1 * dato_num2));
		JOptionPane.showMessageDialog(null, "Resultado división: " + (dato_num1 / dato_num2));
		JOptionPane.showMessageDialog(null, "Resultado modulo: " + (dato_num1 % dato_num2));
	
	}
	
}
