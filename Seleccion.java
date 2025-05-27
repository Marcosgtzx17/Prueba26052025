public class Seleccion {
    public static void main(String[] args) {
        Persona[] integrantes = new Persona[3];

        integrantes[0] = new Futbolista(1, "Lionel", "Messi", 36, 10, "Delantero");
        integrantes[1] = new Entrenador(2, "Lionel", "Scaloni", 45, "ARG-1234");
        integrantes[2] = new Masajista(3, "Pedro", "Gomez", 50, "Fisioterapia", 20);

        for (Persona p : integrantes) {
            System.out.println("-----");
            p.viajar();
            p.concentrarse();

            if (p instanceof Futbolista) {
                ((Futbolista) p).entrenar();
                ((Futbolista) p).jugarPartido();
            } else if (p instanceof Entrenador) {
                ((Entrenador) p).dirigirEntrenamiento();
                ((Entrenador) p).dirigirPartido();
            } else if (p instanceof Masajista) {
                ((Masajista) p).darMasaje();
            }
        }
    }
}
