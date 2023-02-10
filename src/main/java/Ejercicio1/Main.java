package Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<Empleado,Nacionalidad> personal = new HashMap<>();

        personal.put(new Empleado("Nelson",21),new Nacionalidad("Española"));
        personal.put(new Empleado("Nelson",21),new Nacionalidad("Española"));
        personal.put(new Empleado("Ivan",26),new Nacionalidad("Yugoslavo"));
        personal.put(new Empleado("Jose Luis",19),new Nacionalidad("Aleman"));
        personal.put(new Empleado("Gabriel",24),new Nacionalidad("Ruso"));
        personal.put(new Empleado("David",18),new Nacionalidad("Mexicano"));
        personal.put(new Empleado("Jorge",18),new Nacionalidad("Mexicano"));


        for( Empleado e: personal.keySet())
            System.out.println(e);

        for (Nacionalidad nacionalidad : new HashSet<>(personal.values()))
            System.out.println(nacionalidad);

        Set<Empleado> empleados = new TreeSet<>(personal.keySet());
        System.out.println(empleados);

        List<Empleado> t = new ArrayList<>(personal.keySet());
        t.sort(Empleado.SORT_BY_NAME);


    }
}
