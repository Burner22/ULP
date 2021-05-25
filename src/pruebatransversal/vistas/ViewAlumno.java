
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
    AlumnoData ad;
    
    public ViewAlumno() {
        initComponents();
        Conexion c = new Conexion();
        ad = new AlumnoData(c);
        ocultarBotones();
    }

    public void ocultarBotones(){
        jcEstado.setEnabled(false);
        jbGuardarAlumno.setEnabled(false);
        jbBorarAlumno.setEnabled(false);
        jbActualizar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbBuscaAlumno.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbGuardarAlumno = new javax.swing.JButton();
        jbBorarAlumno = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jtfIdAlumno = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jbBuscaAlumno = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JCheckBox();
        jbLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtfApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfLegajo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("ID:");

        jLabel2.setText("NOMBRE:");

        jLabel3.setText("FECHA DE NACIMIENTO:");

        jbGuardarAlumno.setText("Guardar Alumno");
        jbGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarAlumnoActionPerformed(evt);
            }
        });

        jbBorarAlumno.setText("Borrar Alumno");
        jbBorarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorarAlumnoActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jtfIdAlumno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfIdAlumnoFocusLost(evt);
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

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jLabel4.setText("APELLIDO:");

        jLabel7.setText("LEGAJO:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(97, 97, 97)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jbBuscaAlumno))
                                .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfLegajo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel6)
                            .addGap(40, 40, 40)
                            .addComponent(jcEstado)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addComponent(jLabel5))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbGuardarAlumno)
                            .addGap(18, 18, 18)
                            .addComponent(jbBorarAlumno)
                            .addGap(18, 18, 18)
                            .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscaAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfLegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jdFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(7, 7, 7))
                    .addComponent(jcEstado))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarAlumno)
                    .addComponent(jbBorarAlumno)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar)
                    .addComponent(jButton1))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        SimpleDateFormat fechaFor = new SimpleDateFormat("dd-MM-yyyy");
        int id = Integer.valueOf(jtfIdAlumno.getText());
        String nombre = jtfNombre.getText();
        String apellido = jtfApellido.getText();
        int legajo = Integer.valueOf(jtfLegajo.getText());
        String fecha = fechaFor.format(jdFechaNac.getDate());
        LocalDate fecNac = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));       
        boolean estado = jcEstado.isSelected();      
        Alumno alumno = new Alumno(nombre,apellido,fecNac,legajo,estado,id);
        int confirmado = JOptionPane.showConfirmDialog(this,"Desea realizar la actualización");

                if (JOptionPane.OK_OPTION == confirmado){
                    ad.actualizarAlumno(alumno);
                    jtfIdAlumno.setText(alumno.getIdAlumno()+"");
                    JOptionPane.showMessageDialog(this, "el alumno se actualizo correctamente");
                   
                }else{
                    JOptionPane.showMessageDialog(this, "Se cancelo la operación");
                }
        
        
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBorarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorarAlumnoActionPerformed
        int id = Integer.valueOf(jtfIdAlumno.getText());
        int confirmado = JOptionPane.showConfirmDialog(this,"Se va a eliminar un alumno, ¿esta seguro?");

                if (JOptionPane.OK_OPTION == confirmado){
                    ad.borrarAlumnoLogico(id);
                    JOptionPane.showMessageDialog(this, "el alumno se elimino correctamente");
                   
                }else{
                    JOptionPane.showMessageDialog(this, "Se cancelo la operación");
                }
      
    }//GEN-LAST:event_jbBorarAlumnoActionPerformed

    private void jbGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarAlumnoActionPerformed
        SimpleDateFormat fechaFor = new SimpleDateFormat("dd-MM-yyyy");
        String nombre=jtfNombre.getText();
        String apellido=jtfApellido.getText();
        int legajo = Integer.valueOf(jtfLegajo.getText());
        
        //java.sql.Date fecha1 = (java.sql.Date)jdFechaNac.getDate();
        
        String fecha = fechaFor.format(jdFechaNac.getDate());
        LocalDate fecNac = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        
        boolean estado = true;
        
        Alumno alumno= new Alumno (nombre,apellido,fecNac,legajo,estado);
        ad.agregarAlumno(alumno);
        jtfIdAlumno.setText(alumno.getIdAlumno()+""); 
        jcEstado.setSelected(estado);
        
        JOptionPane.showMessageDialog(null, "Su alumno ha sido agregado!");
    }//GEN-LAST:event_jbGuardarAlumnoActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfIdAlumno.setText("");
        jtfNombre.setText("");
        jtfApellido.setText("");
        jtfLegajo.setText("");
        jdFechaNac.setDate(null);
        jcEstado.setSelected(false);
        ocultarBotones();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaAlumnoActionPerformed
        jbBorarAlumno.setEnabled(true);
        jbActualizar.setEnabled(true);
        jbLimpiar.setEnabled(true);
        
        int idAlumno = Integer.valueOf(jtfIdAlumno.getText());
        Alumno al = ad.buscarAlumno(idAlumno);
        jtfNombre.setText(al.getNombre());
        jbGuardarAlumno.setEnabled(false);
        jtfApellido.setText(al.getApellido());
        jtfLegajo.setText(String.valueOf(al.getLegajo()));
        jdFechaNac.setDate(Date.valueOf(al.getFechNac()));
        jcEstado.setSelected(al.getEstado());
        JOptionPane.showMessageDialog(null, "Se ha encontrado su alumno");
    }//GEN-LAST:event_jbBuscaAlumnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusLost
        if(jtfNombre.getText().length()>0){
            jbGuardarAlumno.setEnabled(true);
        }
    }//GEN-LAST:event_jtfNombreFocusLost

    private void jtfIdAlumnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfIdAlumnoFocusLost
        if(jtfIdAlumno.getText().length()>0){
            jbBuscaAlumno.setEnabled(true);
        }
    }//GEN-LAST:event_jtfIdAlumnoFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorarAlumno;
    private javax.swing.JButton jbBuscaAlumno;
    private javax.swing.JButton jbGuardarAlumno;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcEstado;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JTextField jtfApellido;
    private javax.swing.JTextField jtfIdAlumno;
    private javax.swing.JTextField jtfLegajo;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
