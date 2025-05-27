public class Entrenador extends Persona {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() { return idFederacion; }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " " + getApellidos() + " (Entrenador) se está concentrando.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo un entrenamiento.");
    }

    public void dirigirPartido() {
        System.out.println(getNombre() + " " + getApellidos() + " está dirigiendo un partido.");
    }
}

