package Eurovision;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

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
    private String path;

    public Concurso() {
        paises = new TreeSet<>();

        rellenarPaises(String path);
    }

    public void rellenarPaises(String path) {
        try(BufferedReader br = new BufferedReader(new FileReader(path));) {

            String linea = "";
            while ((linea=br.readLine())!=null){
                paises.add(new Pais(linea.split(";")[0],linea.split(";")[1]));
            }
        }catch (FileNotFoundException e){
            throw new RuntimeException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        for (String[] dato : datos )
            paises.add(new Pais(dato[0],dato[1]));
    }

    public void realizarVotaciones(){
        for (Pais p : paises){
            p.votar(paises);
        }
        for (Pais p : paises){
            Map<Integer,Pais> votos = p.devolverVotos();
            for (Integer puntuacion : votos.keySet()){
                Pais pais = votos.get(puntuacion);
                pais.recibirVoto(puntuacion,p);
            }
        }
    }

    public List<Pais> obtenerListadoPaisesPorPuntuacion(){
        List<Pais> paisList = new ArrayList<>(paises);

        paisList.sort(Comparator.comparingInt(Pais::obtenerPuntuacion).reversed());

        return paisList;
    }

    public List<Pais> obtenerListadoPaisesAlfabeticamente(){
        return paises.stream().sorted().collect(Collectors.toList());
    }

    public Map<Pais, Map<Integer,Pais>> obtenerListadoPaisesYPuntuacionesEmitidas(){
        Map<Pais, Map<Integer,Pais>> aux = new TreeMap<>((p1,p2)->p2.obtenerPuntuacion()-p1.obtenerPuntuacion());

        for (Pais p : paises)
            aux.put(p,p.devolverVotos());

        return aux;
    }

    public List<String> obtenerListadoAlfabeticoCantantes(){
        return paises.stream()
                .map((p) -> p.getCantante())
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Concurso{\n " +
                "paises=\n" + paises +
                '}';
    }
}
