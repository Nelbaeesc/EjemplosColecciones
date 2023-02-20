package Eurovision;

import java.util.*;

public class Pais implements Comparable<Pais>{

    private static final int[] PUNTOS = {1,2,3,4,5,6,7,8,9,10,12};
    private String cantante;
    private String nombre;
    private Map<Pais,Integer> puntuacionRecibida;
    private Map<Integer,Pais> puntuacionEmitida;

    public Pais(String nombre,String cantante) {
        this.cantante = cantante;
        this.nombre = nombre;
        puntuacionRecibida = new HashMap<>();
        puntuacionEmitida = new TreeMap<>();
    }

    public void recibirVoto(Integer puntuacion, Pais pais){
        puntuacionRecibida.put(pais,puntuacion);
    }

    public void votar(Set<Pais> paises){
        List<Pais> paisList = new ArrayList<>(paises);
        Collections.shuffle(paisList);

        for (int punto : PUNTOS){
            puntuacionEmitida.put(punto,paisList.remove(0));
        }
    }

    public int obtenerPuntuacion(){
        int suma = 0;
        for(Integer punto : puntuacionRecibida.values())
            suma+=punto;
        return suma;
    }

    public Map<Integer,Pais> devolverVotos(){
        return puntuacionEmitida;
    }

    @Override
    public int compareTo(Pais o) {
        return nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public String toString(){
        return nombre + "\n" +
                "Puntuacion: " + puntuacionRecibida;
    }
}
