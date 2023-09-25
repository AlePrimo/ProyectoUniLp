package prototipoproyectouni.vistas;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import prototipoproyectouni.AccesoADatos.AlumnoData;
import prototipoproyectouni.AccesoADatos.InscripcionData;
import prototipoproyectouni.Entidades.Alumno;
import prototipoproyectouni.Entidades.Inscripcion;

public class ManejoNotasView extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {

        public boolean isCellEditable(int f, int c) {
            return c == 2;
        }
    };

    private ArrayList<Inscripcion> mates = new ArrayList<>();
    private InscripcionData inn = new InscripcionData();

    public ManejoNotasView() {
        initComponents();
        setLocation(100, 0);
        cargarCombo();
        armarCabecera();
        cargarTabla();
        jButtonGuardar.setEnabled(false);
        estadoBotonGuardar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablemateria = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setClosable(true);
        setTitle("Carga de notas");
        setNormalBounds(new java.awt.Rectangle(500, 500, 84, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CARGA DE NOTAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccione un alumno :");

        jComboBoxAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAlumnosActionPerformed(evt);
            }
        });

        jTablemateria.setBackground(new java.awt.Color(204, 204, 255));
        jTablemateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTablemateria);

        jButtonGuardar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jButtonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalir)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jComboBoxAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAlumnosActionPerformed

        Alumno alumnoSeleccionado = (Alumno) jComboBoxAlumnos.getSelectedItem();
        InscripcionData ini = new InscripcionData();
        mates = (ArrayList) ini.obtenerInscripcionesporAlumno(alumnoSeleccionado.getIdAlumno());
        modelo.setRowCount(0);
        for (Iterator<Inscripcion> ins = mates.iterator(); ins.hasNext();) {
            Inscripcion next = ins.next();
            modelo.addRow(new Object[]{next.getMateria().getIdMateria(), next.getMateria().getNombre(), next.getNota()});

        }


    }//GEN-LAST:event_jComboBoxAlumnosActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String nota;
        int idmat = 0;
        double nota1 = 0;

        Alumno uno = (Alumno) jComboBoxAlumnos.getSelectedItem();
        int idalu = uno.getIdAlumno();
        for (int f = 0; f < jTablemateria.getRowCount(); f++) {
            idmat = (int) jTablemateria.getValueAt(f, 0);
            nota = "" + jTablemateria.getValueAt(f, 2);
            nota1 = Double.parseDouble(nota);
            if (nota1 >= 0 && nota1 <= 10) {
                if (inn.actualizarNota(idalu, idmat, nota1)) {
                    JOptionPane.showMessageDialog(null, "Carga de Materia Exitosa\nEn Materia: " + jTablemateria.getValueAt(f, 1));
                }
            }
        }
        cargarTabla();
        jButtonGuardar.setEnabled(false);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void estadoBotonGuardar() {
        modelo.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tme) {
                System.out.println(tme.getType());
                if (tme.getType() == TableModelEvent.UPDATE) {
                    int fila = tme.getFirstRow();
                    int columna = tme.getColumn();
                    String sValor = "" + jTablemateria.getValueAt(fila, columna);
                    try {
                        double nota = Double.parseDouble(sValor);
                        if (!(nota >= 0 && nota <= 10)) {
                            JOptionPane.showMessageDialog(null, "QQQQQIngrese una nota válida (0-10)\nEn Materia: " + jTablemateria.getValueAt(fila, columna));
                            jButtonGuardar.setEnabled(false);
                        } else {
                            jButtonGuardar.setEnabled(true);
                            JOptionPane.showMessageDialog(null, "valor de Materia : " + jTablemateria.getValueAt(fila, columna) + "\nNO OLVIDE GUARDAR LAS MODIFICACIONES");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "QQQQQQIngrese una nota válida (0-10)\nEn Materia: " + jTablemateria.getValueAt(fila, columna));
                        jButtonGuardar.setEnabled(false);
                        return;
                    }
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Alumno> jComboBoxAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablemateria;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {

        AlumnoData ad = new AlumnoData();
        List<Alumno> combo = new ArrayList<>();

        combo = ad.listarAlumnos();

        for (Alumno next : combo) {
            jComboBoxAlumnos.addItem(next);
        }

    }

    public void armarCabecera() {

        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE MATERIA");
        modelo.addColumn("NOTA");

        jTablemateria.setModel(modelo);
    }

    public void cargarTabla() {
        Alumno alumnoSeleccionado = (Alumno) jComboBoxAlumnos.getSelectedItem();
        InscripcionData ini = new InscripcionData();
        mates = (ArrayList) ini.obtenerInscripcionesporAlumno(alumnoSeleccionado.getIdAlumno());
        modelo.setRowCount(0);
        for (Iterator<Inscripcion> ins = mates.iterator(); ins.hasNext();) {
            Inscripcion next = ins.next();
            modelo.addRow(new Object[]{next.getMateria().getIdMateria(), next.getMateria().getNombre(), next.getNota()});

        }

    }

}
