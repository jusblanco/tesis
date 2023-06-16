
package igu;

import java.awt.Component;

public class panel4 extends javax.swing.JPanel {

    public panel4() {
        initComponents();
        /*hago no visibles todos los "subpaneles" , ya que el propio boton
        Siguiente visibiliza el solicitado
        */ 
        panel_tramo.setVisible(false);
        panel_caudal.setVisible(false);
        panel_serie.setVisible(false);
        panel_paralelo.setVisible(false);
        /*Deshabilito todo el panel de datos y el boton cambiar
        */
        setComponentEnabled(panel_datos, false);
        btn_cambiar.setEnabled(false);
       
    }
    /**
     * Metodo para deshabilitar/habilitar todos los componentes internos
     * @param c :Contenedor de los componentes
     * @param en :true/habilitar , false/deshabilitar
     */
    private void setComponentEnabled (java.awt.Container c, boolean en){
          Component [] components = c.getComponents();
          for(Component comp: components){
              if (comp instanceof  java.awt.Container) {
                  setComponentEnabled((java.awt.Container) comp, en);
              }
              comp.setEnabled(en);
          }
    }
    /**
     * Metodo para habilitar solo los componentes requeridos, deshabilitando
     * la variable que se va a calcular, ademas de deshabilitar los radio boton
     * iniciales
     */
    private void showPanelData (){
        panel_datos.setVisible(true);
        if (rb_CP.isSelected()) {
            setComponentEnabled(panel_datos, true);
            cbx_Pent.setEnabled(false);
            cbx_Psal.setEnabled(false);
            txt_Pent.setEnabled(false);
            txt_Psal.setEnabled(false);
        } else if (rb_DT.isSelected()) {
            setComponentEnabled(panel_datos, true);
            cbx_d.setEnabled(false);
            txt_d.setEnabled(false);
        } else if (rb_LT.isSelected()) {
            setComponentEnabled(panel_datos, true);
            cbx_l.setEnabled(false);
            txt_l.setEnabled(false);
        } else if (rb_CC.isSelected()) {
            setComponentEnabled(panel_datos, true);
            cbx_Q.setEnabled(false);
            txt_Q.setEnabled(false);
        }
        rb_CC.setEnabled(false);
        rb_CP.setEnabled(false);
        rb_DT.setEnabled(false);
        rb_LT.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_tramo = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        panel_tramo = new javax.swing.JPanel();
        rb_CC = new javax.swing.JRadioButton();
        rb_DT = new javax.swing.JRadioButton();
        btn_Ok = new javax.swing.JButton();
        rb_LT = new javax.swing.JRadioButton();
        rb_CP = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        btn_cambiar = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        txt_d = new javax.swing.JTextField();
        txt_l = new javax.swing.JTextField();
        txt_Psal = new javax.swing.JTextField();
        txt_Pent = new javax.swing.JTextField();
        txt_Q = new javax.swing.JTextField();
        lb_d = new javax.swing.JLabel();
        lb_l = new javax.swing.JLabel();
        lb_q = new javax.swing.JLabel();
        lb_pe = new javax.swing.JLabel();
        lb_ps = new javax.swing.JLabel();
        cbx_d = new javax.swing.JComboBox<>();
        cbx_l = new javax.swing.JComboBox<>();
        cbx_Pent = new javax.swing.JComboBox<>();
        cbx_Psal = new javax.swing.JComboBox<>();
        cbx_Q = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbx_gas = new javax.swing.JComboBox<>();
        cbx_tf = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        panel_paralelo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_serie = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panel_caudal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(251, 253, 253));
        setPreferredSize(new java.awt.Dimension(800, 320));

