package pruebatransversal.vistas;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import pruebatransversal.entidades.Alumno;
import pruebatransversal.modelo.AlumnoData;
import pruebatransversal.modelo.Conexion;
//import pruebatransversal.modelo.CursadaData;

public class ViewAlumno extends javax.swing.JInternalFrame {

    private AlumnoData ad;

    public ViewAlumno() {
        initComponents();
        Conexion c = new Conexion();
        ad = new AlumnoData(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jtfLegajo = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jDateFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jbBuscaAlumno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcbEstado = new javax.swing.JCheckBox();
        jbLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();

        jLabel1.setText("LEGAJO:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("FECHA DE NACIMIENTO:");

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.setEnabled(false);
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.setEnabled(false);
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jtfLegajo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfLegajoFocusLost(evt);
            }
        });

        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNombreFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setText("ALUMNOS");

        jbBuscaAlumno.setText("Buscar");
        jbBuscaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaAlumnoActionPerformed(evt);
            }
        });

        jLabel6.setText("ESTADO:");

        jcbEstado.setEnabled(false);

        jbLimpiar.setText("Limpiar");
        jbLimpiar.setEnabled(false);
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("APELLIDO:");

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfLegajo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscaAlumno)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(jDateFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfApellido))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbEstado)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jbGuardar)
                        .addGap(8, 8, 8)
                        .addComponent(jbBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbBuscaAlumno))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2))
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel3))
                            .addComponent(jDateFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbBorrar)
                            .addComponent(jbGuardar)
                            .addComponent(jbActualizar)
                            .addComponent(jbLimpiar)
                            .addComponent(jbSalir))
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbEstado)
                        .addGap(176, 176, 176))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        SimpleDateFormat formatFecha = new SimpleDateFormat("dd-MM-yyyy");

        try {
            int legajoAlumno = Integer.parseInt(jtfLegajo.getText());
            String apellidoAlumno = jtfApellido.getText();
            String nombreAlumno = jtfNombre.getText();
            String auxFecha = formatFecha.format(jDateFechaNac.getDate());
//            boolean estadoAlumno = jcbEstado.isSelected();

            if (apellidoAlumno.isEmpty() || nombreAlumno.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Para Actualizar a un alumno se necesitan todos los datos del mismo");
            } else if (esNumerico(apellidoAlumno)) {
                JOptionPane.showMessageDialog(this, "Colocar solo letras en el apellido del alumno");
                jtfApellido.requestFocus();
            } else if (esNumerico(nombreAlumno)) {
                JOptionPane.showMessageDialog(this, "Colocar solo letras en el nombre del alumno");
                jtfNombre.requestFocus();
            } else {
                int confirmarActualizar = JOptionPane.showConfirmDialog(this, "Se va ha actualizar un alumno ¿Esta seguro?");

                if (JOptionPane.OK_OPTION == confirmarActualizar) {
                    Alumno alumnoActualizar = ad.buscarAlumnoXLegajo(legajoAlumno);
                    alumnoActualizar.setApellido(jtfApellido.getText());
                    alumnoActualizar.setNombre(jtfNombre.getText());
                    alumnoActualizar.setFechNac(LocalDate.parse(auxFecha, DateTimeFormatter.ofPattern("dd-MM-yyyy")));

                    ad.actualizarAlumno(alumnoActualizar);
                    limpiarTextFields();
                    jbGuardar.setEnabled(false);
                    jbActualizar.setEnabled(false);
                    jbBorrar.setEnabled(false);
                    jbLimpiar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Se cancelo la operacion");
                }
            }

        } catch (NullPointerException | NumberFormatException nEx) {
            JOptionPane.showMessageDialog(this, "Para actualizar a un alumno se necesitan todos los datos del mismo");
        }


    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        try {
            int legajoAlumno = Integer.parseInt(jtfLegajo.getText());
            int idAlumno = ad.buscarAlumnoXLegajo(legajoAlumno).getIdAlumno();
            

            if (jtfApellido.getText().isEmpty() || jtfNombre.getText().isEmpty() || jDateFechaNac.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Para Borrar a un alumno se necesitan todos los datos del mismo");
            } else {
                int confirmarBorrar = JOptionPane.showConfirmDialog(this, "Se va a eliminar un alumno, ¿Desea continuar?");
                if (JOptionPane.OK_OPTION == confirmarBorrar) {
                    ad.borrarAlumnoLogico(idAlumno);
                    JOptionPane.showMessageDialog(this, "El Alumno se elimino correctamente");
                } else {
                    JOptionPane.showMessageDialog(this, "Se cancelo la operacion");
                }
            }

            limpiarTextFields();
            jbBorrar.setEnabled(false);
            jbActualizar.setEnabled(false);
            jbLimpiar.setEnabled(false);
        } catch (NumberFormatException | NullPointerException numEx) {
            JOptionPane.showMessageDialog(this, "Para borrar un alumno se necesitan todos los datos del mismo");
            limpiarTextFields();
            jbBorrar.setEnabled(false);
            jbActualizar.setEnabled(false);
            jbLimpiar.setEnabled(false);
        }

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        SimpleDateFormat formatFecha = new SimpleDateFormat("dd-MM-yyyy");
        
        try{
            int legajoAlumno = Integer.parseInt(jtfLegajo.getText());
            String apellidoAlumno = jtfApellido.getText();
            String nombreAlumno = jtfNombre.getText();
            
            String auxFecha = formatFecha.format(jDateFechaNac.getDate());
            LocalDate fechaNac = LocalDate.parse(auxFecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            
            //Cada vez que se agrega a un alumno su estado en la universidad es activo.
            boolean estadoAlumno = true;
            
            if (apellidoAlumno.isEmpty() || nombreAlumno.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Para dar de alta a un alumno se necesitan todos los datos del mismo");
            } else if (esNumerico(apellidoAlumno)) {
                JOptionPane.showMessageDialog(this, "Colocar solo letras en el apellido del alumno");
                jtfApellido.requestFocus();
            } else if (esNumerico(nombreAlumno)) {
                JOptionPane.showMessageDialog(this, "Colocar solo letras en el nombre del alumno");
                jtfNombre.requestFocus();
            } else {
                Alumno alumnoNuevo = new Alumno(nombreAlumno, apellidoAlumno, fechaNac, legajoAlumno, estadoAlumno);
                ad.agregarAlumno(alumnoNuevo);
                limpiarTextFields();
                jbGuardar.setEnabled(false);
                jbActualizar.setEnabled(false);
                jbBorrar.setEnabled(false);
                jbLimpiar.setEnabled(false);
            }
        } catch (NumberFormatException | NullPointerException numEx){
            JOptionPane.showMessageDialog(this, "Para dar de alta a un alumno se necesitan todos los datos del mismo");
        }
        
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarTextFields();
        jbGuardar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jbActualizar.setEnabled(false);
        jbLimpiar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaAlumnoActionPerformed
        try {
            int legajoAlumno = Integer.parseInt(jtfLegajo.getText());
            Alumno alumnoXLegajo = ad.buscarAlumnoXLegajo(legajoAlumno);

            if (alumnoXLegajo != null && alumnoXLegajo.getEstado()) {
                jtfApellido.setText(alumnoXLegajo.getApellido());
                jtfNombre.setText(alumnoXLegajo.getNombre());
                jDateFechaNac.setDate(Date.valueOf(alumnoXLegajo.getFechNac()));
                jcbEstado.setSelected(alumnoXLegajo.getEstado());

                jbBorrar.setEnabled(true);
                jbActualizar.setEnabled(true);
                jbLimpiar.setEnabled(true);
            } else if (alumnoXLegajo != null && !alumnoXLegajo.getEstado()) {
                JOptionPane.showMessageDialog(this, "No se ha encontrado a un alumno con ese legajo");
                limpiarTextFields();
                jcbEstado.setEnabled(false);
                jbBorrar.setEnabled(false);
                jbActualizar.setEnabled(false);
                jbLimpiar.setEnabled(false);
                jtfLegajo.requestFocus();
            } else {
                limpiarTextFields();
                jbBorrar.setEnabled(false);
                jbActualizar.setEnabled(false);
                jbLimpiar.setEnabled(false);
                jtfLegajo.requestFocus();
            }

        } catch (NumberFormatException | NullPointerException nEx) {
            JOptionPane.showMessageDialog(this, "Para buscar un legajo ingrese solo numeros");
            limpiarTextFields();
            jbBorrar.setEnabled(false);
            jbActualizar.setEnabled(false);
            jbLimpiar.setEnabled(false);
            jtfLegajo.requestFocus();
        }
    }//GEN-LAST:event_jbBuscaAlumnoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusLost
        if (jtfNombre.getText().length() > 0) {
            jbGuardar.setEnabled(true);
        }
    }//GEN-LAST:event_jtfNombreFocusLost

    private void jtfLegajoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfLegajoFocusLost
        if (jtfLegajo.getText().length() > 0) {
            jbBuscaAlumno.setEnabled(true);
        }
    }//GEN-LAST:event_jtfLegajoFocusLost

    public void limpiarTextFields() {
        jtfLegajo.setText("");
        jtfApellido.setText("");
        jtfNombre.setText("");
        jDateFechaNac.setDate(null);
        jcbEstado.setSelected(false);
    }

    public boolean esNumerico(String str) {
        char aux[];
        aux = str.toCharArray();

        for (char c : aux) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateFechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscaAlumno;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
