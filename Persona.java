public abstract class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public int getEdad() { return edad; }

    public void viajar() {
        System.out.println(nombre + " " + apellidos + " está viajando con la selección.");
    }

    public abstract void concentrarse();
}
