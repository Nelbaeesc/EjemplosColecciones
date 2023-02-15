package Ejercicio1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Map<Nacionalidad,Set<Empleado>> personal1 = new HashMap<>();
        Map<Empleado,Nacionalidad> personal = new HashMap<>();

        personal.put(new Empleado("Nelson",21),new Nacionalidad("Española"));
        personal.put(new Empleado("Nelson",21),new Nacionalidad("Española"));
        personal.put(new Empleado("Ivan",26),new Nacionalidad("Yugoslavo"));
        personal.put(new Empleado("Jose Luis",19),new Nacionalidad("Aleman"));
        personal.put(new Empleado("Gabriel",24),new Nacionalidad("Ruso"));
        personal.put(new Empleado("David",18),new Nacionalidad("Mexicano"));
        personal.put(new Empleado("Jorge",18),new Nacionalidad("Mexicano"));


        //Obtener un listado de solo las nacionalidades de la empresa.
        for( Empleado e: personal.keySet())
            System.out.println(e);

        System.out.println("-----------------------");

        //Listado de solo los trabajadores ordenados por su orden natural (alfabético).
        // Esto lo deberemos hacer al menos de dos maneras diferentes
        for (Nacionalidad nacionalidad : new HashSet<>(personal.values()))
            System.out.println(nacionalidad);

        Set<Empleado> empleados = new TreeSet<>(personal.keySet());
        System.out.println(empleados);

        List<Empleado> t = new ArrayList<>(personal.keySet());
        t.sort(Empleado.SORT_BY_NAME);

        System.out.println("-----------------------");

        // Listado de las nacionalidades por orden alfabético y sus trabajadores por edad.
        Map<Nacionalidad,Set<Empleado>> aux = new TreeMap<>();
        for (Empleado empleado : personal.keySet()){
            Nacionalidad nacionalidad = personal.get(empleado);

            if (aux.containsKey(nacionalidad)){
                aux.get(nacionalidad).add(empleado);
            }else {
                Set<Empleado> empleados1 = new TreeSet<>(Empleado.SORT_BY_AGE);
                empleados1.add(empleado);
                aux.put(nacionalidad,empleados1);
            }
        }
        System.out.println(aux);

        System.out.println("-----------------------");

        

    }
}
