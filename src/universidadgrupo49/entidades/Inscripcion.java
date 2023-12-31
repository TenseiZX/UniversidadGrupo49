package universidadgrupo49.entidades;



public class Inscripcion {

    private int idInscripto;
    private Alumno alumno;//asociacion
    private Materia materia;
    private double nota;

    //vacio
    public Inscripcion() {
    }
    //completo

    public Inscripcion(int idInscripto, Alumno alumno, Materia materia, double nota) {
        this.idInscripto = idInscripto;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    //sin id
    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }
    
    
    

    //
    public Inscripcion(double nota) {
        this.nota = nota;
    }

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        String insc = idInscripto + " " + alumno.getApellido() + ", " + alumno.getNombre() + ", " + materia.getNombre();
        return insc;
    }

}
