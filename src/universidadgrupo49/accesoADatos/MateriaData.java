package universidadgrupo49.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.entidades.Materia;

public class MateriaData {

    private Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    Materia materia = null;
    ArrayList<Materia> materias = new ArrayList<>();

    public MateriaData() {
        con = Conexion.getConexion();//Se va a conectar a la base de datos
    }

    public void guardarMateria(Materia materia) {

        String sql = "insert into materia(nombre,anio,estado)"
                + "values (?,?,?)";

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            rs = ps.getGeneratedKeys();//genera una sola fila
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));//
                JOptionPane.showMessageDialog(null, "Materia Guardada");
            }
            ps.close();//cierro

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }

    }

    public Materia buscarMateria(int id) {

        String sql = "select nombre,anio,estado from materia where idMateria=? "
                + "and estado=1";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "id de la materia no existe");
            }

            ps.close();//cierro

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }
        return materia;

    }

    public void modificarMateria(Materia materia) {

        String sql = "update materia set nombre=?, anio=?, estado=? where idMateria=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(4, materia.getIdMateria());
            ps.setBoolean(3, materia.isEstado());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "materia modificada exitosamente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }

    }

    public void eliminarMateria(int id) {

        String sql = "update materia set estado=0 where idMateria=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "materia eliminada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla materia");
        }

    }

    public List<Materia> listarMaterias() {

        String sql = "select idMateria, anio, nombre from materia where estado=1";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            Materia materia= new Materia();
                    
            materia.setIdMateria(rs.getInt("idMateria"));
            materia.setNombre(rs.getString("nombre"));
            materia.setAnio(rs.getInt("anio"));
            materia.setEstado(true);
            materias.add(materia);
            
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error ");
        }
        return materias;
        
    }
    
    public void mostrarMaterias(JTable jtTablaMateria){
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        String sql="";
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("año");
        modelo.addColumn("estado");
        
        
        jtTablaMateria.setModel(modelo);
        
        sql="select * from materia;";
        
        String [] datos =new String[4];
        
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
            datos [0]=rs.getString(1);
            datos [1]=rs.getString(2);
            datos [2]=rs.getString(3);
            datos [3]=rs.getString(4);
            
            
            modelo.addRow(datos);
            }
            
            jtTablaMateria.setModel(modelo);
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error al acceder a los datos de la base de datos");
        }
    
    
    }
    
    public void seleccionarMaterias(JTable jtTablaMateria,JTextField id, JTextField nombre, JTextField anio, JRadioButton estado){
    
    try{
        
            int fila=jtTablaMateria.getSelectedRow();
            
            if(fila>=0){
            
                id.setText(jtTablaMateria.getValueAt(fila, 0).toString());
                nombre.setText(jtTablaMateria.getValueAt(fila, 1).toString());
                anio.setText(jtTablaMateria.getValueAt(fila, 2).toString());
                estado.setSelected(true);
                

                
            }
            else{
            JOptionPane.showMessageDialog(null,"error al seleccionar los registros");
            }
        
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"error de seleccion");
        
        }
        
        
    }

}
