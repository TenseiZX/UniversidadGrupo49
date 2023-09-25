package universidadgrupo49.accesoADatos;

import com.toedter.calendar.JDateChooser;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadgrupo49.entidades.Alumno;
import java.util.*;

import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AlumnoData {

    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    Alumno alumno = null;
    ArrayList<Alumno> alumnos = new ArrayList<>();//lista vacia de alumnos 

    public AlumnoData() {
        con = Conexion.getConexion();//Se va a conectar a la base de datos
    }

    //guardar alumno
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno(dni,apellido,nombre,fechaNacimiento,estado)"
                + "VALUES(?,?,?,?,?)";//caracteres comodines
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());//seteo en orden de lo q pase y el tipo de dato
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//por que es del tipo de fecha
            ps.setBoolean(5, alumno.isActivo());//por q es boolean se genera como is
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();//genera una sola fila
            
            
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));//
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
            }
            ps.close();//cierro
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno DESDE METODO GUARDAR ALUMNO");
        }

    }

    public void ModificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni=?,apellido=?, nombre=?,fechaNacimiento=?,estado=? WHERE idAlumno=? ";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());//seteo en orden de lo q pase y el tipo de dato
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//por que es del tipo de fecha
            ps.setInt(6, alumno.getIdAlumno());//por q es boolean se genera como is
            ps.setBoolean(5, alumno.isActivo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado=0 WHERE idAlumno=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);//por parametro el id
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Alumno eliminado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
    }

    public Alumno buscarAlumno(int id) {//solo va a traer los alumnos activos
        String sql = "SELECT dni,apellido,nombre,fechaNacimiento FROM alumno WHERE idAlumno= ? and estado=1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();//ResultSET por q es una consulta
            if (rs.next()) {
                alumno = new Alumno();//El q tiene el constructor vacio
                alumno.setIdAlumno(id);//por que ya lo tengo por parametro
                alumno.setDni(rs.getInt("dni"));//paso las columnas de mi tabla. MISMO NOMBRE
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());// lo combierto a local date
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "El id del Alumno no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dni) {
        String sql = "SELECT idAlumno,dni,apellido,nombre,fechaNacimiento FROM alumno WHERE dni=?";
                

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            rs = ps.executeQuery();//ResultSET por q es una consulta
            if (rs.next()) {
                alumno = new Alumno();//El q tiene el constructor vacio
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));//paso las columnas de mi tabla. MISMO NOMBRE
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());// lo combierto a local date
                alumno.setActivo(true);

            } else {
                JOptionPane.showMessageDialog(null, "El id del Alumno no existe ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumno;

    }

    public List<Alumno> listarAlumnos() {
        String sql = "SELECT idAlumno,dni,apellido,nombre,fechaNacimiento FROM alumno WHERE estado=1";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();//ResultSET por q es una consulta
            while (rs.next()) {//por que tiene mas de una fila
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));//paso las columnas de mi tabla. MISMO NOMBRE
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());// lo combierto a local date
                alumno.setActivo(true);

                alumnos.add(alumno);//guarda los alumnos en la lista

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        return alumnos;

    }
    
    
    public void mostrarAlumnos(JTable tablaAlumno){
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String sql="";
        
        modelo.addColumn("id");
        modelo.addColumn("dni");
        modelo.addColumn("apellido");
        modelo.addColumn("nombre");
        modelo.addColumn("fechaNacimiento");
        modelo.addColumn("estado");
        
        tablaAlumno.setModel(modelo);
        
        sql="select * from alumno where estado=1;";
        
        String [] datos =new String[6];
        
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            datos [0]=rs.getString(1);
            datos [1]=rs.getString(2);
            datos [2]=rs.getString(3);
            datos [3]=rs.getString(4);
            datos [4]=rs.getString(5);
            datos [5]=rs.getString(6);
            
            modelo.addRow(datos);
            }
            
            tablaAlumno.setModel(modelo);
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al acceder a los datos de la base de datos");
        }
        
    }
    
    
    public void seleccionarAlumnos(JTable tablaAlumno,JTextField id, JTextField documento, JTextField apellido, JTextField nombre,JTextField fechaNacimiento){
    
        try{
        
            int fila=tablaAlumno.getSelectedRow();
            
            if(fila>=0){
            
                id.setText(tablaAlumno.getValueAt(fila, 0).toString());
                documento.setText(tablaAlumno.getValueAt(fila, 1).toString());
                apellido.setText(tablaAlumno.getValueAt(fila, 2).toString());
                nombre.setText(tablaAlumno.getValueAt(fila, 3).toString());
                fechaNacimiento.setText(tablaAlumno.getValueAt(fila, 4).toString());
//                estado.setText(tablaAlumno.getValueAt(fila, 5).toString());
                

                
            }
            else{
            JOptionPane.showMessageDialog(null,"error al seleccionar los registros");
            }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"error de seleccion");
        
        }
        
        
    }
    
    
    public void ModificarAlumnoNoPelado(JTextField id, JTextField documento, JTextField apellido, JTextField nombre){
    
        Alumno alumno=new Alumno();
        
        String sql = "UPDATE alumno SET dni=?,apellido=?, nombre=?,fechaNacimiento=? WHERE idAlumno=? ";
        
        try {
            ps=con.prepareStatement(sql);
            
            ps.setString(1, documento.getText());
            ps.setString(2, apellido.getText());
            ps.setString(3, nombre.getText());
            
//            ps.setDate(4,Date.valueOf(alumno.getFechaNacimiento()));
            
            ps.setInt(4,Integer.parseInt(id.getText()));
            
            
//            ps.setDate(4, Date.valueOf(alumno.getFechaNacimiento()));//por que es del tipo de fecha
//            ps.setInt(5, alumno.getIdAlumno());//por q es boolean se genera como is
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"errorrr");
        }
    
    }
    

    
    
      
    
    //METODO PARA IMPRIMIR LA LISTA
//    public List<Alumno> mostrarLista(){} 
    
    
    
    
    
}
