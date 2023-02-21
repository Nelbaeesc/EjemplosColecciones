package Eurovision;

import java.lang.management.ManagementPermission;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Concurso c = new Concurso();

      c.rellenarPaises("/home/nbaeze/IdeaProjects/EjemplosColecciones/informacion.txt");
      c.realizarVotaciones();
      c.imprimirL("/home/nbaeze/IdeaProjects/EjemplosColecciones/informacion.txt");

//        Map<Pais, Map<Integer,Pais>> aux = c.obtenerListadoPaisesYPuntuacionesEmitidas();
//        for (Pais p : aux.keySet()){
//            System.out.println(p);
//            Map<Integer,Pais> votos = aux.get(p);
//            for (Integer i : votos.keySet())
//                System.out.println(i + "->" + votos.get(i).getNombre() + "," );
//            System.out.println();
//        }
    }
}
