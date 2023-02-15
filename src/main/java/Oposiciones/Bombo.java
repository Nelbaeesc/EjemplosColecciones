package Oposiciones;

import java.util.*;

public class Bombo {

    private Set<Bola> bolas;

    public Bombo(){
        this.bolas = new LinkedHashSet<>();
        for (int i = 0; i<81; i++)
            bolas.add(new Bola());
    }

    public List<Bola> remover(Bombo bombo){
        List<Bola> bolaList = new ArrayList<>();
        bolaList.addAll(bolas);
        Collections.shuffle(bolaList);

        return bolaList;
    }

    @Override
    public String toString(){
        return "Bolas de bombo: " + bolas;
    }

}
