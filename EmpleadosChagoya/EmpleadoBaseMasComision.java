public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    // Subclase de EmpleadoPorComision, con salario base + comisión
    private double salarioBase;

      // Constructor
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
                                   String numeroSeguroSocial,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    
    // Setter con validación
    public void establecerSalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }

    public double obtenerSalarioBase() { return salarioBase; }

    // Representación en texto
    @Override
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("Empleado con base más comisión: %s%nSalario base: $%,.2f",
                super.toString(), obtenerSalarioBase());
    }
}
