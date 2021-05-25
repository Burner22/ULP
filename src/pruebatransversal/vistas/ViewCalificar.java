
package pruebatransversal.vistas;



import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pruebatransversal.entidades.Alumno;
import pruebatransversal.entidades.Cursada;
import pruebatransversal.entidades.Materia;
import pruebatransversal.modelo.AlumnoData;
import pruebatransversal.modelo.Conexion;
import pruebatransversal.modelo.CursadaData;

public final class ViewCalificar extends javax.swing.JInternalFrame {
    AlumnoData ad;
    CursadaData id;
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ViewCalificar() {
        initComponents();
        Conexion c = new Conexion();
        ad = new AlumnoData (c);
        id = new CursadaData (c);
        armaCabeceraTabla();
        cargaAlumnos();  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jbGuardarNota = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtIngresarNota = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Nombre: ");

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jbGuardarNota.setText("Guardar");
        jbGuardarNota.setEnabled(false);
        jbGuardarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarNotaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtIngresarNota.setModel(new javax.swing.table.DefaultTableModel(
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
        jtIngresarNota.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jtIngresarNotaComponentAdded(evt);
            }
        });
        jScrollPane2.setViewportView(jtIngresarNota);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("CALIFICACIONES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jbGuardarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(197, 197, 197)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel2)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbGuardarNota))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        cargaDatos();
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jbGuardarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarNotaActionPerformed
        int filaSeleccionada = jtIngresarNota.getSelectedRow();
        
        if(filaSeleccionada != -1){
            Alumno a = (Alumno)jcbAlumnos.getSelectedItem();
            Materia m=new Materia();
            int idInscripcion=(Integer) modelo.getValueAt(filaSeleccionada, 0);
            m.setNombre((String)modelo.getValueAt(filaSeleccionada, 1));
            double nota = Double.parseDouble(modelo.getValueAt(filaSeleccionada, 2).toString());
            
            Cursada cursada;
            cursada = id.buscarInscripcion(idInscripcion);
            cursada.setNota(nota);
            cursada.setMater(m);
            cursada.setAlum(a);
            
            id.actualizarNotaCursada(idInscripcion,a.getIdAlumno(),nota);
            
            /*Materia aux = id.buscarMateria(m.getIdMateria());
            id.actualizarNotaCursada(aux.getIdMateria(),nota,idInscripcion,a.getIdAlumno());*/
            
            borraFilasTabla();
            cargaDatos();
            JOptionPane.showMessageDialog(null, "Se cambio la nota");
            jtIngresarNota.clearSelection ();
        }
    }//GEN-LAST:event_jbGuardarNotaActionPerformed

    private void jtIngresarNotaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jtIngresarNotaComponentAdded
        jtIngresarNota.clearSelection();
        jbGuardarNota.setEnabled(true);
        jtIngresarNota.transferFocusDownCycle();
    }//GEN-LAST:event_jtIngresarNotaComponentAdded
  
    public void armaCabeceraTabla (){
        ArrayList<Object> columnas = new ArrayList <Object>();
        columnas.add("Cursada");
        columnas.add("Materia");
        columnas.add("Nota");
        for (Object it:columnas){
            modelo.addColumn(it);
        }
        jtIngresarNota.setModel(modelo);
    }
    
    public void cargaAlumnos(){
        List<Alumno> lista = ad.obtenerAlumnos();
        
        for (Alumno item:lista){
           jcbAlumnos.addItem(item);
        }
    }
    
    public void borraFilasTabla(){
        int a = modelo.getRowCount()-1;
        
        for(int i=a; i>=0;i--){
            modelo.removeRow(i);
        }
    }
    
    public void cargaDatos(){
        borraFilasTabla();
        
        Alumno elegido=(Alumno) jcbAlumnos.getSelectedItem();
        List<Cursada>lista = id.obtenerCursadasXAlumno(elegido.getIdAlumno());
        for (Cursada it:lista){
            modelo.addRow(new Object[]{it.getIdCursada(),it.getMater().getNombre(),it.getNota()});
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbGuardarNota;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JTable jtIngresarNota;
    // End of variables declaration//GEN-END:variables
}
