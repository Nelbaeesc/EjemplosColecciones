package Eurovision;

public class Main {
    public static void main(String[] args) {

        Concurso c = new Concurso();

        c.realizarVotaciones();
        System.out.println(c.obtenerListadoPaisesAlfabeticamente());

    }
}
