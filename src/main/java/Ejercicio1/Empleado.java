package Ejercicio1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Empleado implements Comparable<Empleado>{

    public final static Comparator<Empleado> SORT_BY_AGE = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.edad - o2.edad;
        }
    };
    public final static Comparator<Empleado> SORT_BY_NAME = new Comparator<Empleado>() {
        @Override
        public int compare(Empleado o1, Empleado o2) {
            return o1.nombre.compareToIgnoreCase(o2.nombre);
        }
    } ;

    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString(){
        return "Nombre: " + nombre+"\n"+
                "Edad: " + edad;
    }

    @Override
    public int hashCode(){
        return edad;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Empleado))
            return false;

        Empleado e = (Empleado) obj;

        return e.nombre.compareToIgnoreCase(nombre)==0 && e.edad==edad;
    }

    @Override
    public int compareTo(Empleado o) {
        return nombre.compareToIgnoreCase(o.nombre);
    }

}
