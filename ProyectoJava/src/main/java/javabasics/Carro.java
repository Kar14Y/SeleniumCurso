package javabasics;

public class Carro {
	
		// declara variable a nivel de clase
	static int numero2;
	
	public static void main(String[] args) {
		// declara variable a nivel de método
		int numero;
		numero=2;
		numero2=3;
		System.out.println(numero+numero2*numero);
						
		String cadenaDeCaracteres;
		cadenaDeCaracteres="Karla Yañez";
		System.out.println(cadenaDeCaracteres+" Curso de Selenium");
		
		boolean verdaderoOfalso;
		verdaderoOfalso = cadenaDeCaracteres.equals("Karla Yañez");
		System.out.println(verdaderoOfalso);
		
		if(verdaderoOfalso == true) {
			System.out.println("El nombre es igual");
		} else {
			System.out.println("El nombre no es igual");
		}
		
		//double numerosConPuntoDecimal;
		
		
		
		
		
		
	}
	

}
