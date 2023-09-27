
package universidadgrupo49.vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import universidadgrupo49.accesoADatos.AlumnoData;
import universidadgrupo49.accesoADatos.Conexion;
import universidadgrupo49.entidades.Alumno;

/**
 *
 * @author TenseiZX
 */
public class FormularioAlumno extends javax.swing.JInternalFrame {

    private AlumnoData ad;


    public FormularioAlumno(AlumnoData ad) {
        initComponents();
        AlumnoData objetoAlumno = new AlumnoData();
        objetoAlumno.mostrarAlumnos(jtTablaAlumno);
        this.ad = ad;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaAlumno = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtDocumentodni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jrbEstado = new javax.swing.JRadioButton();
        jbGuardar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));
        setTitle("Seccción alumnos");
        setMinimumSize(new java.awt.Dimension(44, 22));

        jPanel1.setBackground(new java.awt.Color(53, 166, 136));

        jtTablaAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jtTablaAlumno.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtTablaAlumno.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jtTablaAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jtTablaAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaAlumnoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtTablaAlumno);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel1.setText("Formulario de alumno");

        jtDocumentodni.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jtDocumentodni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDocumentodniActionPerformed(evt);
            }
        });
        jtDocumentodni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDocumentodniKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("DNI:");

        jbBuscar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/imagenes/Buscar2525.png"))); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        jtApellido.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jtNombre.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jbModificar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.setEnabled(false);
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jdcFechaNac.setDateFormatString("yyyy-MM-dd");
        jdcFechaNac.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel5.setText("Estado:");

        jbGuardar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        jbLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/universidadgrupo49/imagenes/borrar2525.png"))); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        jLabel7.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel7.setText("ID:");

        jtID.setEditable(false);
        jtID.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtDocumentodni, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addGap(26, 26, 26))
                                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(20, 20, 20)
                                                .addComponent(jrbEstado)
                                                .addGap(107, 107, 107))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jbModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtDocumentodni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpiar))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrbEstado)
                            .addComponent(jLabel5))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbModificar)
                            .addComponent(jbGuardar))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(111, 111, 111))
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
      
        jbGuardar.setEnabled(true);
        jbSalir.setEnabled(true);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        
        jtDocumentodni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jtID.setText("");
        jdcFechaNac.setCalendar(null);//seteo a vacio
        jrbEstado.setSelected(false);//seteo a vacio
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        try {
            int cambiarAInactivo = Integer.parseInt(jtDocumentodni.getText());
            if (ad.buscarAlumnoPorDni(cambiarAInactivo) != null) {
                int msj = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar este alumno?");

                if (msj == 0) {
                    ad.eliminarAlumno(ad.buscarAlumnoPorDni(cambiarAInactivo).getIdAlumno());
                    ad.mostrarAlumnos(jtTablaAlumno);
                    jtDocumentodni.setText("");
                    jtApellido.setText("");
                    jtNombre.setText("");
                    //                    jtcampofecha.setText("");
                    jdcFechaNac.setCalendar(null);//seteo a vacio
                    jrbEstado.setSelected(false);//seteo a vacio
                }

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios");
        }
        
        metodoLimpiar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        
//        try {
//
//            ad.guardarAlumno(new Alumno(Integer.parseInt(jtDocumentodni.getText()), jtApellido.getText(), jtNombre.getText(), jdcFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(), jrbEstado.isSelected()));
//            ad.mostrarAlumnos(jtTablaAlumno);
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios.");
//        }
//
//        metodoLimpiar();
//        
//        ad.mostrarAlumnos(jtTablaAlumno);

        try{ 

            if (!jtNombre.getText().equals("") && !jtApellido.getText().equals("") && !jtDocumentodni.getText().equals("")&&jdcFechaNac.getDate()!=null&&jrbEstado.isSelected()!=false) {
            AlumnoData alu = new AlumnoData();
            String nombre, apellido;
            int dni, idalu;
            boolean estado;
            LocalDate fecha;
            nombre = jtNombre.getText();
            apellido = jtApellido.getText();
            dni = Integer.parseInt(jtDocumentodni.getText());
            if (jrbEstado.isSelected()) {
                estado = true;
            } else {
                estado = false;
            }
            fecha = jdcFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Alumno alumno = new Alumno(dni, apellido, nombre, fecha, estado);
            alu.guardarAlumno(alumno);
        } else {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios.");

        }
        
           } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Error: Se excedio el limite de caracteres permitidos.");
           }
        metodoLimpiar();
        ad.mostrarAlumnos(jtTablaAlumno);


    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        
           try{ 

            if (!jtNombre.getText().equals("") && !jtApellido.getText().equals("") && !jtDocumentodni.getText().equals("") && !jtID.getText().equals("")&&jdcFechaNac.getDate()!=null) {
            AlumnoData alu = new AlumnoData();
            String nombre, apellido;
            int dni, idalu;
            boolean estado;
            LocalDate fecha;
            idalu = Integer.parseInt(jtID.getText());
            nombre = jtNombre.getText();
            apellido = jtApellido.getText();
            dni = Integer.parseInt(jtDocumentodni.getText());
            if (jrbEstado.isSelected()) {
                estado = true;
            } else {
                estado = false;
            }
            fecha = jdcFechaNac.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Alumno alumno = new Alumno(idalu, dni, apellido, nombre, fecha, estado);
            alu.ModificarAlumno(alumno);
        } else {
            JOptionPane.showMessageDialog(null, "Error: No puede haber campos vacios");

        }
        
           } catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(this, "Error: se excedio el limite de caracteres permitidos");
           }
        metodoLimpiar();
        ad.mostrarAlumnos(jtTablaAlumno);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        
        jbGuardar.setEnabled(false);
        jbModificar.setEnabled(true);
        jbEliminar.setEnabled(true);
        jbSalir.setEnabled(true);
        
        
        try {
            Integer dni = Integer.parseInt(jtDocumentodni.getText());
            Alumno alumnoActual = ad.buscarAlumnoPorDni(dni);

            if (alumnoActual != null) {

                jtApellido.setText(alumnoActual.getApellido());
                jtID.setText(String.valueOf(alumnoActual.getIdAlumno()));
                jtNombre.setText(alumnoActual.getNombre());
                jrbEstado.setSelected(alumnoActual.isActivo());
                LocalDate lc = alumnoActual.getFechaNacimiento();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
                jdcFechaNac.setDate(date);

            }else{
            metodoLimpiar();
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Debe ingresar un numero valido.");
            metodoLimpiar();
        }

        
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtDocumentodniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDocumentodniKeyReleased

    }//GEN-LAST:event_jtDocumentodniKeyReleased

    private void jtDocumentodniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDocumentodniActionPerformed
        
    }//GEN-LAST:event_jtDocumentodniActionPerformed

    private void jtTablaAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaAlumnoMouseClicked
        
    }//GEN-LAST:event_jtTablaAlumnoMouseClicked

    private void metodoLimpiar() {
        jtDocumentodni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jdcFechaNac.setCalendar(null);
        jrbEstado.setSelected(false);
        jtID.setText("");
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JRadioButton jrbEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDocumentodni;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtTablaAlumno;
    // End of variables declaration//GEN-END:variables
}
