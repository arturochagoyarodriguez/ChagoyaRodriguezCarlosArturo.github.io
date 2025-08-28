public class EmpleadoAsalariado extends Empleado {
    // Subclase de Empleado para empleados con salario fijo semanal
    private double salarioSemanal;

    // Constructor: inicializa atributos heredados y propios
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, 
                              String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.salarioSemanal = salarioSemanal;
    }

    // Setter con validación
    public void establecerSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");
        this.salarioSemanal = salarioSemanal;
    }

    public double obtenerSalarioSemanal() { return salarioSemanal; }

     // Representación en texto
    @Override
    public double ingresos() { return obtenerSalarioSemanal(); }

    @Override
    public String toString() {
        return String.format("Empleado asalariado: %s%nSalario semanal: $%,.2f",
                super.toString(), obtenerSalarioSemanal());
    }
}
