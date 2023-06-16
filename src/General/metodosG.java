
package General;

import java.awt.BorderLayout;
import javax.swing.JComponent;

public class metodosG {
    /**
     * Metodo para agregar componente Hijo a componente Padre.Osea, Paneles al contenedor principal   
     * @param componentePadre hace referencia al contenedor
     * @param componenteHijo hace referencia a los paneles que se contendran
    */
    public static void addComponentToContainer (JComponent componentePadre, JComponent componenteHijo){
        componenteHijo.setSize(800,320);
        componenteHijo.setLocation(0, 0);
        componentePadre.removeAll();
        componentePadre.add(componenteHijo, BorderLayout.CENTER);
        componentePadre.revalidate();
        componentePadre.repaint();
        componenteHijo.setVisible(false);
        
    }
    /**
     * Metodo para cambiar el estado de visibilidad de un componente    
     * @param componente componente que cambiara estado de visibilidad
     * @param state contendra el valor referente a la visibilidad
    */
    public static void changeState (JComponent componente, boolean state){
        if (!state) {
            componente.setVisible(true);
        } else {
            componente.setVisible(false);
        }
    }
    /**
     * Metodo que permitira habilitar o deshabilitar un componente.
     * @param component componente que se desea habilitar/deshabilitar
     * @param state variable para habilitar(true) o deshabilitar(false)
     */
    public static void changeStateEnableComponent(JComponent component, boolean state){
    component.setEnabled(state);
    }
}
