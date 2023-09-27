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

public class ManejoInscripciones extends javax.swing.JInternalFrame {
    
    AlumnoData ad;
    Alumno alu;
    Materia mat;
    InscripcionData data;
    MateriaData md;
    DefaultTableModel modelo=new DefaultTableModel(){
        
        boolean[] canEdit = new boolean [] {
                false, false,false
            };

            public boolean isCellEditable(int row, int column) {
                return canEdit [column];
            }
        
    };
    
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
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(53, 166, 136));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setText("Alumno:");

        jcbAlumno.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Listado de materias");

        jrInscriptas.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jrInscriptas.setText("Materias inscriptas");
        jrInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInscriptasActionPerformed(evt);
            }
        });

        jrNoinscriptas.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jrNoinscriptas.setText("Materias no inscriptas");
        jrNoinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoinscriptasActionPerformed(evt);
            }
        });

        tablaMaterias.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
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

        jbInscribir.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnular.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbAnular.setText("Anular inscripcion");
        jbAnular.setEnabled(false);
        jbAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/imagenes/borrar3030.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setText("Manejo de inscripciones");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jbInscribir)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAnular)
                                .addGap(55, 55, 55)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jbLimpiar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jrInscriptas)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrNoinscriptas))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel2)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrInscriptas)
                    .addComponent(jrNoinscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbLimpiar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnular)
                    .addComponent(jButton3)
                    .addComponent(jbInscribir))
                .addContainerGap(34, Short.MAX_VALUE))
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

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed

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

        try {

            alu = (Alumno) jcbAlumno.getSelectedItem();

            int fila=tablaMaterias.getSelectedRow();

            if (fila>=0){

                data.anularInscripcion(alu.getIdAlumno(), Integer.parseInt(tablaMaterias.getValueAt(fila,0).toString()));

            }else{
                JOptionPane.showMessageDialog(null,"Error: Seleccione una inscripcion de la lista que quiera deinscribir.");

            }

        }catch (ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null,"Error: debe seleecionar una materia antes de anular la inscripcion.");
        }

        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();
//        jrInscriptas.setSelected(true);
//        jrNoinscriptas.setSelected(false);
        cargarCursadas();

    }//GEN-LAST:event_jbAnularActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed

        try {

            int fila=tablaMaterias.getSelectedRow();

            if (fila>=0){

                alu = (Alumno) jcbAlumno.getSelectedItem();

                int materiaid=(Integer) modelo.getValueAt(fila, 0);

                String nombreMat=(String)modelo.getValueAt(fila, 1);

                int anio=(Integer) modelo.getValueAt(fila, 2);

                Materia m=new Materia(materiaid, nombreMat, anio, true);

                Inscripcion i=new Inscripcion(alu,m,0);
                data.guardarInscripcion(i);

            }else{
                JOptionPane.showMessageDialog(null, "Error: Primero debe seleccionar una materia de la tabla que quiera inscribir.");
            }

        }catch (ArrayIndexOutOfBoundsException ex){
            JOptionPane.showMessageDialog(null,"Error: debe seleecionar una materia antes de Inscribirla");
        }

        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();
//        jrNoinscriptas.setSelected(true);
//        jrInscriptas.setSelected(false);
        cargarNoCursadas();

    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jrNoinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoinscriptasActionPerformed
        
        jbAnular.setEnabled(false);
        jbInscribir.setEnabled(true);
        
        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();

        jrInscriptas.setSelected(false);

        if (jrInscriptas.isSelected()) {
            jrInscriptas.setSelected(false);
        } else if (jrNoinscriptas.isSelected()) {
            jrNoinscriptas.setSelected(true);
        }

        cargarNoCursadas();

       
    }//GEN-LAST:event_jrNoinscriptasActionPerformed

    private void jrInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInscriptasActionPerformed
        
        jbInscribir.setEnabled(false);
        jbAnular.setEnabled(true);
        
        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();

        jrNoinscriptas.setSelected(false);

        if (jrInscriptas.isSelected()) {
            jrInscriptas.setSelected(true);
        } else if (jrNoinscriptas.isSelected()) {
            jrNoinscriptas.setSelected(false);
        }

        cargarCursadas();
        
    }//GEN-LAST:event_jrInscriptasActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
        modelo.getDataVector().removeAllElements();
        tablaMaterias.updateUI();
        jrNoinscriptas.setSelected(false);
        jrInscriptas.setSelected(false);
    }//GEN-LAST:event_jcbAlumnoActionPerformed
    
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

    }
    
    private void cargarCursadas() {

        alu = (Alumno) jcbAlumno.getSelectedItem();
        List<Materia> materias = new ArrayList<>();
        materias = data.obtenerMateriasCursadas(alu.getIdAlumno());
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
    private javax.swing.JLabel jLabel3;
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
