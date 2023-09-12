package universidadgrupo49.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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

    public InscripcionData() {
        con = Conexion.getConexion();//Se va a conectar a la base de datos
    }

    public void guardarInscripcion(Inscripcion ins, int idAlumno, int idMateria) {

//        String sql = "INSERT INTO inscripcion(nota, alumno.idAlumno, materia.idMateria) VALUES (?,?,?)";
//        try {
//            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setDouble(1, inscripcion.getNota());
//            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
//            ps.setInt(3, inscripcion.getMateria().getIdMateria());
//            ps.executeUpdate();
//            rs = ps.getGeneratedKeys();
//
//            if (rs.next()) {
//
//                inscripcion.setIdInscripto(rs.getInt(1));
//                JOptionPane.showMessageDialog(null, "inscripcion guardada con exito");
//
//            }
//
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "error");
//        }
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

        
//        String sql="select inscripcion.idMateria, nombre, anio from inscripcion,"
//                + "materia where"
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion "
                    + "JOIN materia ON(inscripcion.idMateria = materia.idMateria) WHERE inscripcion.idAlumno =  ?;";
        try {
            
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            Materia materia;
            
            while(rs.next()){
            materia= new Materia();
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("anio"));
            materias.add(materia);
            }
        ps.close();
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error");
        }
        return materias;
        }
    
    }
    
     


