public class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() { return titulacion; }
    public int getAniosExperiencia() { return aniosExperiencia; }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " " + getApellidos() + " (Masajista) se está concentrando.");
    }

    public void darMasaje() {
        System.out.println(getNombre() + " " + getApellidos() + " está dando un masaje.");
    }
}
