class Alumno {
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double asistencia;
    private double finales;
    private double notaTotal;
    private String calificacionCualitativa;

    public Alumno(String nombre, String apellido, String telefono, String correo,
                  double nota1, double nota2, double nota3, double asistencia, double finales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.asistencia = asistencia;
        this.finales = finales;
        calcularNotaTotal();
        calcularCalificacionCualitativa();
    }

    public void calcularNotaTotal() {
        this.notaTotal = (nota1 * 0.2) + (nota2 * 0.2) + (nota3 * 0.2) + (asistencia * 0.1) + (finales * 0.3);
    }

    public void calcularCalificacionCualitativa() {
        if (notaTotal >= 5 && notaTotal < 8) {
            calificacionCualitativa = "Aprobado";
        } else if (notaTotal >= 8 && notaTotal < 10) {
            calificacionCualitativa = "Notable";
        } else if (notaTotal == 10) {
            calificacionCualitativa = "Sobresaliente";
        } else {
            calificacionCualitativa = "Suspenso";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getNotaTotal() {
        return notaTotal;
    }

    public String getCalificacionCualitativa() {
        return calificacionCualitativa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    public void setFinales(double finales) {
        this.finales = finales;
    }
}
