
package igu;

import static igu.principal.a;


public class panel8 extends javax.swing.JPanel {

    
    public panel8() {
        initComponents();
            panel_multiple.setVisible(false);
            btn_menuP.setVisible(false);
            btn_salir.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btgr_tramo = new javax.swing.ButtonGroup();
        btgr_paralelo = new javax.swing.ButtonGroup();
        btgr_serie = new javax.swing.ButtonGroup();
        btgr_caudal = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        btn_no = new javax.swing.JRadioButton();
        btn_si = new javax.swing.JRadioButton();
        panel_multiple = new javax.swing.JDesktopPane();
        panel_tramo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        panel_paralelo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        panel_serie = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        panel_caudal = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        btn_menuP = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setBackground(new java.awt.Color(251, 253, 253));
        setMinimumSize(new java.awt.Dimension(800, 320));
        setPreferredSize(new java.awt.Dimension(800, 320));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("¿Desea continuar utilizando los datos iniciales ingresados?");
        add(jLabel2);
        jLabel2.setBounds(187, 10, 430, 21);

        btn_no.setBackground(new java.awt.Color(251, 253, 253));
        buttonGroup1.add(btn_no);
        btn_no.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_no.setText("NO");
        btn_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_noActionPerformed(evt);
            }
        });
        add(btn_no);
        btn_no.setBounds(360, 60, 50, 21);

        btn_si.setBackground(new java.awt.Color(251, 253, 253));
        buttonGroup1.add(btn_si);
        btn_si.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_si.setText("SI");
        btn_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siActionPerformed(evt);
            }
        });
        add(btn_si);
        btn_si.setBounds(360, 40, 40, 21);

        panel_multiple.setBackground(new java.awt.Color(251, 253, 253));
        panel_multiple.setLayout(new java.awt.CardLayout());

        panel_tramo.setBackground(new java.awt.Color(251, 253, 253));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("¿Que desea hacer?");

        jRadioButton3.setBackground(new java.awt.Color(251, 253, 253));
        btgr_tramo.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton3.setText("Crear arreglo de tuberias en PARALELO");

        jRadioButton4.setBackground(new java.awt.Color(251, 253, 253));
        btgr_tramo.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton4.setText("Crear arreglo de tuberia en SERIE");

        jRadioButton5.setBackground(new java.awt.Color(251, 253, 253));
        btgr_tramo.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton5.setText("Aumentar caudal, sin aumentar caida de presion");

        javax.swing.GroupLayout panel_tramoLayout = new javax.swing.GroupLayout(panel_tramo);
        panel_tramo.setLayout(panel_tramoLayout);
        panel_tramoLayout.setHorizontalGroup(
            panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tramoLayout.createSequentialGroup()
                .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_tramoLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton5)))
                    .addGroup(panel_tramoLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel1)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        panel_tramoLayout.setVerticalGroup(
            panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tramoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        panel_multiple.add(panel_tramo, "card2");

        panel_paralelo.setBackground(new java.awt.Color(251, 253, 253));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("¿Que desea hacer?");

        jRadioButton7.setBackground(new java.awt.Color(251, 253, 253));
        btgr_paralelo.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton7.setText("Crear arreglo de tuberia en SERIE");

        jRadioButton8.setBackground(new java.awt.Color(251, 253, 253));
        btgr_paralelo.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton8.setText("Aumentar caudal, sin aumentar caida de presion");

        javax.swing.GroupLayout panel_paraleloLayout = new javax.swing.GroupLayout(panel_paralelo);
        panel_paralelo.setLayout(panel_paraleloLayout);
        panel_paraleloLayout.setHorizontalGroup(
            panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paraleloLayout.createSequentialGroup()
                .addGroup(panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_paraleloLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8)))
                    .addGroup(panel_paraleloLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel3)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        panel_paraleloLayout.setVerticalGroup(
            panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paraleloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton8)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        panel_multiple.add(panel_paralelo, "card3");

        panel_serie.setBackground(new java.awt.Color(251, 253, 253));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setText("¿Que desea hacer?");

        jRadioButton9.setBackground(new java.awt.Color(251, 253, 253));
        btgr_serie.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton9.setText("Crear arreglo de tuberias en PARALELO");

        jRadioButton11.setBackground(new java.awt.Color(251, 253, 253));
        btgr_serie.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton11.setText("Aumentar caudal, sin aumentar caida de presion");

        javax.swing.GroupLayout panel_serieLayout = new javax.swing.GroupLayout(panel_serie);
        panel_serie.setLayout(panel_serieLayout);
        panel_serieLayout.setHorizontalGroup(
            panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serieLayout.createSequentialGroup()
                .addGroup(panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_serieLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton9)
                            .addComponent(jRadioButton11)))
                    .addGroup(panel_serieLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel4)))
                .addContainerGap(301, Short.MAX_VALUE))
        );
        panel_serieLayout.setVerticalGroup(
            panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serieLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton11)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        panel_multiple.add(panel_serie, "card4");

        panel_caudal.setBackground(new java.awt.Color(251, 253, 253));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setText("¿Que desea hacer?");

        jRadioButton12.setBackground(new java.awt.Color(251, 253, 253));
        btgr_caudal.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton12.setText("Crear arreglo de tuberias en PARALELO");

        jRadioButton13.setBackground(new java.awt.Color(251, 253, 253));
        btgr_caudal.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jRadioButton13.setText("Crear arreglo de tuberia en SERIE");

        javax.swing.GroupLayout panel_caudalLayout = new javax.swing.GroupLayout(panel_caudal);
        panel_caudal.setLayout(panel_caudalLayout);
        panel_caudalLayout.setHorizontalGroup(
            panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caudalLayout.createSequentialGroup()
                .addGroup(panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_caudalLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton13)
                            .addComponent(jRadioButton12)))
                    .addGroup(panel_caudalLayout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLabel5)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        panel_caudalLayout.setVerticalGroup(
            panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caudalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton13)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        panel_multiple.add(panel_caudal, "card5");

        add(panel_multiple);
        panel_multiple.setBounds(0, 100, 800, 220);

        btn_menuP.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_menuP.setText("Menu Principal");
        add(btn_menuP);
        btn_menuP.setBounds(500, 40, 130, 23);

        btn_salir.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_salir.setText("Salir");
        add(btn_salir);
        btn_salir.setBounds(500, 70, 130, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siActionPerformed
        /*Mostrara solo el subpanel solicitado, no mostrara los botones extra
        (probablemente pueda simplificar ese switch al optimizar el codigo)
        */
        panel_multiple.setVisible(true);
        btn_menuP.setVisible(false);
        btn_salir.setVisible(false);
        switch (a) {
            case 1:
                panel_tramo.setVisible(true);
                panel_caudal.setVisible(false);
                panel_serie.setVisible(false);
                panel_paralelo.setVisible(false);
                break;
            case 2:
                panel_tramo.setVisible(false);
                panel_caudal.setVisible(false);
                panel_serie.setVisible(false);
                panel_paralelo.setVisible(true);
                break;
            case 3:
                panel_tramo.setVisible(false);
                panel_caudal.setVisible(false);
                panel_serie.setVisible(true);
                panel_paralelo.setVisible(false);
                break;
            case 4:
                panel_tramo.setVisible(false);
                panel_caudal.setVisible(true);
                panel_serie.setVisible(false);
                panel_paralelo.setVisible(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_siActionPerformed

    private void btn_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_noActionPerformed
        /*Muestra los botones Menu principal y salir, oculta todos los 
        subpaneles. Falta colocarle funcionabilidad a los botones
        */
        btn_menuP.setVisible(true);
        btn_salir.setVisible(true);
        panel_multiple.setVisible(false);
    }//GEN-LAST:event_btn_noActionPerformed


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgr_caudal;
    private javax.swing.ButtonGroup btgr_paralelo;
    private javax.swing.ButtonGroup btgr_serie;
    private javax.swing.ButtonGroup btgr_tramo;
    private javax.swing.JButton btn_menuP;
    public javax.swing.JRadioButton btn_no;
    private javax.swing.JButton btn_salir;
    public javax.swing.JRadioButton btn_si;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    public javax.swing.JPanel panel_caudal;
    public javax.swing.JDesktopPane panel_multiple;
    public javax.swing.JPanel panel_paralelo;
    public javax.swing.JPanel panel_serie;
    public javax.swing.JPanel panel_tramo;
    // End of variables declaration//GEN-END:variables
}
