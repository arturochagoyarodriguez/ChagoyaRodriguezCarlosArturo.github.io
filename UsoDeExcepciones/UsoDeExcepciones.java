// UsoDeExcepciones.java
// demostracion del mecanismo de manejo de excepciones
// try... catch... finally
public class UsoDeExcepciones {
    public static void main(String args[]) {
        try {
            lanzaExcepcion(); // llama al método lanzaExcepcion
        } // fin de try
        catch (Exception exception) // excepcion lanzada por lanzaExcepcion
        {
            System.err.println("La excepción se manejo en main");
        } // fin de catch

        noLanzaExcepcion();
    } // fin de main

    // demuestra los bloques try... catch... finally
    public static void lanzaExcepcion() throws Exception {
        try // lanza una excepcion y la atrapa de inmediato
        {
            System.out.println("Método lanzaExcepcion");
            throw new Exception(); // genera la excepcion
        } // fin de try
        catch (Exception exception) // atrapa la excepcion lanzada en el bloque try
        {
            System.err.println("La excepción se manejo en el método lanzaExcepcion");
            throw exception; // vuelve a lanzar la excepción para procesarla más adelante
            // no se llegaría al código que se coloque aquí, la excepción se vuelve a lanzar en el bloque catch
        } // fin de catch
        finally // se ejecuta sin importar lo que ocurra en los bloques try... catch
        {
            System.err.println("Se ejecuto finally en lanzaExcepcion");
        } // fin de finally

        // no se llega al código que se coloque aquí, la excepción se vuelve a lanzar en el bloque catch
    } // fin del método lanzaExcepcion

    // demuestra el uso de finally cuando no ocurre una excepcion
    public static void noLanzaExcepcion() {
        try // el bloque try no lanza una excepción
        {
            System.out.println("Método noLanzaExcepcion");
        } // fin de try
        catch (Exception exception) // no se ejecuta
        {
            System.err.println(exception);
        } // fin de catch
        finally // se ejecuta sin importar lo que ocurra en los bloques try... catch
        {
            System.err.println("Se ejecuto finally en noLanzaExcepcion");
        } // fin de bloque finally

        System.out.println("Fin del método noLanzaException");
    } // fin del método noLanzaExcepcion
} // fin de la clase UsoDeExcepciones

