package Ejercicio1;

import java.util.*;

public class Solucion2 {

    public static void main(String[] args) {
        Map<Nacionalidad, Set<Empleado>> personal = new TreeMap<>();

        Set<Empleado> spain, alemania, yugoslavo, ruso, mexicano;

        spain = new HashSet<>();
        spain.add(new Empleado("Nelson",21));
        spain.add(new Empleado("Nelson",21));
        personal.put(new Nacionalidad("España"),spain);

        alemania = new HashSet<>();
        alemania.add(new Empleado("Jose Luis",19));
        personal.put(new Nacionalidad("Alemania"),alemania);

        yugoslavo = new HashSet<>();
        yugoslavo.add(new Empleado("Ivan",26));
        personal.put(new Nacionalidad("Yugoslavo"),yugoslavo);

        ruso = new HashSet<>();
        ruso.add(new Empleado("Gabriel",24));
        personal.put(new Nacionalidad("Ruso"),ruso);

        mexicano = new HashSet<>();
        mexicano.add(new Empleado("David",18));
        mexicano.add(new Empleado("Jorge",18));
        personal.put(new Nacionalidad("Mexicano"),mexicano);

        //a)
        System.out.println(personal.keySet());

        //b) arraylist
        List<Empleado> empleadoList = new LinkedList<>();

        for (Set<Empleado> empleadoSet : personal.values()){
            empleadoList.addAll(empleadoSet);
        }

        Collections.sort(empleadoList);
        System.out.println(empleadoList);

        //b) treeset
        Set<Empleado> empleadoSet = new TreeSet<>();

        for (Set<Empleado> ts : personal.values()){
            empleadoSet.addAll(ts);
        }
        System.out.println(empleadoSet);

        //c)
//        HashMap<Nacionalidad, Set<Empleado>> otroMapPersonal = new HashMap<>(personal);
//
//        for (Nacionalidad nacionalidad : new TreeSet<>(otroMapPersonal.keySet()))
//            otroMapPersonal.get(Nacionalidad);
//

    }
}
