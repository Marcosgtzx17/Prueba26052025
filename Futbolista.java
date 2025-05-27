public class Futbolista extends Persona {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() { return dorsal; }
    public String getDemarcacion() { return demarcacion; }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " " + getApellidos() + " (Futbolista) se está concentrando.");
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " " + getApellidos() + " está jugando un partido.");
    }

    public void entrenar() {
        System.out.println(getNombre() + " " + getApellidos() + " está entrenando.");
    }
}
