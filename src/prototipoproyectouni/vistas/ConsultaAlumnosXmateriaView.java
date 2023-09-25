
package prototipoproyectouni.vistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import prototipoproyectouni.AccesoADatos.InscripcionData;
import prototipoproyectouni.AccesoADatos.MateriaData;
import prototipoproyectouni.Entidades.Alumno;
import prototipoproyectouni.Entidades.Materia;


public class ConsultaAlumnosXmateriaView extends javax.swing.JInternalFrame {
private DefaultTableModel modelo =new DefaultTableModel(){

public boolean isCellEditable(int f, int c){

return false;
}

};
   
    public ConsultaAlumnosXmateriaView() {
        initComponents();
        armarCabecera();
        cargarCombo();
     setLocation(150, 0);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMaterias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jButtonSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Consulta de Alumnos por Materia");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("LISTADO DE ALUMNOS POR MATERIA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione una materia :");

        jComboBoxMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMateriasActionPerformed(evt);
            }
        });

        jTableAlumnos.setBackground(new java.awt.Color(204, 204, 255));
        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAlumnos);

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBoxMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMateriasActionPerformed
     borrarFilas();
        Materia materiaSeleccionada =(Materia)jComboBoxMaterias.getSelectedItem();
        InscripcionData ini1=new InscripcionData();
       
       ArrayList<Alumno> alumnosPorMateria= (ArrayList)ini1.obtenerAlumnosPorMateria(materiaSeleccionada.getIdMateria());
        
        for (Iterator<Alumno> iterator = alumnosPorMateria.iterator(); iterator.hasNext();) {
            Alumno next = iterator.next();
            modelo.addRow(new Object[]{next.getIdAlumno(),next.getDni(),next.getApellido(),next.getNombre()});
            
        }
       
       
      
      
        
        
       
    }//GEN-LAST:event_jComboBoxMateriasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Materia> jComboBoxMaterias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    // End of variables declaration//GEN-END:variables


public void armarCabecera(){

modelo.addColumn("ID");
modelo.addColumn("DNI");
modelo.addColumn("Apellido");
modelo.addColumn("Nombre");
jTableAlumnos.setModel(modelo);
}

private void cargarCombo(){

MateriaData md=new MateriaData();
List<Materia> combo=new ArrayList<>();
combo=md.listarMaterias();
    for (Iterator<Materia> iterator = combo.iterator(); iterator.hasNext();) {
        Materia next = iterator.next();
        
        jComboBoxMaterias.addItem(next);
    }

}

private void borrarFilas(){

int filas=jTableAlumnos.getRowCount()-1;
    for (int f = filas; f>=0; f--) {
        modelo.removeRow(f);
    }

}

}
