package br.com.traduvert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {

	public static void main(String[] args) {

		ArrayList<Aula> aulas = new ArrayList<>();
		
		Aula a1 = new Aula("Nico ensinando Java.io", 31);
		Aula a2 = new Aula("Paulo ensinando Collections", 25);
		Aula a3 = new Aula("Allan ensinando desenvolvimento de games", 55);
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
		//Precisa implementar a interface Comparable na classe Aula
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		//Ordenando por tempo de aula
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
	}

}
