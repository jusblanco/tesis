/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package igu;

import static igu.principal.a;

public class panel6 extends javax.swing.JPanel {

    public panel6() {
        initComponents();
        String j = "Weymouth";
        panel_setVisible();
        panel_imagenResul.setVisible(false);
        btn_GenerarPDF.setEnabled(false);
        btn_Guardar.setEnabled(false);
        lb_SugEc.setText(j);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel_tramo = new javax.swing.JPanel();
        panel_EcTub = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbx_Ec = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_Calcular = new javax.swing.JButton();
        btn_Borrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_SugEc1 = new javax.swing.JLabel();
        lb_SugEc = new javax.swing.JLabel();
        panel_Resul = new javax.swing.JPanel();
        btn_GenerarPDF = new javax.swing.JButton();
        panel_imagenResul = new javax.swing.JPanel();
        btn_Guardar = new javax.swing.JButton();
        panel_paralelo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_serie = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        panel_caudal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(251, 253, 253));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(800, 320));

        jDesktopPane1.setBackground(new java.awt.Color(251, 253, 253));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(800, 320));

        panel_tramo.setBackground(new java.awt.Color(251, 253, 253));
        panel_tramo.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_tramo.setPreferredSize(new java.awt.Dimension(800, 320));

        panel_EcTub.setBackground(new java.awt.Color(251, 253, 253));
        panel_EcTub.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elección de Ecuación", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 2, 18))); // NOI18N
        panel_EcTub.setAlignmentX(0.0F);
        panel_EcTub.setMinimumSize(new java.awt.Dimension(350, 270));
        panel_EcTub.setPreferredSize(new java.awt.Dimension(400, 320));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Eliga la Ecuación a utilizar:");

        cbx_Ec.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_Ec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Ecuación", "Pole", "Weymouth" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Ecuación:");

        btn_Calcular.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_Calcular.setText("CALCULAR");
        btn_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CalcularActionPerformed(evt);
            }
        });

        btn_Borrar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_Borrar.setText("Borrar");
        btn_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BorrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        lb_SugEc1.setFont(new java.awt.Font("Berlin Sans FB", 2, 14)); // NOI18N
        lb_SugEc1.setForeground(new java.awt.Color(0, 153, 255));
        lb_SugEc1.setText("Ecuación Sugerida:");

        lb_SugEc.setFont(new java.awt.Font("Berlin Sans FB", 2, 18)); // NOI18N
        lb_SugEc.setForeground(new java.awt.Color(0, 153, 255));
        lb_SugEc.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_SugEc1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lb_SugEc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lb_SugEc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_SugEc)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_EcTubLayout = new javax.swing.GroupLayout(panel_EcTub);
        panel_EcTub.setLayout(panel_EcTubLayout);
        panel_EcTubLayout.setHorizontalGroup(
            panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EcTubLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EcTubLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel_EcTubLayout.createSequentialGroup()
                        .addGroup(panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_Ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panel_EcTubLayout.setVerticalGroup(
            panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EcTubLayout.createSequentialGroup()
                .addGroup(panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_EcTubLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_Ec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(panel_EcTubLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(panel_EcTubLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_EcTubLayout.createSequentialGroup()
                        .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_Resul.setBackground(new java.awt.Color(251, 253, 253));
        panel_Resul.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultados", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Berlin Sans FB", 2, 18))); // NOI18N
        panel_Resul.setPreferredSize(new java.awt.Dimension(400, 320));

        btn_GenerarPDF.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_GenerarPDF.setText("Generar PDF");

        panel_imagenResul.setBackground(new java.awt.Color(255, 255, 255));
        panel_imagenResul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel_imagenResulLayout = new javax.swing.GroupLayout(panel_imagenResul);
        panel_imagenResul.setLayout(panel_imagenResulLayout);
        panel_imagenResulLayout.setHorizontalGroup(
            panel_imagenResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 227, Short.MAX_VALUE)
        );
        panel_imagenResulLayout.setVerticalGroup(
            panel_imagenResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_Guardar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_Guardar.setText("Guardar resultado");

        javax.swing.GroupLayout panel_ResulLayout = new javax.swing.GroupLayout(panel_Resul);
        panel_Resul.setLayout(panel_ResulLayout);
        panel_ResulLayout.setHorizontalGroup(
            panel_ResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ResulLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_GenerarPDF)
                    .addComponent(btn_Guardar))
                .addGap(9, 9, 9)
                .addComponent(panel_imagenResul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_ResulLayout.setVerticalGroup(
            panel_ResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ResulLayout.createSequentialGroup()
                .addGroup(panel_ResulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ResulLayout.createSequentialGroup()
                        .addContainerGap(146, Short.MAX_VALUE)
                        .addComponent(btn_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_GenerarPDF))
                    .addComponent(panel_imagenResul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout panel_tramoLayout = new javax.swing.GroupLayout(panel_tramo);
        panel_tramo.setLayout(panel_tramoLayout);
        panel_tramoLayout.setHorizontalGroup(
            panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tramoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel_EcTub, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel_tramoLayout.setVerticalGroup(
            panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tramoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_Resul, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_EcTub, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        panel_paralelo.setBackground(new java.awt.Color(251, 253, 253));
        panel_paralelo.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_paralelo.setPreferredSize(new java.awt.Dimension(800, 320));

        jLabel4.setText("panel6 paralelo");

        javax.swing.GroupLayout panel_paraleloLayout = new javax.swing.GroupLayout(panel_paralelo);
        panel_paralelo.setLayout(panel_paraleloLayout);
        panel_paraleloLayout.setHorizontalGroup(
            panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paraleloLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel4)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        panel_paraleloLayout.setVerticalGroup(
            panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paraleloLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        panel_serie.setBackground(new java.awt.Color(251, 253, 253));
        panel_serie.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_serie.setPreferredSize(new java.awt.Dimension(800, 320));

        jLabel5.setText("panel6 serie");

        javax.swing.GroupLayout panel_serieLayout = new javax.swing.GroupLayout(panel_serie);
        panel_serie.setLayout(panel_serieLayout);
        panel_serieLayout.setHorizontalGroup(
            panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serieLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel5)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        panel_serieLayout.setVerticalGroup(
            panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serieLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel5)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        panel_caudal.setBackground(new java.awt.Color(251, 253, 253));
        panel_caudal.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_caudal.setPreferredSize(new java.awt.Dimension(800, 320));

        jLabel6.setText("panel6 caudal");

        javax.swing.GroupLayout panel_caudalLayout = new javax.swing.GroupLayout(panel_caudal);
        panel_caudal.setLayout(panel_caudalLayout);
        panel_caudalLayout.setHorizontalGroup(
            panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caudalLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel6)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        panel_caudalLayout.setVerticalGroup(
            panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caudalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(panel_tramo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panel_paralelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panel_serie, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(panel_caudal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_tramo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_paralelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_caudal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_tramo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_paralelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel_caudal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CalcularActionPerformed
        /*muestra el panel de resultados, deshabilita el combobox de las 
        ecuaciones y habilita los botones guardar y generarPDF
        */
        panel_imagenResul.setVisible(true);
        cbx_Ec.setEnabled(false);
        btn_GenerarPDF.setEnabled(true);
        btn_Guardar.setEnabled(true);
        
        
    }//GEN-LAST:event_btn_CalcularActionPerformed

    private void btn_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BorrarActionPerformed
        /*oculta el panel resultados, deshabilita el boton guardar, reinicia
        el combobox pero mantiene habilitado el boton GenerarPDF        
        */
        panel_imagenResul.setVisible(false);
        btn_Guardar.setEnabled(false);
        cbx_Ec.setEnabled(true);
        cbx_Ec.setSelectedIndex(0);
    }//GEN-LAST:event_btn_BorrarActionPerformed
    /**
     * Metodo para hacer no visible todos los paneles extra. (probablemente
     * lo elimine al optimizar el codigo)
     */
    private void panel_setVisible (){
    switch (a) {
            case 1:
                panel_caudal.setVisible(false);
                panel_serie.setVisible(false);
                panel_paralelo.setVisible(false);
                break;
            case 2:
                panel_tramo.setVisible(false);
                panel_caudal.setVisible(false);
                panel_serie.setVisible(false);
                break;
            case 3:
                panel_tramo.setVisible(false);
                panel_caudal.setVisible(false);
                panel_paralelo.setVisible(false);
                break;
            case 4:
                panel_tramo.setVisible(false);
                panel_serie.setVisible(false);
                panel_paralelo.setVisible(false);
                break;
            default:
                break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Borrar;
    private javax.swing.JButton btn_Calcular;
    private javax.swing.JButton btn_GenerarPDF;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JComboBox<String> cbx_Ec;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_SugEc;
    private javax.swing.JLabel lb_SugEc1;
    private javax.swing.JPanel panel_EcTub;
    private javax.swing.JPanel panel_Resul;
    public javax.swing.JPanel panel_caudal;
    private javax.swing.JPanel panel_imagenResul;
    public javax.swing.JPanel panel_paralelo;
    public javax.swing.JPanel panel_serie;
    public javax.swing.JPanel panel_tramo;
    // End of variables declaration//GEN-END:variables
}
