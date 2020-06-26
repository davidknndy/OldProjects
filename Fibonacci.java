package fibonacci;
import javax.swing.JOptionPane;
/**
 * @author David Kennedy
 */
public class Fibonacci {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int get;
        int n1=0,n2=1;
        String con="";
        
        get=JOptionPane.showConfirmDialog(null,"Programa que mostra a sequência\n"
                                            + "de Fibonacci de 1 a 1000 na tela.\n\n"
                                            + "        Deseja continuar" + "?");
        if (get==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Pressione OK para sair."); System.exit(0);
        }
         if (get==JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(null,"Pressione OK para sair."); System.exit(0);
        }
         for(int i=0;n1<=1000;i++){
             n1=n1+n2;
             n2=n1-n2;
             con += n1+"\n";
             
    }
         JOptionPane.showMessageDialog(null,"A sequência de Fibonacci de 1 a 1000 é: \n" + con + "\n\n                  Pressione OK para sair.","Fibonacci",JOptionPane.PLAIN_MESSAGE);
    }
}
