package media;
import javax.swing.JOptionPane;
/**
 * @author David Dias
 */
public class Media {
    /**
     * @param args the command line arguments
     */
    public static int med;
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null,"Programa que recebe até 5 números e mostra a média.","Entrada",JOptionPane.PLAIN_MESSAGE);
        float v1,v2,v3,v4,v5,med;
        int menu;
        
        
        try{
        do{
        menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja tirar a média de quantos números:","Menu",JOptionPane.PLAIN_MESSAGE));
        
        if (menu==2){
            v1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
            v2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número:"));
            med=(v1 + v2) / 2;
            JOptionPane.showMessageDialog(null,"A média dos 2 números é: " + med + "\n\n Pressione OK para voltar.","Media",JOptionPane.PLAIN_MESSAGE);
            }
         if (menu==3){
            v1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
            v2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número:"));
            v3=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o terceiro número:"));
            med=(v1 + v2 + v3) / 3;
            JOptionPane.showMessageDialog(null,"A média dos 3 números é: " + med + "\n\n Pressione OK para voltar.","Media",JOptionPane.PLAIN_MESSAGE);
            }
          if (menu==4){
            v1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
            v2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número:"));
            v3=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o terceiro número:"));
            v4=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o quarto número:"));
            med=(v1 + v2 + v3 + v4) / 4;
            JOptionPane.showMessageDialog(null,"A média dos 4 números é: " + med + "\n\n Pressione OK para voltar.","Media",JOptionPane.PLAIN_MESSAGE);
            }
           if (menu==5){
            v1=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o primeiro número:"));
            v2=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o segundo número:"));
            v3=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o terceiro número:"));
            v4=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o quarto número:"));
            v5=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o quinto número:"));
            med=(v1 + v2 + v3 + v4 + v5) / 5;
            JOptionPane.showMessageDialog(null,"A média dos 5 números é: " + med + "\n\n Pressione OK para voltar.","Media",JOptionPane.PLAIN_MESSAGE);
            } 
        }while (true);
    }catch (Exception e) {JOptionPane.showMessageDialog(null,"Pressione OK para sair.");System.exit(0);}
    }
}