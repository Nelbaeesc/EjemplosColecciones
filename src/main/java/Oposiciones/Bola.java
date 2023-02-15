package Oposiciones;

public class Bola {

    private int valor = 0;

    public Bola() {
        this.valor = valorRandom();
        hashCode();
    }
    public int valorRandom() {
        int valor = 0;

        valor += Math.random()*81;
        return valor;
    }

    @Override
    public int hashCode() {
        return valor;
    }

    @Override
    public String toString(){
        return "Tema: " + valor;
    }
}
