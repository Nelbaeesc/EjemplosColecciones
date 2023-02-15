package Oposiciones;

import java.util.HashSet;
import java.util.Set;

public class Opositor {

    Set<Bola> temas;

    public Opositor(){
        this.temas = new HashSet<>();
        estudiar();
    }

    public Set<Bola> estudiar(){
        for (int i = 0; i<6; i++)
            temas.add(new Bola());

        return temas;
    }

    public Set<Bola> getTemas() {
        return temas;
    }

    @Override
    public String toString(){
        return "Temas aprendidos: " + temas;
    }

}
