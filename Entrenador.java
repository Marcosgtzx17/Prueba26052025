public class Entrenador extends PersonaSeleccion {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador está preparando tácticas.");
    }

    public void dirigirPartido() {
        System.out.println("El entrenador está dirigiendo el partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador está dirigiendo el entrenamiento.");
    }

    public String getIdFederacion() { return idFederacion; }
    public void setIdFederacion(String idFederacion) { this.idFederacion = idFederacion; }
}
