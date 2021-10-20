package com.company;

import java.util.ArrayList;

public class Capitulo {

    private ArrayList<Versiculo> versiculoArrayList = new ArrayList<>();
    private Versiculo versiculo = new Versiculo();

    public void guardaVersiculo (){
        this.versiculoArrayList.add(versiculo);
    }
    public int getCapitulo () {
        return versiculoArrayList.size();
    }
}
