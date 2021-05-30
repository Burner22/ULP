/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebatransversal.vistas;

import javax.swing.JOptionPane;
import pruebatransversal.entidades.Materia;
import pruebatransversal.modelo.Conexion;
import pruebatransversal.modelo.CursadaData;
import pruebatransversal.modelo.MateriaData;

public class ViewMateriaGuardar extends javax.swing.JInternalFrame {

    CursadaData cs;
    MateriaData mat;

    public ViewMateriaGuardar() {
        initComponents();
        Conexion c = new Conexion();
        mat = new MateriaData(c);
        cs = new CursadaData(c);
        jcEstado.setEnabled(false);
        jbActualizar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbLimpiar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfIdMateria = new javax.swing.JTextField();
        jtfNombre = new javax.swing.JTextField();
        jbBuscarMateria = new javax.swing.JButton();
        jcEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jsAño = new javax.swing.JSpinner();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("Materia");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Año:");

        jLabel4.setText("IdMateria:");

        jLabel5.setText("Estado");

        jtfNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfNombreFocusLost(evt);
            }
        });

        jbBuscarMateria.setText("Buscar");
        jbBuscarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMateriaActionPerformed(evt);
            }
        });

        jcEstado.setEnabled(false);

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jsAño.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jbActualizar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                                .addComponent(jbSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jbBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jsAño, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdMateria)
                    .addComponent(jbBuscarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcEstado)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbActualizar)
                    .addComponent(jbBorrar)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMateriaActionPerformed
        try {
            int idMateria = Integer.valueOf(jtfIdMateria.getText());
            Materia ma = mat.buscarMateria(idMateria);
            jtfNombre.setText(ma.getNombre());
            jsAño.setValue(ma.getAño());
            jcEstado.setSelected(ma.getEstado());

            JOptionPane.showMessageDialog(this, "Se ha encontrado su materia");
            jtfIdMateria.setEnabled(false);
            jbActualizar.setEnabled(true);
            jbBorrar.setEnabled(true);
            jbLimpiar.setEnabled(true);
            jbGuardar.setEnabled(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Para buscar una materia por id ingrese solo numeros");
            jtfIdMateria.setText("");
            jsAño.setValue(1);
            jcEstado.setSelected(false);
            jtfNombre.setText("");
            jtfIdMateria.requestFocus();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "No se ha encontrado su materia");
            jtfIdMateria.setText("");
            jsAño.setValue(1);
            jcEstado.setSelected(false);
            jtfNombre.setText("");
            jtfIdMateria.requestFocus();
        }
    }//GEN-LAST:event_jbBuscarMateriaActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try {
            jbGuardar.setEnabled(true);
            String nombre = jtfNombre.getText();
            int año = (Integer) jsAño.getValue();
            boolean estado = true;

            Materia materia = new Materia(nombre, año, estado);
            mat.agregarMateria(materia);
            jtfIdMateria.setText(materia.getIdMateria() + "");

            JOptionPane.showMessageDialog(this, "Se ha agregado su materia");
            
            jbGuardar.setEnabled(false);
            jbLimpiar.setEnabled(true);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al agregar una materia");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        try {
            int id = Integer.valueOf(jtfIdMateria.getText());
            String nombre = jtfNombre.getText();
            int año = (Integer) jsAño.getValue();

            if (!nombre.isEmpty()) {
                Materia mate = new Materia(nombre, año, true, id);
                mat.actualizarMateria(mate);
                jtfIdMateria.setText(mate.getIdMateria() + "");
                JOptionPane.showMessageDialog(this, "Se ha actualizado su materia");
                jtfIdMateria.setEnabled(true);
                jtfIdMateria.setText("");
                jsAño.setValue(1);
                jcEstado.setSelected(false);
                jtfNombre.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Su materia debe tener un nombre!");
                jtfNombre.requestFocus();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la materia");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        try {
            int id = Integer.valueOf(jtfIdMateria.getText());
            int confirmado = JOptionPane.showConfirmDialog(this, "Desea realizar la actualización");
            if (JOptionPane.OK_OPTION == confirmado) {
                mat.borrarMateriaLogico(id);
                JOptionPane.showMessageDialog(this, "Su Materia ha sido eliminada!");

            } else {
                JOptionPane.showMessageDialog(this, "Se cancelo la operación");
            }
            jtfIdMateria.setEnabled(true);
            jtfIdMateria.setText("");
            jsAño.setValue(1);
            jcEstado.setSelected(false);
            jtfNombre.setText("");
            jbActualizar.setEnabled(false);
            jbBorrar.setEnabled(false);
            jbGuardar.setEnabled(false);
            jbLimpiar.setEnabled(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Para borrar a un alumno se necesita el id de la materia");
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Para borrar a un alumno se necesita el id de la materia");
        }
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        jtfIdMateria.setText("");
        jsAño.setValue(1);
        jcEstado.setSelected(false);
        jtfNombre.setText("");
        jbActualizar.setEnabled(false);
        jbBorrar.setEnabled(false);
        jbGuardar.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jtfIdMateria.setEnabled(true);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfNombreFocusLost
        if (!jtfIdMateria.isEnabled()) {
            jbGuardar.setEnabled(false);
        } else {
            if (jtfNombre.getText().length() > 0) {
                jbGuardar.setEnabled(true);
            }
        }

    }//GEN-LAST:event_jtfNombreFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscarMateria;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JSpinner jsAño;
    private javax.swing.JTextField jtfIdMateria;
    private javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}
