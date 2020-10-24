package javabasics;

import java.util.ArrayList;
import java.util.List;

public class Metodos2 {
	static String heredar = "Mensaje de texto heredado";
	
//	public List<String> listaDeNombres(){
	public static List<String> listaDeNombres(){
//	protected static List<String> listaDeNombres(){
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Karla");
		listaNombres.add("Yañez");
		listaNombres.add("Herrera");
		listaNombres.add("Karla");
		return listaNombres;
	}
	
//	public static List<String> listaDeNombres2(){
//	public static List<String> listaDeNombres2(){
	protected static List<String> listaDeNombres2(){
		List<String> listaNombres = new ArrayList<>();
		listaNombres.add("Karla");
		listaNombres.add("Yañez");
		listaNombres.add("Herrera");
		listaNombres.add("Karla");
		return listaNombres;
	}
	

//	public List<Integer> listaNumeros() {
	public static List<Integer> listaNumeros() {
//	protected static List<Integer> listaNumeros() {
		List<Integer> listaNumeros = new ArrayList<>();
		listaNumeros.add(1);
		listaNumeros.add(10);
		listaNumeros.add(1);
		listaNumeros.add(6);
		listaNumeros.add(78);
		listaNumeros.add(12);
		listaNumeros.add(1);
		return listaNumeros;
	}
}
