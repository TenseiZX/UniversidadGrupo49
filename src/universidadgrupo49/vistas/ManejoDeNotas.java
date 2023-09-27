/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package universidadgrupo49.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.accesoADatos.AlumnoData;
import universidadgrupo49.accesoADatos.InscripcionData;
import universidadgrupo49.accesoADatos.MateriaData;
import universidadgrupo49.entidades.Alumno;
import universidadgrupo49.entidades.Inscripcion;
import universidadgrupo49.entidades.Materia;

public class ManejoDeNotas extends javax.swing.JInternalFrame {

    AlumnoData ad;
    Alumno alu;
    Materia mat;
    Inscripcion ins;
    InscripcionData data;
    MateriaData md;


    DefaultTableModel modelo=new DefaultTableModel(){
        
        boolean[] canEdit = new boolean [] {
                false, false,false, true
            };

            public boolean isCellEditable(int row, int column) {
                return canEdit [column];
            }
        
    };
    public ManejoDeNotas() {
        initComponents();
        cargarComboAlumno();
        armarCabecera();

        data = new InscripcionData();

        this.ad = ad;
        this.alu = alu;
        this.data = data;
        this.md = md;
        this.mat = mat;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaMaterias = new javax.swing.JTable();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(53, 166, 136));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setText("Seleccione un alumno:");

        jcbAlumnos.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jcbAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbAlumnosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jcbAlumnosMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jcbAlumnosMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbAlumnosMouseReleased(evt);
            }
        });
        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jtablaMaterias.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jtablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtablaMaterias);

        jbGuardar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Manejo de notas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(31, 31, 31)
                                .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jbGuardar)
                        .addGap(161, 161, 161)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed

        if (jcbAlumnos.getSelectedIndex() > 0) {
            
            modelo.getDataVector().removeAllElements();
            jtablaMaterias.updateUI();
            
            alu = (Alumno) jcbAlumnos.getSelectedItem();
            
            List<Materia> materias = new ArrayList<>();
            
            materias = data.obtenerMateriasCursadasConNota(alu.getIdAlumno());
            
            for (Materia materia : materias) {
                modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio(), materia.getNota()});
                
            }
            
        }
        
        

    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jcbAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnosMouseClicked

    }//GEN-LAST:event_jcbAlumnosMouseClicked

    private void jcbAlumnosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnosMouseEntered


    }//GEN-LAST:event_jcbAlumnosMouseEntered

    private void jcbAlumnosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnosMouseReleased

    }//GEN-LAST:event_jcbAlumnosMouseReleased

    private void jcbAlumnosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbAlumnosMousePressed

    }//GEN-LAST:event_jcbAlumnosMousePressed


    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        try{
        
        int fila = jtablaMaterias.getSelectedRow();
        
        if (fila < 0) {
            
            JOptionPane.showMessageDialog(this, "seleccione el registro a modificar antes de presionar el boton guardar");

        }else{
        
        alu = (Alumno) jcbAlumnos.getSelectedItem();
        
        data.actualizarNota(alu.getIdAlumno(), (Integer)jtablaMaterias.getValueAt(fila, 0), Integer.parseInt(jtablaMaterias.getValueAt(fila, 3).toString()));
        }
     
        
    }catch(NumberFormatException ex){
JOptionPane.showMessageDialog(this, "error: se excedio el numero de caracteres o se ingresaron caracteres invalidos");
modelo.getDataVector().removeAllElements();
            jtablaMaterias.updateUI();
}

    }//GEN-LAST:event_jbGuardarActionPerformed

    private void cargarComboAlumno() {

        Alumno alum=new Alumno();
        alum.setNombre("Seleccione un alumno");
        alum.setIdAlumno(0);
        alum.setApellido("");
        
        AlumnoData ad = new AlumnoData();
        List<Alumno> alumnos = ad.listarAlumnos();
        jcbAlumnos.addItem(alum);
        

        for (Alumno alumno : alumnos) {
            jcbAlumnos.addItem(alumno);
        }

    }

    private void armarCabecera() {

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        modelo.addColumn("Nota");

        jtablaMaterias.setModel(modelo);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JTable jtablaMaterias;
    // End of variables declaration//GEN-END:variables
}
