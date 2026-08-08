
package modelo;

public class alumno {

    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaDeNacimiento;
    private String gradoAcademico;
    private String alergias;
    private String fechaDeInscripcion;
    private String estatus;
    private String telefonoEstudiante;

    // Constructor completo
    public alumno(int id, String nombre, String apellidoPaterno, String apellidoMaterno,
                  String fechaDeNacimiento, String gradoAcademico, String alergias,
                  String fechaDeInscripcion, String estatus, String telefonoEstudiante) {

        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.gradoAcademico = gradoAcademico;
        this.alergias = alergias;
        this.fechaDeInscripcion = fechaDeInscripcion;
        this.estatus = estatus;
        this.telefonoEstudiante = telefonoEstudiante;
    }

    // Constructor vacío
    public alumno() {
    }

    // Getter y Setter de id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter de apellido paterno
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    // Getter y Setter de apellido materno
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    // Getter y Setter de fecha de nacimiento
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    // Getter y Setter de grado académico
    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    // Getter y Setter de alergias
    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    // Getter y Setter de fecha de inscripción
    public String getFechaDeInscripcion() {
        return fechaDeInscripcion;
    }

    public void setFechaDeInscripcion(String fechaDeInscripcion) {
        this.fechaDeInscripcion = fechaDeInscripcion;
    }

    // Getter y Setter de estatus
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    // Getter y Setter de teléfono
    public String getTelefonoEstudiante() {
        return telefonoEstudiante;
    }

    public void setTelefonoEstudiante(String telefonoEstudiante) {
        this.telefonoEstudiante = telefonoEstudiante;
    }
}
