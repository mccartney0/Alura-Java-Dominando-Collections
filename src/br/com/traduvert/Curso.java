package br.com.traduvert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Curso {
    
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return "Curso: " + this.nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aulas){
        this.aulas.add(aulas);
    }
}