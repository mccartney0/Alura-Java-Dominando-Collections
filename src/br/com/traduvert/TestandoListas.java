package br.com.traduvert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		//Expressão Lambda, percorrendo coleções
		aulas.forEach(aula -> {
			System.out.println("Aula: " + aula);
		});

		System.out.println(aulas);
		
		// Embaralhando a Ordem
		Random r = new Random();
		Collections.shuffle(aulas, r); 
		System.out.println(aulas);
		
		//Ordem alfabética
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:");
		System.out.println(aulas);
	}
}