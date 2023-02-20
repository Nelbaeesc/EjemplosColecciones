package Eurovision;

import java.util.*;

public class Concurso {

    private static final String[][] datos = {
            {"España","El Chiquilicuatre"},
            {"Alemania","SubanStrujenBajesn"},
            {"Francia","La Zarra"},
            {"Italia","Marco Megoni"},
            {"UK","Los Brexit"},
            {"Ucrania","Tvorchi"},
            {"Azerbaiyan","Ekdvje"},
            {"Croacia","Let 3"},
            {"Finlandia","Uno cualquiera"},
            {"Irlanda","Wild Youth"},
            {"Israel","Noa Kirel"},
            {"Letonia","Sudden Lights"},
            {"Malta","The Buster"},
            {"Noruega","Alessandra"},
            {"Albania","Albina Redmendi"},
            {"Armenia","Brunette"},
    };

    private Set<Pais> paises;

    public Concurso() {
        paises = new TreeSet<>();

        rellenarPaises();
    }

    private void rellenarPaises() {
        for (String[] dato : datos )
            paises.add(new Pais(dato[0],dato[1]));
    }

    public void realizarVotaciones(){
        for (Pais p : paises){
            p.votar(paises);
        }

    }
    public List<Pais> obtenerListadoPaisesPorPuntuacion(){

    }
    public List<Pais> obtenerListadoPaisesAlfabeticamente(){

    }
    public Map<Pais, Map<Integer,Pais>> obtenerListadoPaisesYPuntuacionesEmitidas(){

    }
    public List<String> obtenerListadoAlfabeticocantantes(){

    }
}
