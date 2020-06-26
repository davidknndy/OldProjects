package bhaskara;
import javax.swing.JOptionPane;
/**
 * @author David Kennedy
 * Programa para calcular fÃ³rmula de Bhaskara
 */
public class Bhaskara {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int entra;
        float x1=0,x2=0,c=0;
        double r1,r2,d;
               
        entra=JOptionPane.showConfirmDialog(null,"Programa utilizado para calcular Delta e\n"
                                         + " achar as raizes de X linha e X duas linhas.\n\n"
                                         + "Deseja continuar" + "?");
        if(entra == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null,"Pressione OK para sair."); System.exit(0);
        }
        if(entra == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null,"Pressione OK para sair."); System.exit(0);
        }
        do{
            try{
        x1=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor de XÂ²: ","Entrada",JOptionPane.PLAIN_MESSAGE ));
        x2=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor de X: ","Entrada",JOptionPane.PLAIN_MESSAGE));
        c=Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor de C: "));
            }
            catch(Exception e){JOptionPane.showMessageDialog(null,"Pressione OK para sair."); System.exit(0);}
        d=x2*x2 - 4*x1*c;
        if (d<0){
            JOptionPane.showMessageDialog(null,"Delta menor que 0. \n\n" + "Impossível calcular raiz de Delta.","Delta",JOptionPane.PLAIN_MESSAGE);System.exit(0);
        }
       else if (d==0){
            JOptionPane.showMessageDialog(null,"X linha Ã© = X duas linhas que Ã©: " + ((-x2+Math.sqrt(d))/(2*x1)));
        }
        r1=((-x2+Math.sqrt(d))/(2*x1));
        r2=((-x2-Math.sqrt(d))/(2*x1));
        
        JOptionPane.showMessageDialog(null,"O valor de Delta Ã©: " + d,"Resultado Delta",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"O valor de X linha Ã©: " + r1,"Resultado X1",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"O valor de X duas linhas Ã©: " + r2,"Resultado X2",JOptionPane.PLAIN_MESSAGE);
        }while (true);
    }
}
