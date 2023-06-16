
package igu;
public class panel1 extends javax.swing.JPanel {

    //public static char selec1;
    public panel1() {
        initComponents();
       }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_panel1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rb_tuberia = new javax.swing.JRadioButton();
        rb_redes = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(251, 253, 253));
        setPreferredSize(new java.awt.Dimension(400, 326));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a JM Fluid");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("¿Que tipo de Cálculo desea hacer?");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        rb_tuberia.setBackground(new java.awt.Color(251, 253, 253));
        grp_panel1.add(rb_tuberia);
        rb_tuberia.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rb_tuberia.setForeground(new java.awt.Color(0, 0, 0));
        rb_tuberia.setSelected(true);
        rb_tuberia.setText("Cálculo de Tubería");
        rb_tuberia.setToolTipText("");
        rb_tuberia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_tuberiaActionPerformed(evt);
            }
        });

        rb_redes.setBackground(new java.awt.Color(251, 253, 253));
        grp_panel1.add(rb_redes);
        rb_redes.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        rb_redes.setForeground(new java.awt.Color(0, 0, 0));
        rb_redes.setText("Cálculo de Redes");
        rb_redes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_redesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_tuberia)
                            .addComponent(jLabel2)
                            .addComponent(rb_redes))
                        .addGap(257, 257, 257))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_tuberia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_redes)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rb_tuberiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_tuberiaActionPerformed
        // TODO add your handling code here:
        //selec1='1';
        
    }//GEN-LAST:event_rb_tuberiaActionPerformed

    private void rb_redesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_redesActionPerformed
        // TODO add your handling code here:
       //selec1='2';
                
    }//GEN-LAST:event_rb_redesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grp_panel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JRadioButton rb_redes;
    public javax.swing.JRadioButton rb_tuberia;
    // End of variables declaration//GEN-END:variables
}
