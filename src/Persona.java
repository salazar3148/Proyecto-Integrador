public class Persona {
    protected long cedula;
    protected String nombre;
    protected String apellidos;
    protected long celular;
    protected String email;
    protected Direccion direccion;
    protected String ciudad;

    public Persona(long cedula, String nombre, String apellidos, long celular, String email, Direccion direccion, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.email = email;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
}
