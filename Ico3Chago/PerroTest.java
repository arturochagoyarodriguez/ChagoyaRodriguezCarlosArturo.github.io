public class PerroTest {
    public static void main(String[] args) {
        // Crear instancias de Perro usando diferentes constructores
        perro perro1 = new perro("Rocky", "Chihuahua", 5.5);
        perro perro2 = new perro("Bambie", "Chihuahua", 6.2, "QuieroTacoBell");

        // Mostrar información de los perros
        System.out.println("\" Información de los Perros \"");
        mostrarInfoPerro(perro1);
        mostrarInfoPerro(perro2);
    }

    // Método auxiliar para mostrar información de un perro
    public static void mostrarInfoPerro(perro perro) {
        System.out.println("Nombre: " + perro.getNombre());
        System.out.println("Raza: " + perro.getRaza());
        System.out.println("Peso: " + perro.getPeso() + " kg");
        System.out.println("Ladrido: " + perro.getLadrido());
        System.out.println("---");
    }
}