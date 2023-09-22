package universidadgrupo49.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import universidadgrupo49.accesoADatos.AlumnoData;
import universidadgrupo49.accesoADatos.InscripcionData;
import universidadgrupo49.accesoADatos.MateriaData;
import universidadgrupo49.entidades.Alumno;
import universidadgrupo49.entidades.Inscripcion;
import universidadgrupo49.entidades.Materia;

public class ManejoInscripciones extends javax.swing.JInternalFrame {
    
    AlumnoData ad;
    Alumno alu;
    Materia mat;
    InscripcionData data;
    MateriaData md;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public ManejoInscripciones() {
        initComponents();
        data = new InscripcionData();
        cargarComboAlumno();
        armarCabecera();
        
        this.ad = ad;
        this.alu = alu;
        this.data = data;
        this.md = md;
        this.mat=mat;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jrInscriptas = new javax.swing.JRadioButton();
        jrNoinscriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        jLabel1.setText("Alumno");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Listado de materias");

        jrInscriptas.setText("Materias inscriptas");
        jrInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInscriptasActionPerformed(evt);
            }
        });

        jrNoinscriptas.setText("Materias no inscriptas");
        jrNoinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoinscriptasActionPerformed(evt);
            }
        });

        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaMaterias);

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular inscripcion");
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jrInscriptas)
                                .addGap(36, 36, 36)
                                .addComponent(jrNoinscriptas))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jbInscribir)
                        .addGap(138, 138, 138)
                        .addComponent(jbAnular)
                        .addGap(139, 139, 139)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addComponent(jbLimpiar)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrInscriptas)
                    .addComponent(jrNoinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbLimpiar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir)
                    .addComponent(jbAnular)
                    .addComponent(jButton3))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        
        
        
        
        
        int fila=tablaMaterias.getSelectedRow();
        
        if (fila>=0){
            
            alu = (Alumno) jcbAlumno.getSelectedItem();
        
            int materiaid=(Integer) modelo.getValueAt(fila, 0);
            
            String nombreMat=(String)modelo.getValueAt(fila, 1);
            
            int anio=(Integer) modelo.getValueAt(fila, 2);
            
            Materia m=new Materia(materiaid, nombreMat, anio, true);
            
            Inscripcion i=new Inscripcion(alu,m,0);
            data.guardarInscripcion(i);
            
        }
        
       
        
        
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed

    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private void jrInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInscriptasActionPerformed
        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();
        
        jrNoinscriptas.setSelected(false);
        
        if (jrInscriptas.isSelected()) {
            jrInscriptas.setSelected(true);
        } else if (jrNoinscriptas.isSelected()) {
            jrNoinscriptas.setSelected(false);
        }
        
        cargarCursadas();
        
//        jrInscriptas.setSelected(true);
    }//GEN-LAST:event_jrInscriptasActionPerformed

    private void jrNoinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoinscriptasActionPerformed
        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();
        
        jrInscriptas.setSelected(false);
        
        if (jrInscriptas.isSelected()) {
            jrInscriptas.setSelected(false);
        } else if (jrNoinscriptas.isSelected()) {
            jrNoinscriptas.setSelected(true);
        }
        
        
        
        
        cargarNoCursadas();
        
//        jrNoinscriptas.setSelected(true);
    }//GEN-LAST:event_jrNoinscriptasActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

//        tablaMaterias.setModel(new DefaultTableModel(null,new String[]{"id","nombre","año"}));
        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();
        
        if (jrInscriptas.isSelected()) {
            jrInscriptas.setSelected(false);
        } else if (jrNoinscriptas.isSelected()) {
            jrNoinscriptas.setSelected(false);
        }
        

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jbAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularActionPerformed
        
        alu = (Alumno) jcbAlumno.getSelectedItem();
        
        int fila=tablaMaterias.getSelectedRow();
        
        if (fila>=0){
        
            data.anularInscripcion(alu.getIdAlumno(), Integer.parseInt(tablaMaterias.getValueAt(fila,0).toString()));
            
        }
        
        cargarCursadas();
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jbAnularActionPerformed
    
    private void cargarComboAlumno() {
        
        AlumnoData ad = new AlumnoData();
        List<Alumno> alumnos = ad.listarAlumnos();
        
        for (Alumno alumno : alumnos) {
            jcbAlumno.addItem(alumno);
        }
        
    }
    
    private void armarCabecera() {
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("año");
        
        tablaMaterias.setModel(modelo);

//        String[] datos = new String[3];
//
//        tablaMaterias.setModel(modelo);
    }
    
    private void cargarCursadas() {

//    data.mostrarCursado(tablaMaterias);
        alu = (Alumno) jcbAlumno.getSelectedItem();
        
        List<Materia> materias = new ArrayList<>();
//        System.out.println(alu.getIdAlumno());
//        System.out.println(data.obtenerMateriasCursadas(1));
        materias = data.obtenerMateriasCursadas(alu.getIdAlumno());
//        System.out.println(materias);
        
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
        }
        
    }
    
    private void cargarNoCursadas() {
        
        alu = (Alumno) jcbAlumno.getSelectedItem();
        
        List<Materia> materias = new ArrayList<>();
        materias = data.obtenerNoCursadas(alu.getIdAlumno());
        for (Materia materia : materias) {
            modelo.addRow(new Object[]{materia.getIdMateria(), materia.getNombre(), materia.getAnio()});
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrInscriptas;
    private javax.swing.JRadioButton jrNoinscriptas;
    private javax.swing.JTable tablaMaterias;
    // End of variables declaration//GEN-END:variables
}
