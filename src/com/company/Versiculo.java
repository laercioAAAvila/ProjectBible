package com.company;

import java.util.ArrayList;

public class Versiculo {

    private ArrayList<String> versiculos = new ArrayList<>();

    public void setVersiculos (String versiculos){
        this.versiculos.add(versiculos);
    }
    public String getVersiculo (int numeroDoVersiculo){
        return this.versiculos.get(numeroDoVersiculo);
    }
    public int getTotalDeVersiculos (){
        return this.versiculos.size();
    }

    public String findAll () {
        for (int i = 0; i < this.versiculos.size(); i++) {
            return this.versiculos.get(i);
        }
        return "";
    }
}
