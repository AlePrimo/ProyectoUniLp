package prototipoproyectouni.vistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import prototipoproyectouni.AccesoADatos.AlumnoData;
import prototipoproyectouni.AccesoADatos.InscripcionData;
import prototipoproyectouni.AccesoADatos.MateriaData;
import prototipoproyectouni.Entidades.Alumno;
import prototipoproyectouni.Entidades.Inscripcion;
import prototipoproyectouni.Entidades.Materia;

public class FormularioInscripcionesView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {

            return false;
        }
    };
    private InscripcionData ini = new InscripcionData();
    private Materia mat = new Materia();
    private MateriaData mataData = new MateriaData();
    private Alumno alu = new Alumno();
    private List<Materia> materias = new ArrayList<>();
    private AlumnoData ad = new AlumnoData();

    public FormularioInscripcionesView() {
        initComponents();
        armarCabecera();
        jRadioButtonMateriasInscriptas.setSelected(true);
        cargarCombo();
        cargarTabla();
        jButtonInscribir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonMateriasInscriptas = new javax.swing.JRadioButton();
        jRadioButtonMateriasNOinscriptas = new javax.swing.JRadioButton();
        jButtonInscribir = new javax.swing.JButton();
        jButtonAnular = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Inscripciones");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno :");

        jComboBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Listado de Materias ");

        jRadioButtonMateriasInscriptas.setText("Materias Inscriptas");
        jRadioButtonMateriasInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMateriasInscriptasActionPerformed(evt);
            }
        });

        jRadioButtonMateriasNOinscriptas.setText("Materias NO inscriptas");
        jRadioButtonMateriasNOinscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMateriasNOinscriptasActionPerformed(evt);
            }
        });

        jButtonInscribir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonInscribir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonInscribir.setText("Inscribir");
        jButtonInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInscribirActionPerformed(evt);
            }
        });

        jButtonAnular.setBackground(new java.awt.Color(204, 204, 255));
        jButtonAnular.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAnular.setText("Anular Inscripcion");
        jButtonAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(204, 204, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButtonInscribir)
                                .addGap(88, 88, 88)
                                .addComponent(jButtonAnular)
                                .addGap(132, 132, 132)
                                .addComponent(jButtonSalir)))
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jRadioButtonMateriasInscriptas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButtonMateriasNOinscriptas)
                        .addGap(105, 105, 105))))
            .addGroup(layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonMateriasInscriptas)
                    .addComponent(jRadioButtonMateriasNOinscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInscribir)
                    .addComponent(jButtonAnular)
                    .addComponent(jButtonSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jRadioButtonMateriasInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMateriasInscriptasActionPerformed
        jRadioButtonMateriasNOinscriptas.setSelected(false);

        cargarTabla();
jButtonInscribir.setEnabled(false);
jButtonAnular.setEnabled(true);

    }//GEN-LAST:event_jRadioButtonMateriasInscriptasActionPerformed

    private void jRadioButtonMateriasNOinscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMateriasNOinscriptasActionPerformed
        jRadioButtonMateriasInscriptas.setSelected(false);

        cargarTabla();
jButtonInscribir.setEnabled(true);
jButtonAnular.setEnabled(false);

    }//GEN-LAST:event_jRadioButtonMateriasNOinscriptasActionPerformed

    private void jComboBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnoActionPerformed
        modelo.setRowCount(0);

        cargarTabla();
    }//GEN-LAST:event_jComboBoxAlumnoActionPerformed

    private void jButtonInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInscribirActionPerformed
//       alu=(Alumno)jComboBoxAlumno.getSelectedItem();
//      
//         int idmat = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
//          mat=mataData.buscarMateria(idmat);
//         Inscripcion insc=new Inscripcion(alu, mat,0);
//        
//       ini.guardarInscripcion(insc);
        materiasSeleccionadas(true);
       
       
    }//GEN-LAST:event_jButtonInscribirActionPerformed

    private void jButtonAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularActionPerformed
//       alu=(Alumno)jComboBoxAlumno.getSelectedItem();
//      
//         int idmat = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
//          mat=mataData.buscarMateria(idmat);
//    
//      ini.borrarInscripcionAlumno(alu.getIdAlumno(),mat.getIdMateria());

  materiasSeleccionadas(false);



    }//GEN-LAST:event_jButtonAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnular;
    private javax.swing.JButton jButtonInscribir;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButtonMateriasInscriptas;
    private javax.swing.JRadioButton jRadioButtonMateriasNOinscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {

        modelo.addColumn("ID");

        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jTable1.setModel(modelo);
    }

    private void cargarCombo() {

        List<Alumno> combo = new ArrayList<>();
        combo = ad.listarAlumnos();
        for (Iterator<Alumno> iterator = combo.iterator(); iterator.hasNext();) {
            Alumno next = iterator.next();

            jComboBoxAlumno.addItem(next);
        }

    }

    public void cargarTabla() {

        alu = (Alumno) jComboBoxAlumno.getSelectedItem();

        if (jRadioButtonMateriasInscriptas.isSelected()) {
            materias = (ini.obtenerMateriasCursadas(alu.getIdAlumno()));
        } else {
            materias = (ini.obtenerMateriasNoCursadas(alu.getIdAlumno()));
        }
        modelo.setRowCount(0);
        for (Materia materiaTabla : materias) {

            modelo.addRow(new Object[]{materiaTabla.getIdMateria(), materiaTabla.getNombre(), materiaTabla.getAnioMateria()});

        }
    }


private void materiasSeleccionadas(boolean isInscribir){
        int idAlumno = alu.getIdAlumno();
        for(int fElegida:jTable1.getSelectedRows()){
            int idM = (int) jTable1.getValueAt(fElegida, 0);
            mat = mataData.buscarMateria((int) jTable1.getValueAt(fElegida, 0));
            if(isInscribir) ini.guardarInscripcion(new Inscripcion(alu, mat,0));
            else ini.borrarInscripcionAlumno(idAlumno, idM);
        }
        cargarTabla();
    }







}
