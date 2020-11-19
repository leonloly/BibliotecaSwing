package view;

import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Autores;
import models.LibroClasificaciones;
import models.LibroTipos;
import models.Libros;
import utils.Validation;

public class JFLibros extends javax.swing.JFrame {

    Libros lib;
    boolean edit = false;
    List<Libros> dataList;
    List<Object[]> autoresList = new ArrayList<>();
    List<Object[]> clasificacionList = new ArrayList<>();
    List<Object[]> tipoList = new ArrayList<>();

    public JFLibros() {
        initComponents();
    }

    void showData() {
        DefaultTableModel model = (DefaultTableModel) jTableLibros.getModel();
        dataList = (new Libros().List());
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        for (Libros s : dataList) {
            Object[] row = {
                s.getCodigo(),
                s.getTitulo(),
                s.getEtiqueta(),
                s.getPublicado(),
                s.getEdicion(),
                s.getIsbn(),
                s.getPrecioRenta(),
                s.getCodigoClasificacion().getNombre(),
                s.getCodigoAutor().getNombre(),
                s.getCodigoTipo().getNombre()
            };
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtTitulo = new javax.swing.JTextField();
        jtEtiqueta = new javax.swing.JTextField();
        jtPublicacion = new javax.swing.JTextField();
        jtPrecioRenta = new javax.swing.JTextField();
        jtEdicion = new javax.swing.JTextField();
        jtIsbn = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLibros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Titulo");

        jLabel2.setText("Etiqueta");

        jLabel3.setText("Fecha de publicacion");

        jLabel4.setText("Edicion");

        jLabel5.setText("ISBN");

        jLabel6.setText("Precio de renta");

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Cerrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jtPublicacion.setText("2020/10/01");
        jtPublicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtPublicacionFocusLost(evt);
            }
        });

        jtEdicion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEdicionKeyTyped(evt);
            }
        });

        jButton3.setText("Clasificacion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Autor");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jButton5.setText("Tipo");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jTableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Titulo", "Etiqueta", "Fecha publicacion", "Edicion", "ISBN", "Precio Renta", "Clasificacion", "Autor", "Tipo"
            }
        ));
        jTableLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLibrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLibros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtTitulo)
                    .addComponent(jtEtiqueta)
                    .addComponent(jtPublicacion, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtEdicion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtPrecioRenta, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtIsbn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33))))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(23, 23, 23)
                                    .addComponent(jtPrecioRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)))
                            .addGap(26, 26, 26)
                            .addComponent(jtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addComponent(jButton3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton4)
                                .addComponent(jButton5)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showData();
    }//GEN-LAST:event_formWindowOpened

    private void jTableLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLibrosMouseClicked
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        lib = dataList.get(jTableLibros.getSelectedRow());
        String fecha = format.format(lib.getPublicado());
        
        jtTitulo.setText(lib.getTitulo());
        jtEtiqueta.setText(lib.getEtiqueta());
        jtPublicacion.setText(fecha);
        jtEdicion.setText(String.valueOf(lib.getEdicion()));
        jtIsbn.setText(lib.getIsbn());
        jtPrecioRenta.setText(String.valueOf(lib.getPrecioRenta()));

        edit = true;
    }//GEN-LAST:event_jTableLibrosMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (jtTitulo.getText().isEmpty()
                || jtEtiqueta.getText().isEmpty()
                || jtPublicacion.getText().isEmpty()
                || jtEdicion.getText().isEmpty()
                || jtIsbn.getText().isEmpty()
                || jtPrecioRenta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No debe dejar campos vacios");
            return;
        }
        if (!edit) {
            lib = new Libros();
        }
//        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//        String fecha = format.format(jtPublicacion);
        
        lib.setTitulo(jtTitulo.getText());
        lib.setEtiqueta(jtEtiqueta.getText());
        lib.setPublicado(new Date(jtPublicacion.getText()));
        lib.setEdicion(Short.parseShort(jtEdicion.toString()));
        lib.setIsbn(jtIsbn.getText());
        lib.setPrecioRenta(new BigDecimal(jtPrecioRenta.getText()));

        if (autoresList.isEmpty() && tipoList.isEmpty() && clasificacionList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccionar un Auto, Tipo y Clasificacion");
        } else {

            Autores au = new Autores();
            LibroTipos lt = new LibroTipos();
            LibroClasificaciones lc = new LibroClasificaciones();

            Object[] rowAut = autoresList.get(0);
            Object[] rowTip = tipoList.get(0);
            Object[] rowCla = clasificacionList.get(0);

            au.setCodigo(Integer.parseInt(rowAut[0].toString()));
            lib.setCodigoAutor(au);

            lt.setCodigo(Integer.parseInt(rowTip[0].toString()));
            lib.setCodigoTipo(lt);

            lc.setCodigo(Integer.parseInt(rowCla[0].toString()));
            lib.setCodigoClasificacion(lc);

            if (lib.save()) {
                JOptionPane.showMessageDialog(this, (edit ? "Editado" : "Creado") + " correctamente");
                jtTitulo.setText("");
                jtEtiqueta.setText("");
                jtPublicacion.setText("");
                jtEdicion.setText("");
                jtIsbn.setText("");
                jtPrecioRenta.setText("");

                edit = false;
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar Autores, Tipo y Clasificacion");
                return;
            }
            showData();
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        JFSearch js = new JFSearch("select * from libro_clasificaciones", null, JFSearch.SINGLE);
        js.setVisible(true);
        js.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
                clasificacionList = JFSearch.selected;
            }
        });
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       JFSearch js = new JFSearch("select * from autores", null, JFSearch.SINGLE);
        js.setVisible(true);
        js.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
                autoresList = JFSearch.selected;
            }
        });
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
         JFSearch js = new JFSearch("select * from libro_tipos", null, JFSearch.SINGLE);
        js.setVisible(true);
        js.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowDeactivated(WindowEvent e) {
                super.windowDeactivated(e);
                tipoList = JFSearch.selected;
            }
        });
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jtPublicacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtPublicacionFocusLost
        if (!Validation.validDate(jtEdicion.getText())) {
            JOptionPane.showMessageDialog(this, "Formato de fecha no correcta");
            jtEdicion.setText("");
        }
    }//GEN-LAST:event_jtPublicacionFocusLost

    private void jtEdicionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEdicionKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || c == evt.VK_BACK_SPACE || c == evt.VK_DELETE)) {
            evt.consume();
            return;
        }
    }//GEN-LAST:event_jtEdicionKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLibros;
    private javax.swing.JTextField jtEdicion;
    private javax.swing.JTextField jtEtiqueta;
    private javax.swing.JTextField jtIsbn;
    private javax.swing.JTextField jtPrecioRenta;
    private javax.swing.JTextField jtPublicacion;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
}
