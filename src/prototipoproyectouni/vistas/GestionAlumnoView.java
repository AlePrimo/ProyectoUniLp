package prototipoproyectouni.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import prototipoproyectouni.AccesoADatos.AlumnoData;
import prototipoproyectouni.Entidades.Alumno;

public class GestionAlumnoView extends javax.swing.JInternalFrame {

    private Alumno alum = new Alumno();
    private AlumnoData ad = new AlumnoData();
    private int dni = 0;

    public GestionAlumnoView() {
        initComponents();
        jButtonEliminar.setEnabled(false);
        jButtonGuardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        JbuttonBuscar = new javax.swing.JButton();
        jTextFielddocumento = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jCheckBoxEstado = new javax.swing.JCheckBox();
        jDateChooserFechaNacimento = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setTitle("Gestion de Alumnos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ALUMNO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Documento :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Apellido :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Nombre :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estado :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento :");

        jButtonNuevo.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonGuardar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        JbuttonBuscar.setBackground(new java.awt.Color(204, 204, 255));
        JbuttonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JbuttonBuscar.setText("Buscar");
        JbuttonBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JbuttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbuttonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar)
                        .addGap(38, 38, 38)
                        .addComponent(jButtonGuardar)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFielddocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBoxEstado))
                        .addGap(72, 72, 72)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir)
                    .addComponent(JbuttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(26, 26, 26)
                        .addComponent(jDateChooserFechaNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JbuttonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFielddocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCheckBoxEstado))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooserFechaNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void JbuttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbuttonBuscarActionPerformed

        try {
            dni = Integer.parseInt(jTextFielddocumento.getText());

        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese numeros del 0 al 9 para el DNI");
        }
        if (dni != 0) {
            alum = ad.buscarAlumnoPorDni(dni);
            if (alum != null) {
                jTextFieldNombre.setText(alum.getNombre());
                jTextFieldApellido.setText(alum.getApellido());

                jCheckBoxEstado.setSelected(alum.isActivo());
                jDateChooserFechaNacimento.setDate(Date.valueOf(alum.getFechaNac()));
                jButtonEliminar.setEnabled(true);
        jButtonGuardar.setEnabled(true);
        jButtonNuevo.setEnabled(false);
                
                
            } else {

                jTextFielddocumento.setText("");
                return;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un valor de dni para la busqueda");
            jTextFielddocumento.setText("");
            
        }
       

    }//GEN-LAST:event_JbuttonBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        alum = ad.buscarAlumnoPorDni(Integer.parseInt(jTextFielddocumento.getText()));
        ad.eliminarAlumno(alum.getIdAlumno());
        limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed

        String Sdni = "";
        String ape = "";
        String name = "";
        int doc;
        if (jTextFielddocumento.getText().isEmpty()) {
            Sdni = "-Documento";
        }
        if (jTextFieldApellido.getText().isEmpty()) {
            ape = "-Apellido";
        }
        if (jTextFieldNombre.getText().isEmpty()) {
            name = "-Nombre";

        }

        if ((!Sdni.isEmpty() || !ape.isEmpty() || !name.isEmpty())) {
            String msg = "Error falta ingresar :\n" + ((!Sdni.isEmpty()) ? Sdni + "\n" : "") + ((!ape.isEmpty()) ? ape + "\n" : "") + ((!name.isEmpty()) ? name + "\n" : "");

            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                doc = Integer.parseInt(jTextFielddocumento.getText());
                alum.setDni(doc);
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese numeros "
                        + "enteros para el DNI");
                jTextFielddocumento.setText("");
                return;
            }
            boolean booleA = false;

            String sApellido = jTextFieldApellido.getText();
            for (int i = 0; i < sApellido.length(); i++) {
                if (sApellido.charAt(i) >= 48 && sApellido.charAt(i) <= 57) {
                    JOptionPane.showMessageDialog(null, "Ingreso de caracteres invalidos en el campo Apellido");
                    jTextFieldApellido.setText("");
                    booleA = false;
                    return;
                } else {
                    booleA = true;
                }
            }

            if (booleA) {
                alum.setApellido(jTextFieldApellido.getText());
            }
            boolean booleN = false;
            String sNombre = jTextFieldNombre.getText();
            for (int i = 0; i < sNombre.length(); i++) {
                if (sNombre.charAt(i) >= 48 && sNombre.charAt(i) <= 57) {
                    JOptionPane.showMessageDialog(null, "Ingreso de caracteres invalidos en el campo Nombre");
                    jTextFieldNombre.setText("");
                    booleN = false;
                    return;
                } else {
                    booleN = true;
                }
            }
            if (booleN) {
                alum.setNombre(jTextFieldNombre.getText());
            }

            alum.setActivo(jCheckBoxEstado.isSelected());
            java.util.Date date = jDateChooserFechaNacimento.getDate();
            LocalDate local = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            alum.setFechaNac(local);
            ad.guardarAlumno(alum);
            limpiar();

        }


    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        String dni = "";
        String ape = "";
        String name = "";
        int doc;
        if (jTextFielddocumento.getText().isEmpty()) {
            dni = "-Documento";

        }
        if (jTextFieldApellido.getText().isEmpty()) {
            ape = "-Apellido";
        }
        if (jTextFieldNombre.getText().isEmpty()) {
            name = "-Nombre";
        }

        if ((!dni.isEmpty() || !ape.isEmpty() || !name.isEmpty())) {
            String msg = "Error falta ingresar :\n" + ((!dni.isEmpty()) ? dni + "\n" : "")
                    + ((!ape.isEmpty()) ? ape + "\n" : "") + ((!name.isEmpty()) ? name + "\n" : "");

            JOptionPane.showMessageDialog(null, msg);
        } else {
            try {
                doc = Integer.parseInt(jTextFielddocumento.getText());
                alum.setDni(doc);
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese numeros "
                        + "enteros para el DNI");
                jTextFielddocumento.setText("");
                return;
            }
            boolean booleA = false;

            String sApellido = jTextFieldApellido.getText();
            for (int i = 0; i < sApellido.length(); i++) {
                if (sApellido.charAt(i) >= 48 && sApellido.charAt(i) <= 57) {
                    JOptionPane.showMessageDialog(null, "Ingreso de caracteres invalidos en el campo Apellido");
                    jTextFieldApellido.setText("");
                    booleA = false;
                    return;
                } else {
                    booleA = true;
                }
            }

            if (booleA) {
                alum.setApellido(jTextFieldApellido.getText());
            }
            boolean booleN = false;
            String sNombre = jTextFieldNombre.getText();
            for (int i = 0; i < sNombre.length(); i++) {
                if (sNombre.charAt(i) >= 48 && sNombre.charAt(i) <= 57) {
                    JOptionPane.showMessageDialog(null, "Ingreso de caracteres invalidos en el campo Nombre");
                    jTextFieldNombre.setText("");
                    booleN = false;
                    return;
                } else {
                    booleN = true;
                }
            }
            if (booleN) {
                alum.setNombre(jTextFieldNombre.getText());
            }

            alum.setActivo(jCheckBoxEstado.isSelected());
            java.util.Date date = jDateChooserFechaNacimento.getDate();
            LocalDate local = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            alum.setFechaNac(local);
            ad.modificarAlumno(alum);
            limpiar();


    }//GEN-LAST:event_jButtonGuardarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbuttonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxEstado;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFielddocumento;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {

        jTextFielddocumento.setText("");
        jTextFieldApellido.setText("");
        jTextFieldNombre.setText("");
        jCheckBoxEstado.setSelected(false);

    }

}
