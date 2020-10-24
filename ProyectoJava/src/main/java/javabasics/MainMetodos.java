package javabasics;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainMetodos extends Metodos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metodos nombreObjeto = new Metodos();
		Metodos nombreObjeto2 = new Metodos (9,3);
//		Metodos2 objeto = new Metodos2();
		 
		System.out.println(nombreObjeto2.sumatoria());
		System.out.println(nombreObjeto.sumatoria());
		System.out.println(heredar);
		nombreObjeto.mostrarMensaje();
		
		String elementoGuardado = nombreObjeto.mostrarNombre("Karla");
		
		System.out.println(elementoGuardado);
		
		Metodos.prueba(); //si el método estático que quieres mandar llamar está en otra clase se manda llamar la clase y muestra los métdos estáticos que tenemos declarados
		//prueba();

//		List<String> listaNombres = objeto.listaDeNombres();
//		List<Integer> listaNumeros = objeto.listaNumeros();
		
		List<String> listaNombres = listaDeNombres();
		List<Integer> listaNumeros = listaNumeros();
		
		Collections.sort(listaNombres,Collections.reverseOrder());
		for(String nombre : listaNombres) {
			System.out.println(nombre);
			
		}
		System.out.println("for con dos puntos");
		
		for (int indice = 0 ; indice < listaNombres.size(); indice++ ) {
			System.out.println(listaNombres.get(indice));
			
		}
		System.out.println("for con index");
		
				for(int numero : listaNumeros) {
			System.out.println(numero);
		}
		
		//Ordenamiento de Lista
		List<String> nombresSinElementosDuplicados = listaNombres.stream().distinct().collect(Collectors.toList());
		System.out.println(nombresSinElementosDuplicados);
		Collections.sort(nombresSinElementosDuplicados);
		System.out.println(nombresSinElementosDuplicados);
		Collections.sort(nombresSinElementosDuplicados,Collections.reverseOrder());
		System.out.println(nombresSinElementosDuplicados);
		
		//Ordenamiento de números
		System.out.println(Collections.max(listaNumeros));
		System.out.println(Collections.min(listaNumeros));
		Collections.sort(listaNumeros);
		System.out.println(listaNumeros);
		Collections.sort(listaNumeros,Collections.reverseOrder());
		System.out.println(listaNumeros);
		
		Object last = null;
		int numCount = 0;
		Iterator<Integer> i = listaNumeros.iterator();
		
		while (i.hasNext()) {
			Object temp = i.next();
			if (temp.equals(last)) {
				i.remove();
				numCount++; //numCount = numCount + 1;
			} else {
				last=temp;
			}
		} // La lógica para eliminar números saleados, requiere el ordenamiento previo
		System.out.println(numCount);
//		Collections.sort(listaNumeros);
		System.out.println("Esta es la lista:" + listaNumeros);
		
		
		List<String> nombres1 = listaDeNombres();
		List<String> nombres2 = listaDeNombres2();
		
		Collections.sort(nombres1); 
		Collections.sort(nombres2); 
		
		boolean isIgual = nombres1.equals(nombres2);
		System.out.println(isIgual);
		
		if(isIgual==true) {
			System.out.println("Las listas son iguales:\n");
			System.out.println("Lista1 "+ nombres1 +" " + "Lista2: "+ nombres2 +" ");
		}else
			System.out.println("Las listas no son iguales:\n");
		System.out.println("Lista1 "+ nombres1 +" " + "Lista2: "+ nombres2 +" ");
	    
		
	} // main

} 
