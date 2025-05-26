public class Futbolista extends PersonaSeleccion {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista está en concentración técnica.");
    }

    public void entrenar() {
        System.out.println("El futbolista está entrenando.");
    }

    public void jugarPartido() {
        System.out.println("El futbolista está jugando un partido.");
    }

    // Getters y Setters
    public int getDorsal() { return dorsal; }
    public void setDorsal(int dorsal) { this.dorsal = dorsal; }

    public String getDemarcacion() { return demarcacion; }
    public void setDemarcacion(String demarcacion) { this.demarcacion = demarcacion; }
}
