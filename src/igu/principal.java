
package igu;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class principal extends javax.swing.JFrame  {
panel1 panel1 = new panel1();
panel2 panel2 = new panel2();
panel3 panel3 = new panel3();
panel4 panel4 = new panel4();
panel5 panel5 = new panel5();
panel6 panel6 = new panel6();
panel8 panel8 = new panel8();
public static int a;


    public principal() {
          initComponents();
          showPanel(panel1);
             panel2.setVisible(false);
             panel3.setVisible(false);
             panel4.setVisible(false);
                panel4.panel_tramo.setVisible(false);
                panel4.panel_caudal.setVisible(false);
                panel4.panel_paralelo.setVisible(false);
                panel4.panel_serie.setVisible(false);
             panel5.setVisible(false);
             panel6.setVisible(false);
                panel6.panel_tramo.setVisible(false);
                panel6.panel_caudal.setVisible(false);
                panel6.panel_paralelo.setVisible(false);
                panel6.panel_serie.setVisible(false);
             panel8.setVisible(false);
                panel8.panel_tramo.setVisible(false);
                panel8.panel_caudal.setVisible(false);
                panel8.panel_paralelo.setVisible(false);
                panel8.panel_serie.setVisible(false);
          disableButton();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_ant = new javax.swing.JButton();
        btn_sig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 354));
        setSize(new java.awt.Dimension(800, 354));

        contenedor.setBackground(new java.awt.Color(251, 253, 253));
        contenedor.setLayout(new java.awt.BorderLayout());
        getContentPane().add(contenedor, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(251, 253, 253));

        btn_ant.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_ant.setText("Anterior");
        btn_ant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_antActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ant);

        btn_sig.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        btn_sig.setText("Siguiente");
        btn_sig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sig);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_sigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigActionPerformed
         changePanel(2);
         disableButton();
        
    }//GEN-LAST:event_btn_sigActionPerformed

    private void btn_antActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_antActionPerformed
         // ShowPanel(panel1);
          changePanel(1);
          disableButton();         
    }//GEN-LAST:event_btn_antActionPerformed
