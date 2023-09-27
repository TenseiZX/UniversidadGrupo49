
package universidadgrupo49.vistas;

import javax.swing.JOptionPane;
import universidadgrupo49.accesoADatos.MateriaData;
import universidadgrupo49.entidades.Materia;

/**
 *
 * @author TenseiZX
 */
public class FormularioMateria extends javax.swing.JInternalFrame {

    private MateriaData md;
//    private Materia materiaActual=null;
    
    public FormularioMateria(MateriaData md) {
        initComponents();
//        MateriaData objetoMateria=new MateriaData();
//        objetoMateria.mostrarMaterias(jtTablaMateria);
        this.md = md;
        md.mostrarMaterias(jtTablaMateria);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtAnio = new javax.swing.JTextField();
        jrbEstado = new javax.swing.JRadioButton();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaMateria = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(53, 166, 136));

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Año:");

        jLabel4.setText("Estado:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("Formulario de materias");

        jtTablaMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTablaMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaMateria);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtAnio, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jtID)
                            .addComponent(jrbEstado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre))
                        .addGap(31, 31, 31)
                        .addComponent(jbBuscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbGuardar)
                            .addComponent(jbModificar))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jbSalir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbEstado)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar)
                            .addComponent(jbEliminar))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar)
                            .addComponent(jbLimpiar))
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        
        try{
        md.guardarMateria(new Materia(jtNombre.getText(), Integer.parseInt(jtAnio.getText()), jrbEstado.isSelected()));
        }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(null,"error no puede haber campos vacios");
        }
        
        metodoLimpiar();
        md.mostrarMaterias(jtTablaMateria);
        
       
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        try{
        
        int cambiarAInactivo=Integer.parseInt(jtID.getText());
        
        int msj=JOptionPane.showConfirmDialog(this,"estas seguro que desea eliminar este alumno?");
        
        if(msj==0){
        md.eliminarMateria(cambiarAInactivo);
        
        md.mostrarMaterias(jtTablaMateria);
        metodoLimpiar();
        }
        
        
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "campos vacios");
        }
        
        
        
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtTablaMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMateriaMouseClicked
        
//        md.seleccionarMaterias(jtTablaMateria, jtID, jtNombre, jtAnio, jrbEstado);
        
        
        
    }//GEN-LAST:event_jtTablaMateriaMouseClicked

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        try{
        md.modificarMateria(new Materia(Integer.parseInt(jtID.getText()), jtNombre.getText(), Integer.parseInt(jtAnio.getText()), jrbEstado.isSelected()));
        md.mostrarMaterias(jtTablaMateria);
        
        }catch (NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "error no puede haber campos vacios ");
        }catch (NullPointerException ex){
        JOptionPane.showMessageDialog(null, "no puede haber campos vacios");
        }
        
        
        metodoLimpiar();
        
        
        
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtID.setText("");
        jtAnio.setText("");
        jtNombre.setText("");
        jrbEstado.setSelected(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        
        
//        try {
//        
//        if (jtID.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "el campo esta vacio");
//           
//        } else {
//            
//        
//            Materia materia = md.buscarMateria(Integer.parseInt(jtID.getText()));
//            jtNombre.setText(materia.getNombre());
//            jtAnio.setText(materia.getAnio()+"");
//            jrbEstado.setSelected(materia.isEstado());
//            
//        }
//       
//        
//        } catch (NullPointerException ex){
//        
//            JOptionPane.showMessageDialog(this,"El id de la materia no existe en la base de datos");
//            metodoLimpiar();
//        
//        } catch (NumberFormatException exe){
//        
//            JOptionPane.showMessageDialog(this,"Error: los caracteres no son validos o se supero el limite de caracteres que se pueden ingresar");
//                metodoLimpiar();
//        }

    try{
    
    Integer id= Integer.parseInt(jtID.getText());
    Materia materiaActual=md.buscarMateria(id);
    
    if(materiaActual!=null){
    jtNombre.setText(materiaActual.getNombre());
    jtAnio.setText(materiaActual.getAnio()+"");
    jrbEstado.setSelected(materiaActual.isEstado());
    }
    
    
    
    
    }catch (NullPointerException ex){
        
            JOptionPane.showMessageDialog(this,"El id de la materia no existe en la base de datos");
            metodoLimpiar();
        
        } catch (NumberFormatException exe){
        
            JOptionPane.showMessageDialog(this,"Error: los caracteres no son validos o se supero el limite de caracteres que se pueden ingresar");
                metodoLimpiar();
        }
        
        
         
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void metodoLimpiar(){
        jtID.setText("");
        jtAnio.setText("");
        jtNombre.setText("");
        jrbEstado.setSelected(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtTablaMateria;
    // End of variables declaration//GEN-END:variables
}
