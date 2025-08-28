import java.util.*;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Datos iniciales
        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese apellido paterno:");
        String apPat = sc.nextLine();

        System.out.println("Ingrese apellido materno:");
        String apMat = sc.nextLine();

        System.out.println("Ingrese fecha de nacimiento (yyyy-mm-dd):");
        String fechaStr = sc.nextLine();
        Date fechaNac = java.sql.Date.valueOf(fechaStr);

        System.out.println("Ingrese ID del alumno:");
        String id = sc.nextLine();

        System.out.println("Ingrese carrera:");
        String carrera = sc.nextLine();

        System.out.println("Ingrese grado (Licenciatura, Master, PhD):");
        String grado = sc.nextLine();

        System.out.println("Ingrese año de graduación esperado:");
        int anio = sc.nextInt();
        sc.nextLine();

        Estudiante e = new Estudiante(nombre, apPat, apMat, fechaNac, id, carrera, grado, anio);

        // Calificaciones
        System.out.println("¿Cuántas calificaciones desea ingresar?");
        int n = sc.nextInt();
        sc.nextLine();

        String[] calificaciones = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese calificación #" + (i + 1) + " (A, A-, B+, B, B-, C+, C, D, F):");
            calificaciones[i] = sc.nextLine();
        }

        e.calcularPromedio(calificaciones);
        System.out.println("Promedio calculado: " + e.obtenerPromedio());

        // Cambiar carrera
        System.out.println("¿Desea cambiar de carrera? (si/no)");
        String respuesta = sc.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Ingrese la nueva carrera:");
            String nuevaCarrera = sc.nextLine();
            e.cambiarCarrera(nuevaCarrera);
            System.out.println("Carrera actualizada: " + e.getCarrera());
        }

        System.out.println("\nDatos del estudiante:");
        System.out.println(e.toString());

        System.out.println("\nFin del programa.");
    }
}

