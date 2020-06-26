package descobremaior;
import javax.swing.JOptionPane;
/**
 * @athor David Kennedy
 */
public class DescobreMaior {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float v1,v2;
            
        v1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
        v2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número:"));

        max(v1,v2);
       
    }
    public static void max(float n1, float n2){
        
        if (n1 > n2)
            
           JOptionPane.showMessageDialog(null,"O primeiro número, que é " + n1 + ", é maior.");
            
        else if (n2 > n1) JOptionPane.showMessageDialog(null,"O segundo número, que é " + n2 + ", é maior.");
       
        else JOptionPane.showMessageDialog(null,"Os números são iguais.");
    }
    
}
