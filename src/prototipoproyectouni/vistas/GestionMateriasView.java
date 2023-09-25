package prototipoproyectouni.vistas;

import javax.swing.JOptionPane;
import prototipoproyectouni.AccesoADatos.MateriaData;
import prototipoproyectouni.Entidades.Materia;

public class GestionMateriasView extends javax.swing.JInternalFrame {

    private Materia mat = new Materia();
    private MateriaData mataData = new MateriaData();

    public GestionMateriasView() {
        initComponents();
        jButtonEliminar.setEnabled(false);
        jButtonGuardar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldaño = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        setClosable(true);
        setTitle("Gestion de Materias");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MATERIA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nombre :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Año :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estado :");

        jButtonBuscar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonNuevo.setBackground(new java.awt.Color(204, 204, 255));
        jButtonNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonNuevo.setText("Nuevo");
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(204, 204, 255));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldaño, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButtonEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonNuevo)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonEliminar)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButtonEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevo)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed

        String year = "";
        String name = "";
        boolean booleNombre = false;
        int anioMat = 0;
        if (jTextFieldNombre.getText().isEmpty()) {
            name = "-Nombre";
        }
        if (jTextFieldaño.getText().isEmpty()) {
            year = "-Año";

        }
        if ((!year.isEmpty() || !name.isEmpty())) {
            String msg = "Error falta ingresar :\n" + ((!year.isEmpty()) ? year + "\n" : "") + ((!name.isEmpty()) ? name + "\n" : "");

            JOptionPane.showMessageDialog(null, msg);

        } else {

            String sNombre = jTextFieldNombre.getText();
            for (int i = 0; i < sNombre.length(); i++) {
                if (sNombre.charAt(i) >= 48 && sNombre.charAt(i) <= 57) {
                    JOptionPane.showMessageDialog(null, "Ingreso de caracteres invalidos en el campo Nombre");
                    jTextFieldNombre.setText("");
                    booleNombre = false;
                    return;
                } else {
                    booleNombre = true;
                }
            }
            if (booleNombre) {
                mat.setNombre(jTextFieldNombre.getText());
            }

            try {
                anioMat = Integer.parseInt(jTextFieldaño.getText());
                mat.setAnioMateria(anioMat);
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese numeros "
                        + "enteros para el año que se cursa la materia");
                jTextFieldaño.setText("");
                return;
            }

            mat.setActivo(jRadioButtonEstado.isSelected());
            mataData.guardarMateria(mat);
            limpiar();

        }


    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        int codigo = 0;

        try {
            codigo = Integer.parseInt(jTextFieldCodigo.getText());
            if (codigo != 0) {
                mat = mataData.buscarMateria(codigo);
                if (mat != null) {
                    jTextFieldNombre.setText(mat.getNombre());
                    jTextFieldaño.setText("" + mat.getAnioMateria());
                    jRadioButtonEstado.setSelected(mat.isActivo());
                } else {

                    jTextFieldCodigo.setText("");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar un valor de codigo para la busqueda");
                jTextFieldCodigo.setText("");
                return;
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese numeros enteros para el codigo");
            jTextFieldCodigo.setText("");
            return;
        }
jButtonEliminar.setEnabled(true);
        jButtonGuardar.setEnabled(true);
        jButtonNuevo.setEnabled(false);

    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        mataData.eliminarMateria(Integer.parseInt(jTextFieldCodigo.getText()));
        limpiar();

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        String year = "";
        String name = "";
        boolean booleNombre = false;
        int anioMat = 0;
        if (jTextFieldNombre.getText().isEmpty()) {
            name = "-Nombre";
        }
        if (jTextFieldaño.getText().isEmpty()) {
            year = "-Año";

        }
        if ((!year.isEmpty() || !name.isEmpty())) {
            String msg = "Error falta ingresar :\n" + ((!year.isEmpty()) ? year + "\n" : "") + ((!name.isEmpty()) ? name + "\n" : "");

            JOptionPane.showMessageDialog(null, msg);

        } else {

            String sNombre = jTextFieldNombre.getText();
            for (int i = 0; i < sNombre.length(); i++) {
                if (sNombre.charAt(i) >= 48 && sNombre.charAt(i) <= 57) {
                    JOptionPane.showMessageDialog(null, "Ingreso de caracteres invalidos en el campo Nombre");
                    jTextFieldNombre.setText("");
                    booleNombre = false;
                    return;
                } else {
                    booleNombre = true;
                }
            }
            if (booleNombre) {
                mat.setNombre(jTextFieldNombre.getText());
            }

            try {
                anioMat = Integer.parseInt(jTextFieldaño.getText());
                mat.setAnioMateria(anioMat);
            } catch (java.lang.NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese numeros "
                        + "enteros para el año que se cursa la materia");
                jTextFieldaño.setText("");
                return;
            }

            mat.setActivo(jRadioButtonEstado.isSelected());

            mataData.ModificarMateria(mat);
            limpiar();


    }//GEN-LAST:event_jButtonGuardarActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldaño;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {

        jTextFieldNombre.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldaño.setText("");
        jRadioButtonEstado.setSelected(false);

    }
}
