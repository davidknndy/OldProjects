package calculadora;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
/**
 * @author David Dias
 */
public class Calculadora {

    public static void main(String[] args) {
     float v1=0,v2=0;
     int menu=0;
     float result=0;

     JFrame frame = new JFrame("Greeter");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     try{
     menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Fa�a uma escolha: " + "\n\n" + "1 - Soma" + "\n" + "2 - Subtrair" + "\n" + "3 - Multiplicar" + "\n" + "4 - Dividir" + "\n","Menu",JOptionPane.OK_CANCEL_OPTION));
     }catch(Exception e){JOptionPane.showMessageDialog(null, "Clique OK pra sair."); System.exit(0);}
     do{
     try{
         switch (menu){
         case 1:
         v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um n�mero: "));
         v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro n�mero: "));
         result=v1+v2;
         JOptionPane.showMessageDialog(null,"A soma �: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
             break;
           case 2:
           v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um n�mero: "));
           v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro n�mero: "));
           result=v1-v2;
           JOptionPane.showMessageDialog(null,"A subtra��o �: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
               break;
              case 3:
              v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um n�mero: "));
              v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro n�mero: "));
              result=v1*v2;
              JOptionPane.showMessageDialog(null,"A multiplica��o �: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
                  break;
                case 4:
                   v1=Float.parseFloat(JOptionPane.showInputDialog("Insira um n�mero: "));
                   v2=Float.parseFloat(JOptionPane.showInputDialog("Insira outro n�mero: "));
                try {
                result=v1/v2;
                }
                catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null,"Divis�o por 0.");
                    }
                JOptionPane.showMessageDialog(null,"Imposs�vel dividir por 0.");
                JOptionPane.showMessageDialog(null,"A divis�o �: " + result,"Resultado",JOptionPane.PLAIN_MESSAGE);
                break;
                default:
                    JOptionPane.showMessageDialog(null,"Op��o inválida.");
                    break;
             }
         menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Fa�a uma nova escolha: " + "\n\n" + "1 - Soma" + "\n" + "2 - Subtrair" + "\n" + "3 - Multiplicar" + "\n" + "4 - Dividir" + "\n","Escolha",JOptionPane.PLAIN_MESSAGE));
         }
         catch (Exception e) {JOptionPane.showMessageDialog(null,"Clique OK para sair."); System.exit(0);}
      }while (true);
     }
}
               
