package universidadgrupo49.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.entidades.Alumno;
import universidadgrupo49.entidades.Inscripcion;
import universidadgrupo49.entidades.Materia;


public class InscripcionData {

    private Connection con = null;
    
    private MateriaData md=new MateriaData(); //test
    private AlumnoData ad=new AlumnoData();//test
    
    PreparedStatement ps;
    ResultSet rs;
    Inscripcion inscripcion = null;


    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion ins) {


        
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";
        
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1,ins.getNota());
            ps.setInt(2, ins.getAlumno().getIdAlumno());
            ps.setInt(3, ins.getMateria().getIdMateria());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {

                ins.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "inscripcion guardada con exito");

            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: acceso a base de datos"+ex);
        }
        

    }
    
    
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
    
        String sql="update inscripcion set nota = ? where idAlumno = ? and idMateria= ?";
        try {
            ps=con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            
            int resultado= ps.executeUpdate();
            
            if (resultado>0){
            JOptionPane.showMessageDialog(null, "nota actualizada con exito");
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error"+ex);
        }
        
    
        
    }
    
    
    public List <Inscripcion> obtenerInscripciones(){
    ArrayList <Inscripcion> cursadas=new ArrayList<>();
    
    String sql= "select * from inscripcion";
        try {
            ps=con.prepareStatement(sql);
            rs= ps.executeQuery();
            while (rs.next()){
            Inscripcion insc=new Inscripcion();
            insc.setIdInscripto(rs.getInt("idInscripto"));
            Alumno alu= ad.buscarAlumno(rs.getInt("idAlumno"));
            Materia mat= md.buscarMateria(rs.getInt("idMateria"));
            insc.setAlumno(alu);
            insc.setMateria(mat);
            insc.setNota(rs.getDouble("nota"));
            cursadas.add(insc);
            }
            ps.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error"+ex);
        }
    return cursadas;
    }


    
    
    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion "
                + "JOIN materia ON(inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno = ? and estado=1";
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
//        System.out.println(materias);
        return materias;
    }

    public List<Materia> obtenerNoCursadas(int id) {

        List<Materia> materias = new ArrayList<Materia>();

        String sql = "SELECT materia.idMateria, nombre, anio FROM materia WHERE materia.idMateria not in (select idMateria from inscripcion where idAlumno=?)";
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
//        System.out.println(materias);
        return materias;

    }

    public void anularInscripcion(int idAlumno, int idMateria) {

        String sql = "delete from inscripcion where idAlumno=? and idMateria=?";

        try {
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            
          int msj=JOptionPane.showConfirmDialog(null,"¿Estas seguro que desea dar de baja este alumno de esta materia?");
          if(msj==0){
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Alumno dado de baja de la materia");
          }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: al acceder a la BD"+ex);
        }

    }
    
    public List<Materia> obtenerMateriasCursadasConNota(int id) {
        List<Materia> materias = new ArrayList<Materia>();

        String sql = "SELECT inscripcion.idMateria, nombre, anio, nota FROM inscripcion "
                + "JOIN materia ON(inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno = ? and estado=1";
        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            Materia materia;

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setNota(rs.getInt("nota"));
                
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

        return materias;
    }
    
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
    
        ArrayList<Alumno> alumnosMateria=new ArrayList<>();
        
        String sql="select a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado from inscripcion i, alumno a where i.idAlumno = a.idAlumno and idMateria = ? and a.estado=1";
        
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            rs=ps.executeQuery();
            while(rs.next()){
            Alumno alumno=new Alumno();
            alumno.setIdAlumno(rs.getInt("idAlumno"));
            alumno.setDni(rs.getInt("dni"));
            alumno.setApellido(rs.getString("Apellido"));
            alumno.setNombre(rs.getString("nombre"));
            alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
            alumno.setActivo(rs.getBoolean("estado"));
            alumnosMateria.add(alumno);
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al acceder a la tabla inscripcion");
        }
        
        return alumnosMateria;
    }
    
    
    
    
   
                

           
        
    

//    public void modificarMateriaInscripcionActiva(Materia materia) {
//
//        String sql = "update materia set estado=1 where idMateria=?";
//
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setBoolean(3, materia.isEstado());
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "inscripcion modificada exitosamente");
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia-inscripcion");
//        }
//
//    }
}
