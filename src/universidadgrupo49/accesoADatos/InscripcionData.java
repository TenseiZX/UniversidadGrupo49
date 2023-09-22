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

//import universidadgrupo49.accesoADatos.AlumnoData;
//import universidadgrupo49.entidades.Alumno;
//import universidadgrupo49.entidades.Materia;
public class InscripcionData {

    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    Inscripcion inscripcion = null;
    MateriaData matData;
    AlumnoData aluData;
    Alumno alu;

    public InscripcionData() {
        con = Conexion.getConexion();//Se va a conectar a la base de datos
    }

    public void guardarInscripcion(Inscripcion ins) {

//        Inscripcion ins, int idAlumno, int idMateria
        
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
            JOptionPane.showMessageDialog(null, "error"+ex);
        }
        
//String sql = "insert into inscripcion (nota, idAlumno, idMateria) values (" + inscripcion.getNota() + "," + inscripcion.getAlumno().getIdAlumno() + "," + inscripcion.getMateria().getIdMateria() + ")";
//        try {
//            ps = con.prepareStatement(sql);
//            int filasAfectadas = ps.executeUpdate();
//
//            if (filasAfectadas > 0) {
//
//                JOptionPane.showMessageDialog(null, "inscripcion guardada con exito");
//
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error");
//        }
//String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria) VALUES (?,?,?)";
//
//        
//        try {
//            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            
//            ps.setDouble(1, inscripcion.getNota());
//            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
//            ps.setInt(3, inscripcion.getMateria().getIdMateria());
//
//            ps.executeUpdate();
//
//            rs = ps.getGeneratedKeys();
//            int generatedKey = 0;
//            if (rs.next()) {
//                generatedKey = rs.getInt(1);
//                JOptionPane.showMessageDialog(null,"Inserted record's ID: " + generatedKey);
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"error");
//        }
    }

//    public List<Inscripcion> obtenerInscripciones(){
//        
//        String sql="SELECT idInscripto, nota, idAlumno, idMateria FROM inscripcion WHERE estado=1";
//        
//    
//    }
//    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
//   
//        
//    }
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
            ps.setInt(1, idAlumno);//aca tomamos el id del alumno para dar de baja
            ps.setInt(2, idMateria);//aca tomamos el id de la materia para dar de baja
            
          int msj=JOptionPane.showConfirmDialog(null,"estas seguro que desea dar de baja este alumno?");
          if(msj==0){
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "alumno dado de baja exitosamente");
          }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la BD"+ex);
        }

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
