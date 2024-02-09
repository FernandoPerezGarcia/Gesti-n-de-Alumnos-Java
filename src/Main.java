import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorAlumnos gestorAlumnos = new GestorAlumnos();

        boolean continuar = true;
        while (continuar) {
            System.out.println("Menú:");
            System.out.println("|1| Agregar alumno");
            System.out.println("|2| Mostrar alumnos");
            System.out.println("|3| Actualizar alumno");
            System.out.println("|4| Eliminar alumno");
            System.out.println("|5| Buscar alumno.");
            System.out.println("|6| Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido del alumno: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el teléfono del alumno: ");
                    String telefono = scanner.nextLine();
                    System.out.print("Ingrese el correo del alumno: ");
                    String correo = scanner.nextLine();
                    System.out.print("Ingrese la nota 1 del alumno: ");
                    double nota1 = scanner.nextDouble();
                    System.out.print("Ingrese la nota 2 del alumno: ");
                    double nota2 = scanner.nextDouble();
                    System.out.print("Ingrese la nota 3 del alumno: ");
                    double nota3 = scanner.nextDouble();
                    System.out.print("Ingrese la asistencia del alumno: ");
                    double asistencia = scanner.nextDouble();
                    System.out.print("Ingrese la nota de finales del alumno: ");
                    double finales = scanner.nextDouble();

                    Alumno nuevoAlumno = new Alumno(nombre, apellido, telefono, correo,
                            nota1, nota2, nota3, asistencia, finales);
                    gestorAlumnos.agregarAlumno(nuevoAlumno);
                    break;
                case 2:
                    System.out.println("Listado de alumnos:");
                    gestorAlumnos.mostrarAlumnos();
                    break;
                case 3:
                    System.out.print("Ingrese el índice del alumno a actualizar: ");
                    int indiceActualizar = scanner.nextInt();
                    gestorAlumnos.actualizarAlumno(indiceActualizar);
                    break;
                case 4:
                    System.out.print("Ingrese el índice del alumno a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    gestorAlumnos.eliminarAlumno(indiceEliminar -1);
                    break;
                case 5:
                    System.out.print("Ingrese las iniciales del nombre: ");
                    String inicialesNombre = scanner.nextLine();
                    System.out.print("Ingrese las iniciales del apellido: ");
                    String inicialesApellido = scanner.nextLine();
                    gestorAlumnos.buscarAlumnoPorIniciales(inicialesNombre, inicialesApellido);
                    break;

                case 6:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }

        scanner.close();
    }
}






