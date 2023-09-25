package universidadgrupo49.entidades;


public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;
    private boolean estado;
    private int nota;
    

    public Materia() {
    }

    public Materia(int idMateria, String nombre, int anio, boolean estado) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public Materia(String nombre, int anio, boolean estado) {
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Materia(int idMateria, String nombre, int anio, boolean estado, int nota) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
    
    
    

    @Override
//    public String toString() {
//        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", anio=" + anio + ", estado=" + estado + '}';
//    }
    
    public String toString() {
        return nombre+" , "+anio;
    }

}
