public abstract class Empleado {
     // Atributos comunes para todos los empleados
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

      // Constructor: inicializa los datos básicos del empleado
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

     // Métodos "getters" para acceder a los atributos
    public String obtenerPrimerNombre() { return primerNombre; }
    public String obtenerApellidoPaterno() { return apellidoPaterno; }
    public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial; }

    // Representación en texto del empleado
    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }

    // Método abstracto: cada subclase definirá cómo calcular ingresos
    public abstract double ingresos();
}
