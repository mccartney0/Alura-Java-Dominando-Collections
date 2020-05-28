package br.com.traduvert;

import java.util.List;

public class TesteCurso {

    public static void main(String[] args) {
        
        Curso c = new Curso("Desenvolvimento de Games", "Allãn Gomes");

        List<Aula> aulas = c.getAulas();
        System.out.println(aulas);

        c.adiciona(new Aula("Segunda Aula", 30));

        c.adiciona(new Aula("Criando uma Aula", 20));
        c.adiciona(new Aula("Modelando com colecoes", 24));

        System.out.println(aulas);
        System.out.println(c.getNome());
    }
    
}