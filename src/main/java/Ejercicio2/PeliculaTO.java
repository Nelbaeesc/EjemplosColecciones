package Ejercicio2;

import java.util.LinkedList;
import java.util.List;

public class PeliculaTO {

    private static int nextvalue = 0;
    private String titulo;
    private int codigo;
    private List<String > actores;
    private List<String> directores;

    public PeliculaTO(){
        actores = new LinkedList<String>();
        directores = new LinkedList<String>();
        codigo = ++nextvalue;
    }

    public List<String> getActores(){
        return actores;
    }

    public void addActor(String actor){
        actores.add(actor);
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof PeliculaTO))
            return false;
        PeliculaTO p = (PeliculaTO) obj;
        return p.codigo = ;
    }
}
