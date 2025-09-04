public abstract class Empleado implements PorPagar {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String obtenerPrimerNombre() { return primerNombre; }

    public String obtenerApellidoPaterno() { return apellidoPaterno; }

    public String obtenerNumeroSeguroSocial() { return numeroSeguroSocial; }

    @Override
    public String toString() {
        return String.format("%s %s%nnúmero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }
}