        jDesktopPane1.setBackground(new java.awt.Color(251, 253, 253));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(800, 320));

        panel_tramo.setBackground(new java.awt.Color(251, 253, 253));
        panel_tramo.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_tramo.setPreferredSize(new java.awt.Dimension(800, 320));

        rb_CC.setBackground(new java.awt.Color(251, 253, 253));
        grp_tramo.add(rb_CC);
        rb_CC.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rb_CC.setText("Caudal circulante ( Q )");

        rb_DT.setBackground(new java.awt.Color(251, 253, 253));
        grp_tramo.add(rb_DT);
        rb_DT.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rb_DT.setText("Diametro de la tuberia");

        btn_Ok.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_Ok.setText("OK");
        btn_Ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OkActionPerformed(evt);
            }
        });

        rb_LT.setBackground(new java.awt.Color(251, 253, 253));
        grp_tramo.add(rb_LT);
        rb_LT.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rb_LT.setText("Longitud de tuberia ( L )");

        rb_CP.setBackground(new java.awt.Color(251, 253, 253));
        grp_tramo.add(rb_CP);
        rb_CP.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rb_CP.setSelected(true);
        rb_CP.setText("Caida de Presion (AP)");

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setText("¿Que desea calcular?");

        btn_cambiar.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_cambiar.setText("Cambiar");
        btn_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cambiarActionPerformed(evt);
            }
        });

        panel_datos.setBackground(new java.awt.Color(251, 253, 253));
        panel_datos.setPreferredSize(new java.awt.Dimension(800, 200));

        txt_d.setBackground(new java.awt.Color(251, 253, 253));

        txt_l.setBackground(new java.awt.Color(251, 253, 253));

        txt_Psal.setBackground(new java.awt.Color(251, 253, 253));

        txt_Pent.setBackground(new java.awt.Color(251, 253, 253));

        txt_Q.setBackground(new java.awt.Color(251, 253, 253));

        lb_d.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lb_d.setText("Diametro");

        lb_l.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lb_l.setText("Longitud");

        lb_q.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lb_q.setText("Caudal");

        lb_pe.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lb_pe.setText("P entrada");

        lb_ps.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        lb_ps.setText("P salida");

        cbx_d.setBackground(new java.awt.Color(251, 253, 253));
        cbx_d.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_d.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cm", "pulgadas" }));

        cbx_l.setBackground(new java.awt.Color(251, 253, 253));
        cbx_l.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_l.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "ft" }));

        cbx_Pent.setBackground(new java.awt.Color(251, 253, 253));
        cbx_Pent.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_Pent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pa", "psi" }));

        cbx_Psal.setBackground(new java.awt.Color(251, 253, 253));
        cbx_Psal.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_Psal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pa", "psi" }));

        cbx_Q.setBackground(new java.awt.Color(251, 253, 253));
        cbx_Q.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_Q.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m3/h", "gal/h" }));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setText("Gas de trabajo");

        cbx_gas.setBackground(new java.awt.Color(251, 253, 253));
        cbx_gas.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_gas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un gas", "Acetileno", "Aire", "Argon", "Dioxido de carbono", "Hidrogeno", "Nitrogeno", "Oxigeno", "Vapor de agua" }));

        cbx_tf.setBackground(new java.awt.Color(251, 253, 253));
        cbx_tf.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        cbx_tf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "35" }));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setText("Temperatura del gas");

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setText("°C");

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lb_d)
                                .addComponent(lb_pe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lb_ps, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                            .addComponent(lb_q, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_d, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Pent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Psal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_d, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_l, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_Pent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_Psal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbx_Q, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_gas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addComponent(cbx_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)))
                .addGap(109, 109, 109))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_d)
                            .addComponent(cbx_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_l)
                            .addComponent(txt_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbx_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Pent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_pe)
                            .addComponent(cbx_Pent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Psal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ps)
                            .addComponent(cbx_Psal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_q)
                            .addComponent(cbx_Q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_datosLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbx_gas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_tramoLayout = new javax.swing.GroupLayout(panel_tramo);
        panel_tramo.setLayout(panel_tramoLayout);
        panel_tramoLayout.setHorizontalGroup(
            panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tramoLayout.createSequentialGroup()
                .addContainerGap(481, Short.MAX_VALUE)
                .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241))
            .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_tramoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_tramoLayout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(panel_tramoLayout.createSequentialGroup()
                                    .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rb_CP)
                                        .addComponent(rb_LT))
                                    .addGap(44, 44, 44)
                                    .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rb_CC)
                                        .addComponent(rb_DT)))))
                        .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        panel_tramoLayout.setVerticalGroup(
            panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tramoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btn_Ok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cambiar)
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_tramoLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_CP)
                        .addComponent(rb_DT))
                    .addGap(15, 15, 15)
                    .addGroup(panel_tramoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_LT)
                        .addComponent(rb_CC))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        panel_paralelo.setBackground(new java.awt.Color(251, 253, 253));
        panel_paralelo.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_paralelo.setPreferredSize(new java.awt.Dimension(800, 320));

        jLabel2.setText("panel4\nparalelo");

        javax.swing.GroupLayout panel_paraleloLayout = new javax.swing.GroupLayout(panel_paralelo);
        panel_paralelo.setLayout(panel_paraleloLayout);
        panel_paraleloLayout.setHorizontalGroup(
            panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paraleloLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel2)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        panel_paraleloLayout.setVerticalGroup(
            panel_paraleloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_paraleloLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        panel_serie.setBackground(new java.awt.Color(251, 253, 253));
        panel_serie.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_serie.setPreferredSize(new java.awt.Dimension(800, 320));

        jLabel3.setText("panel4 serie");

        javax.swing.GroupLayout panel_serieLayout = new javax.swing.GroupLayout(panel_serie);
        panel_serie.setLayout(panel_serieLayout);
        panel_serieLayout.setHorizontalGroup(
            panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serieLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel3)
                .addContainerGap(413, Short.MAX_VALUE))
        );
        panel_serieLayout.setVerticalGroup(
            panel_serieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_serieLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel3)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        panel_caudal.setBackground(new java.awt.Color(251, 253, 253));
        panel_caudal.setMinimumSize(new java.awt.Dimension(800, 320));
        panel_caudal.setPreferredSize(new java.awt.Dimension(800, 320));

        jLabel4.setText("panel4 caudal");

        javax.swing.GroupLayout panel_caudalLayout = new javax.swing.GroupLayout(panel_caudal);
        panel_caudal.setLayout(panel_caudalLayout);
        panel_caudalLayout.setHorizontalGroup(
            panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caudalLayout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel4)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        panel_caudalLayout.setVerticalGroup(
            panel_caudalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_caudalLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel4)
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
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_OkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OkActionPerformed
        showPanelData();
        //Deshabilita el boton ok y habilitar el cambiar para posibles cambios
        btn_cambiar.setEnabled(true);
        btn_Ok.setEnabled(false);
    }//GEN-LAST:event_btn_OkActionPerformed
    
    private void btn_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cambiarActionPerformed
        /*Habilita los radio boton iniciales, deshabilita las casillas para 
        datos, habilita de nuevo el boton ok y deshabilita el boton cambiar
        */
        rb_CC.setEnabled(true);
        rb_CP.setEnabled(true);
        rb_DT.setEnabled(true);
        rb_LT.setEnabled(true);
        setComponentEnabled(panel_datos, false);
        btn_Ok.setEnabled(true);
        btn_cambiar.setEnabled(false);
    }//GEN-LAST:event_btn_cambiarActionPerformed

    
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ok;
    private javax.swing.JButton btn_cambiar;
    private javax.swing.JComboBox<String> cbx_Pent;
    private javax.swing.JComboBox<String> cbx_Psal;
    private javax.swing.JComboBox<String> cbx_Q;
    private javax.swing.JComboBox<String> cbx_d;
    public javax.swing.JComboBox<String> cbx_gas;
    private javax.swing.JComboBox<String> cbx_l;
    private javax.swing.JComboBox<String> cbx_tf;
    private javax.swing.ButtonGroup grp_tramo;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_d;
    private javax.swing.JLabel lb_l;
    private javax.swing.JLabel lb_pe;
    private javax.swing.JLabel lb_ps;
    private javax.swing.JLabel lb_q;
    public javax.swing.JPanel panel_caudal;
    private javax.swing.JPanel panel_datos;
    public javax.swing.JPanel panel_paralelo;
    public javax.swing.JPanel panel_serie;
    public javax.swing.JPanel panel_tramo;
    private javax.swing.JRadioButton rb_CC;
    private javax.swing.JRadioButton rb_CP;
    private javax.swing.JRadioButton rb_DT;
    private javax.swing.JRadioButton rb_LT;
    public javax.swing.JTextField txt_Pent;
    public javax.swing.JTextField txt_Psal;
    public javax.swing.JTextField txt_Q;
    public javax.swing.JTextField txt_d;
    public javax.swing.JTextField txt_l;
    // End of variables declaration//GEN-END:variables
}
