package calcularimc;
import javax.swing.JOptionPane;

/**
 * @author David Kennedy
 */
public class CalcularIMC {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double p=0,a=0,imc=0;
        
        JOptionPane.showMessageDialog(null, "Programa que calcula o IMC (Indice de Massa Corporal).");
        do{
            try{
        p=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite seu peso abaixo:","Peso",JOptionPane.PLAIN_MESSAGE));
        a=Float.parseFloat(JOptionPane.showInputDialog(null,"Digite sua altura abaixo:","Altura",JOptionPane.PLAIN_MESSAGE));
            }catch (Exception e) {JOptionPane.showMessageDialog(null,"Pressione OK pra sair.");System.exit(0);}
        imc=(p/(Math.pow(a, 2)));
        
        JOptionPane.showMessageDialog(null,"O seu IMC é: " + imc + "\n\n Confira seu resultado na tabela abaixo:\n\n" +
                                                             "Abaixo de 17                  Muito abaixo do peso.\n" +
                                                             "Entre 17 e 18,49            Abaixo do peso.\n" +
                                                             "Entre 18,5 e 24,99	         Peso normal.\n" +
                                                             "Entre 25 e 29,99            Acima do peso.\n" +
                                                             "Entre 30 e 34,99            Obesidade I.\n" +
                                                             "Entre 35 e 39,99            Obesidade II (severa).\n" +
                                                             "Acima de 40                   Obesidade III (mórbida).");
        }while(true);
    }
}
