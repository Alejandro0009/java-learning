
package modelo;


public class alumno {
    
    private int id_alumno;
    private String nombre;
    private int edad;
    private String grado;
    private String telefono;
    private String correo;
    private String fecha_registro;

    public alumno(int id_alumno, String nombre, int edad, String grado, String telefono, String correo, String fecha_registro) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
        this.telefono = telefono;
        this.correo = correo;
        this.fecha_registro = fecha_registro;
    }

    public alumno() {
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
    
    
    
    
    
}
