package Ejercicio2;

import java.util.*;

public class MemoryPeliculaDAO {

    List<PeliculaTO> peliculaTOList;
    PeliculaTO pelicula;

    public MemoryPeliculaDAO(){
        peliculaTOList = new LinkedList<>();
    }

    public void addPeliculaToLista(PeliculaTO pelicula){
        if (!peliculaTOList.contains(pelicula))
            peliculaTOList.add(pelicula);
    }

    public List<PeliculaTO> getdisponibles(){
        return new ArrayList<>(peliculaTOList);
    }

    public void removePeliculaFromLista(PeliculaTO pelicula){
        peliculaTOList.remove(pelicula);
    }

    public void removePeliculaFromCode(PeliculaTO pelicula){
        if (pelicula.getCodigo() == peliculaTOList.hashCode())
            peliculaTOList.remove(pelicula);
        else
            System.out.println("ERROR");
    }

    public List<PeliculaTO> getPeliculaTOList() {
        return peliculaTOList;
    }

    //e)
    Map<Actor, Set<Personaje>> actorSetMap;
}
