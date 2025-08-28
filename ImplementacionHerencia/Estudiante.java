import java.util.Date;

public class Estudiante extends Persona {
    private String idAlumno;
    private double promCalif;
    private String carrera;
    private String grado;
    private int anioGraduacion;

    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,
                      String idAlumno, String carrera, String grado, int anioGraduacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento);
        this.idAlumno = idAlumno;
        this.carrera = carrera;
        this.grado = grado;
        this.anioGraduacion = anioGraduacion;
        this.promCalif = 0.0;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getGrado() {
        return grado;
    }

    public int getAnioGraduacion() {
        return anioGraduacion;
    }

    public double obtenerPromedio() {
        return promCalif;
    }

    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

    public void calcularPromedio(String[] calificaciones) {
        double suma = 0;
        for (String c : calificaciones) {
            switch (c) {
                case "A": suma += 4; break;
                case "A-": suma += 3.67; break;
                case "B+": suma += 3.33; break;
                case "B": suma += 3; break;
                case "B-": suma += 2.67; break;
                case "C+": suma += 2.33; break;
                case "C": suma += 2; break;
                case "D": suma += 1; break;
                case "F": suma += 0; break;
                default: suma += 0;
            }
        }
        this.promCalif = suma / calificaciones.length;
    }

    @Override
    public String toString() {
        return "Estudiante: " + obtenerNombreCompleto() +
                "\nFecha Nacimiento: " + obtenerFechaNacimiento() +
                "\nID: " + idAlumno +
                "\nPromedio: " + promCalif +
                "\nCarrera: " + carrera +
                "\nGrado: " + grado +
                "\nAño de Graduación: " + anioGraduacion;
    }
}
