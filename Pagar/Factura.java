public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        if (cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        if (precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");

        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String obtenerNumeroPieza() { return numeroPieza; }

    public String obtenerDescripcionPieza() { return descripcionPieza; }

    public void establecerCantidad(int cantidad) {
        if (cantidad < 0)
            throw new IllegalArgumentException("Cantidad debe ser >= 0");
        this.cantidad = cantidad;
    }

    public int obtenerCantidad() { return cantidad; }

    public void establecerPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0)
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
        this.precioPorArticulo = precioPorArticulo;
    }

    public double obtenerPrecioPorArticulo() { return precioPorArticulo; }

    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "factura", "número de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
                "cantidad", obtenerCantidad(), "precio por artículo", obtenerPrecioPorArticulo());
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerCantidad() * obtenerPrecioPorArticulo();
    }
}
