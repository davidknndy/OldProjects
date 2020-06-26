package calculadora;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * @author David kennedy
 */
public class Calculadora {

    public static void main(String[] args) {
     float v1=0,v2=0;
     int menu=0;
     float result=0;

     JFrame frame = new JFrame("Greeter");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     try{
     menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Faça uma escolha: " + "\n\n" + "1 - Soma" + "\n" + "2 - Subtrair" + "\n" + "3 - Multiplicar" + "\n" + "4 - Dividir" + "\n","Menu",JOptionPane.OK_CANCEL_OPTION));
     }catch(Exception e){JOptionPane.showMessageDialog(null, "Clique OK pra sair."); System.exit(0);}
     do{
     try{
         switch (menu){
         case 1:
         v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
         v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro número: "));
         result=v1+v2;
         JOptionPane.showMessageDialog(null,"A soma é: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
             break;
           case 2:
           v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
           v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro número: "));
           result=v1-v2;
           JOptionPane.showMessageDialog(null,"A subtração é: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
               break;
              case 3:
              v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
              v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro número: "));
              result=v1*v2;
              JOptionPane.showMessageDialog(null,"A multiplicação é: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
                  break;
                case 4:
                   v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
                   v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro número: "));
                try {
                result=v1/v2;
                }
                catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null,"Divisão por 0.");
                    }
                JOptionPane.showMessageDialog(null,"Impossível dividir por 0.");
                JOptionPane.showMessageDialog(null,"A divisão é: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção invÃ¡lida.");
                    break;
             }
         menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Faça uma nova escolha: " + "\n\n" + "1 - Soma" + "\n" + "2 - Subtrair" + "\n" + "3 - Multiplicar" + "\n" + "4 - Dividir" + "\n","Escolha",JOptionPane.PLAIN_MESSAGE));
         }
         catch (Exception e) {JOptionPane.showMessageDialog(null,"Clique OK para sair."); System.exit(0);}
      }while (true);
     }
}
               
