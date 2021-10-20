package com.company;

public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro();
        Capitulo capitulo = new Capitulo();
        Versiculo versiculo = new Versiculo();

        livro.setNomeDoLivro("jó");
        versiculo.setVersiculos("1.sadjaisdjiasjd");
        capitulo.guardaVersiculo();

        System.out.println(livro.findAll());
        System.out.println(capitulo.getCapitulo());
        System.out.println(versiculo.findAll());
    }
}
