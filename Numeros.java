package numeros;
import javax.swing.JOptionPane;
/**
 * @author David
 */
public class Numeros {
    /**
     * @param args the command line arguments
     */
    public static String nome="";
    public static void main(String[] args) {
        // TODO code application logic here
        int n1=0,n2=0,n3=0;
        JOptionPane.showMessageDialog(null,"PROGRAMA QUE RECEBE 3 NÚMEROS E\n"
                                         + "     MOSTRA O MAIOR NA TELA.");
        olaTela();
        
        JOptionPane.showMessageDialog(null,"Seja bem-vindo " + nome +".","Bemvindo",JOptionPane.PLAIN_MESSAGE);
        
        try{
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o primeiro número: ","Primeiro",JOptionPane.PLAIN_MESSAGE));
        n2=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o segundo número: ","Segundo",JOptionPane.PLAIN_MESSAGE));
        n3=Integer.parseInt(JOptionPane.showInputDialog(null,"Insira o terceiro número: ","Terceiro",JOptionPane.PLAIN_MESSAGE));
        }catch (Exception e) {JOptionPane.showMessageDialog(null,"Número inválido.\n" + "Pressione OK para sair."); System.exit(0);}
        
         if (n1>n2 && n1>n3){
        JOptionPane.showMessageDialog(null,"O primeiro número é o maior.");
            }
         if (n2>n1 && n2>n3){
        JOptionPane.showMessageDialog(null,"O segundo número é o maior.");
        }
         else
             JOptionPane.showMessageDialog(null,"O terceiro número é o maior.");
    }
    
    public static void olaTela(){
        nome=JOptionPane.showInputDialog(null,"Digite seu nome abaixo:","Ola",JOptionPane.PLAIN_MESSAGE);
        if(nome == null )  {
            JOptionPane.showMessageDialog(null, "Sem nome OU Inválido" + ".\n\n" + "Pressione OK para sair." ,"Erro",JOptionPane.ERROR_MESSAGE);System.exit(0);
    }
    
    
    }
}
