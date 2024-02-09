import java.util.ArrayList;
import java.util.Scanner;

class GestorAlumnos {
    private ArrayList<Alumno> listaAlumnos;

    public GestorAlumnos() {
        listaAlumnos = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno) {
        listaAlumnos.add(alumno);
    }

    public void mostrarAlumnos() {
        System.out.println("""
    [------|------------|-----------|---------------------|-----------------|---------|--------------]
    |  No. |   Nombre   |  Apellido |       Correo        |     Teléfono    | Nota T. | Calificación |
    [------|------------|-----------|---------------------|-----------------|---------|--------------]
    """);

        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumno alumno = listaAlumnos.get(i);
            int numeroAlumno = i + 1;
            System.out.printf("|  %-3d | %-10s | %-9s | %-19s | %-15s |   %-4.1f | %-11s |\n",
                    numeroAlumno, alumno.getNombre(), alumno.getApellido(),
                    alumno.getCorreo(), alumno.getTelefono(), alumno.getNotaTotal(), alumno.getCalificacionCualitativa());
        }

        System.out.println("+------+------------+-----------+---------------------+-----------------+---------+--------------+");
    }



    public void actualizarAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            Scanner scanner = new Scanner(System.in);
            Alumno alumno = listaAlumnos.get(indice);

            System.out.println("Ingrese los nuevos datos del alumno:");

            System.out.print("Nombre: ");
            alumno.setNombre(scanner.nextLine());

            System.out.print("Apellido: ");
            alumno.setApellido(scanner.nextLine());

            System.out.print("Teléfono: ");
            alumno.setTelefono(scanner.nextLine());

            System.out.print("Correo: ");
            alumno.setCorreo(scanner.nextLine());

            System.out.print("Nota 1: ");
            alumno.setNota1(scanner.nextDouble());

            System.out.print("Nota 2: ");
            alumno.setNota2(scanner.nextDouble());

            System.out.print("Nota 3: ");
            alumno.setNota3(scanner.nextDouble());

            System.out.print("Asistencia: ");
            alumno.setAsistencia(scanner.nextDouble());

            System.out.print("Finales: ");
            alumno.setFinales(scanner.nextDouble());

            alumno.calcularNotaTotal();
            alumno.calcularCalificacionCualitativa();

            System.out.println("Alumno actualizado correctamente.");
        } else {
            System.out.println("Índice de alumno inválido.");
        }
    }

    public void eliminarAlumno(int indice) {
        if (indice >= 0 && indice < listaAlumnos.size()) {
            listaAlumnos.remove(indice);
            System.out.println("Alumno eliminado correctamente.");
        } else {
            System.out.println("Índice de alumno inválido.");
        }
    }
    public void buscarAlumnoPorIniciales(String inicialesNombre, String inicialesApellido) {
        boolean encontrado = false;
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().startsWith(inicialesNombre) && alumno.getApellido().startsWith(inicialesApellido)) {
                System.out.println("Nombre: " + alumno.getNombre() + ", Apellido: " + alumno.getApellido());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron alumnos con esas iniciales.");
        }
    }
}