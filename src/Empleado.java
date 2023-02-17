public class Empleado extends Persona {
    private int antiguedad;
    private String rh;
    private String tipo;

    public Empleado(long cedula, String nombre, String apellidos, long celular, String email, Direccion direccion, String ciudad, int antiguedad, String rh, String tipo) {
        super(cedula, nombre, apellidos, celular, email, direccion, ciudad);
        this.antiguedad = antiguedad;
        this.rh = rh;
        this.tipo = tipo;
    }
}
