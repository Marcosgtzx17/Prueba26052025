public class Main {
    public static void main(String[] args) {
        Futbolista f = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        Entrenador e = new Entrenador(2, "Scaloni", "Lionel", 45, "ARG123");
        Masajista m = new Masajista(3, "Pedro", "Gómez", 50, "Fisioterapia", 15);

        f.concentrarse();
        f.entrenar();
        f.jugarPartido();

        e.concentrarse();
        e.dirigirEntrenamiento();

        m.concentrarse();
        m.darMasaje();
    }
}
