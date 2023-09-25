
package prototipoproyectouni.vistas;


import javax.swing.JOptionPane;


public class menu extends javax.swing.JFrame {

  
    public menu() {
        initComponents();
        
       this.setLocationRelativeTo(this);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumno = new javax.swing.JMenu();
        jMenuItemAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuItemMateria = new javax.swing.JMenuItem();
        jMenuAdministracion = new javax.swing.JMenu();
        jMenuItemInscripciones = new javax.swing.JMenuItem();
        jMenuItemNotas = new javax.swing.JMenuItem();
        jMenuConsultas = new javax.swing.JMenu();
        jMenuItemAlumnosporMateria = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Gestion de la Universidad de La Punta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(600, 600));

        Escritorio.setBackground(new java.awt.Color(51, 102, 255));
        Escritorio.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, Short.MAX_VALUE, Short.MAX_VALUE)
        );

        jMAlumno.setText("Alumno");

        jMenuItemAlumno.setText("Formulario de Alumno");
        jMenuItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlumnoActionPerformed(evt);
            }
        });
        jMAlumno.add(jMenuItemAlumno);

        jMenuBar1.add(jMAlumno);

        jMenuMateria.setText("Materia");

        jMenuItemMateria.setText("Formulario de Materia");
        jMenuItemMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuItemMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuAdministracion.setText("Administracion");

        jMenuItemInscripciones.setText("Manejo de inscripciones");
        jMenuItemInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInscripcionesActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jMenuItemInscripciones);

        jMenuItemNotas.setText("Manipulacion de notas");
        jMenuItemNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNotasActionPerformed(evt);
            }
        });
        jMenuAdministracion.add(jMenuItemNotas);

        jMenuBar1.add(jMenuAdministracion);

        jMenuConsultas.setText("Consultas");
        jMenuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultasActionPerformed(evt);
            }
        });

        jMenuItemAlumnosporMateria.setText("Alumnos por materia");
        jMenuItemAlumnosporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAlumnosporMateriaActionPerformed(evt);
            }
        });
        jMenuConsultas.add(jMenuItemAlumnosporMateria);

        jMenuBar1.add(jMenuConsultas);

        jMenuSalir.setText("Salir");
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlumnoActionPerformed
    Escritorio.removeAll();
    Escritorio.repaint();
    GestionAlumnoView gav= new GestionAlumnoView();
    gav.setVisible(true);
    Escritorio.add(gav);
    Escritorio.moveToFront(gav);
    
    
    
    }//GEN-LAST:event_jMenuItemAlumnoActionPerformed

    private void jMenuItemInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInscripcionesActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioInscripcionesView fiv= new FormularioInscripcionesView();
        fiv.setVisible(true);
        Escritorio.add(fiv);
        Escritorio.moveToFront(fiv);
        
        
    }//GEN-LAST:event_jMenuItemInscripcionesActionPerformed

    private void jMenuItemNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNotasActionPerformed
      Escritorio.removeAll();
      Escritorio.repaint();
      ManejoNotasView mnv=new ManejoNotasView();
      mnv.setVisible(true);
      Escritorio.add(mnv);
      Escritorio.moveToFront(mnv);
    }//GEN-LAST:event_jMenuItemNotasActionPerformed

    private void jMenuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultasActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        ConsultaAlumnosXmateriaView capm= new ConsultaAlumnosXmateriaView();
        capm.setVisible(true);
        Escritorio.add(capm);
        Escritorio.moveToFront(capm);
        
        
        
        
        
    }//GEN-LAST:event_jMenuConsultasActionPerformed

    private void jMenuItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMateriaActionPerformed
         Escritorio.removeAll();
    Escritorio.repaint();
    GestionMateriasView gm= new GestionMateriasView();
    gm.setVisible(true);
    Escritorio.add(gm);
    Escritorio.moveToFront(gm);
    }//GEN-LAST:event_jMenuItemMateriaActionPerformed

    private void jMenuItemAlumnosporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAlumnosporMateriaActionPerformed
       Escritorio.removeAll();
        Escritorio.repaint();
        ConsultaAlumnosXmateriaView appom= new ConsultaAlumnosXmateriaView();
        appom.setVisible(true);
        Escritorio.add(appom);
        Escritorio.moveToFront(appom); 
    }//GEN-LAST:event_jMenuItemAlumnosporMateriaActionPerformed

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
     
        if(JOptionPane.showConfirmDialog(null,"Desea salir del sistema?","Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0)
        {
        
         System.exit(0);
        }
        
     
    }//GEN-LAST:event_jMenuSalirMouseClicked

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu winMenu = new menu();
                //winMenu.setExtendedState(JFrame.MAXIMIZED_BOTH);
                winMenu.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMAlumno;
    private javax.swing.JMenu jMenuAdministracion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuConsultas;
    private javax.swing.JMenuItem jMenuItemAlumno;
    private javax.swing.JMenuItem jMenuItemAlumnosporMateria;
    private javax.swing.JMenuItem jMenuItemInscripciones;
    private javax.swing.JMenuItem jMenuItemMateria;
    private javax.swing.JMenuItem jMenuItemNotas;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}
