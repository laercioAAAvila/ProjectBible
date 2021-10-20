package com.company;

import java.util.ArrayList;

public class Livro {

    private ArrayList<String> nomeDoLivro = new ArrayList<>();
    private ArrayList<Capitulo> capitulos = new ArrayList<>();
    private Capitulo capitulo = new Capitulo();

    public void setNomeDoLivro (String nomeDoLivro){
        this.nomeDoLivro.add(nomeDoLivro);
        this.capitulos.add(this.capitulo);
    }
    public String findNomeDoLivro (String nomeDoLivro) {
        for (int j = 0; j < this.nomeDoLivro.size(); j++) {
            if (this.nomeDoLivro.get(j) == nomeDoLivro){
                return nomeDoLivro;
            }
        }
        return "Livro não encontrado: "+nomeDoLivro;
    }
    public String findAll () {
        for (int i = 0; i < this.nomeDoLivro.size(); i++) {
            return this.nomeDoLivro.get(i);
        }
        return "";
    }

}