/**
 * Metodo para mostrar paneles de forma determinada dentro del panel 
 * contenedor que esta en el Form principal.
 * @param panel : panel que se va a mostrar
 */
  private void showPanel(JPanel panel){
         panel.setVisible(true);
         panel.setSize(800, 320);
         panel.setLocation(0, 0);
         contenedor.removeAll();
         contenedor.add(panel , BorderLayout.CENTER);
         contenedor.revalidate();
         contenedor.repaint();
         }
  
  /**
   * Metodo para cambiar de paneles al accionar botones "Siguiente" y/o 
   * "Anterior"
   * @param btn :usado para determinar que boton se esta pulsando. 1 para
   * boton Anterior, 2 para boton Siguiente
   */
  private void changePanel(int btn){
        
          //Boton siguiente
          //pasar de panel 1 a panel 2
          if (panel1.isVisible() && panel1.rb_tuberia.isSelected()) {
             showPanel(panel2);
             panel1.setVisible(false);
             
          //pasar de panel 1 a panel 3
          } else if (panel1.isVisible() && panel1.rb_redes.isSelected()) {
             showPanel(panel3);
             panel1.setVisible(false);
                  
          //pasar de panel 2 a panel 4
          /*adicione una variable "a" para determinar la selecccion 
          a=1 tramo, a=2 paralelo, a=3 serie, a=4 caudal
          */
          } else if (panel2.isVisible() && panel2.rb_tramo.isSelected() && btn==2) {
                        showPanel(panel4);
                        showPanel(panel4.panel_tramo);
                        a=1;
                        panel2.setVisible(false);
          } else if (panel2.isVisible() && panel2.rb_paralelo.isSelected() && btn==2) {
                        showPanel(panel4);
                        showPanel(panel4.panel_paralelo);
                        a=2;
                        panel2.setVisible(false);
          } else if (panel2.isVisible() && panel2.rb_serie.isSelected()&& btn==2) {
                        showPanel(panel4);
                        showPanel(panel4.panel_serie);
                        a=3;
                        panel2.setVisible(false);
          } else if (panel2.isVisible() && panel2.rb_caudal.isSelected() && btn==2) {
                        showPanel(panel4);
                        showPanel(panel4.panel_caudal);
                        a=4;
                        panel2.setVisible(false);    
          
          //pasar de panel 4 a panel 6              
          } else if (panel4.isVisible() && a==1 && btn==2) {
                        showPanel(panel6);
                        showPanel(panel6.panel_tramo);
                        panel4.setVisible(false);
          } else if (panel4.isVisible() && a==2 && btn==2) {
                        showPanel(panel6);
                        showPanel(panel6.panel_paralelo);
                        panel4.setVisible(false);
          } else if (panel4.isVisible() && a==3 && btn==2) {
                        showPanel(panel6);
                        showPanel(panel6.panel_serie);
                        panel4.setVisible(false);
          } else if (panel4.isVisible() && a==4 && btn==2) {
                        showPanel(panel6);
                        showPanel(panel6.panel_caudal);
                        panel4.setVisible(false); 
           
          //Pasar del panel 6 al panel 8
          } else if (panel6.isVisible() && a==1  && btn==2) {
                        showPanel(panel8);
                        panel6.setVisible(false);
          } else if (panel6.isVisible() && a==2 && btn==2) {
                        showPanel(panel8);
                        panel6.setVisible(false);
          } else if (panel6.isVisible() && a==3 && btn==2) {
                        showPanel(panel8);
                        panel6.setVisible(false);
          } else if (panel6.isVisible() && a==4 && btn==2) {
                        showPanel(panel8);
                        panel6.setVisible(false); 
                      
          //Boton anterior
          //retroceder al panel 2
          } else if ((panel4.isVisible() || panel5.isVisible()) && btn==1) {
                 showPanel(panel2);
                 panel4.panel_tramo.setVisible(false);
                 panel4.panel_caudal.setVisible(false);
                 panel4.panel_paralelo.setVisible(false);
                 panel4.panel_serie.setVisible(false);
                 panel4.setVisible(false);
                 panel5.setVisible(false);
                 
          //retroceder al panel 4       
          } else if (panel6.isVisible() && a==1 && btn==1) {
                        showPanel(panel4);
                        showPanel(panel4.panel_tramo);
                        panel6.setVisible(false);
                        panel6.panel_tramo.setVisible(false);
          } else if (panel6.isVisible() && a==2 && btn==1) {
                        showPanel(panel4);
                        showPanel(panel4.panel_paralelo);
                        panel6.setVisible(false);
                        panel6.panel_paralelo.setVisible(false);
         } else if (panel6.isVisible() && a==3 && btn==1) {
                        showPanel(panel4);
                        showPanel(panel4.panel_serie);
                        panel6.setVisible(false);
                        panel6.panel_serie.setVisible(false);
          } else if (panel6.isVisible() && a==4 && btn==1) {
                        showPanel(panel4);
                        showPanel(panel4.panel_caudal);
                        panel6.setVisible(false);
                        panel6.panel_caudal.setVisible(false);
          
          
          //Retroceder al panel 6
          //falta desseleccionar radio boton Si
          } else if (panel8.isVisible() && a==1 && btn==1) {
                        showPanel(panel6);
                        showPanel(panel6.panel_tramo);
                        panel8.btn_si.setSelected(false);
                        panel8.setVisible(false);
                        panel8.panel_tramo.setVisible(false);
          } else if (panel8.isVisible() && a==2 && btn==1) {
                        showPanel(panel6);
                        showPanel(panel6.panel_paralelo);
                        panel8.btn_si.setSelected(false);
                        panel8.setVisible(false);
                        panel8.panel_paralelo.setVisible(false);
          } else if (panel8.isVisible() && a==3 && btn==1) {
                        showPanel(panel6);
                        showPanel(panel6.panel_serie);
                        panel8.btn_si.setSelected(false);
                        panel8.setVisible(false);
                        panel8.panel_serie.setVisible(false);
          } else if (panel8.isVisible() && a==4 && btn==1) {
                        showPanel(panel6);
                        showPanel(panel6.panel_caudal);
                        panel8.btn_si.setSelected(false);
                        panel8.setVisible(false);
                        panel8.panel_caudal.setVisible(false);
          
          //retroceder a panel 1    
          }else if ((panel2.isVisible() || panel3.isVisible()) && btn==1) {
                 showPanel(panel1);
                 panel2.setVisible(false);
                 panel3.setVisible(false); 
          }
             contenedor.validate();
  }
  
         /**
          * Metodo para deshabilitar botones al llegar a paneles limitantes
          */
         private void disableButton(){
              if (panel1.isVisible()) {
                 btn_ant.setEnabled(false);
                 btn_sig.setEnabled(true);
             } else if (panel5.isVisible()) {
                 //Aca va es el ultimo panel, que por ahora es el 5
                 btn_ant.setEnabled(true);
                 btn_sig.setEnabled(false);
             /*} else if (panel4.isVisible() ) {
                 //inhabilitar boton siguiente si no hay datos en panel 4
                 btn_ant.setEnabled(true);
                 btn_sig.setEnabled(false);*/
             } else {
                 btn_ant.setEnabled(true);
                 btn_sig.setEnabled(true);
             }
         }
         
         
        
 
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_ant;
    public javax.swing.JButton btn_sig;
    public javax.swing.JPanel contenedor;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void elseif(boolean b) {
        
    }

    
}
