package Ejercicio1;

public class Nacionalidad {

    private String nombre;

    public Nacionalidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString(){
        return "Nacionalidad: " + nombre;
    }


    @Override
    public int hashCode(){
        return nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Nacionalidad))
            return false;

        Nacionalidad n = (Nacionalidad) obj;

        return n.nombre.compareToIgnoreCase(nombre)==0;
    }
}
