package javabasics;

public class Metodos {
	int numero1, numero2; //variables a nivel de clase que se mandan llamar en el método "Metodos"
	
	public Metodos() {
		
	}
	
	//public Metodos(int numero) {
	//	System.out.println(numero);
	//}
	
	public Metodos(int numero1, int numero2) {
		this.numero1=numero1; //this se refiere a que es nuestra variable a nível de clase
		this.numero2=numero2;
	}

/// Aqui estaba mi main method
	
	public void mostrarMensaje() {
		System.out.println("Hola Mundo");
	}
	
	public int sumatoria() {
	//public int sumatoria(int numero1,int numero2) {
		int sumatoria = numero1+numero2;
		return sumatoria;
		//return numero1+numero2;
	}
	
	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}
	
	public static void prueba() {
		System.out.println("Método estático");
	}

}
