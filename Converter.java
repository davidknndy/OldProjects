package converter;
import javax.swing.*;
/**
 * @author David
 */
public class Converter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JOptionPane.showMessageDialog(null, "Programa que converte Graus em Fahrenheit, etc."); //Tela entrada.
        float v1;
        int esc=0;
    
        do{
            try{
             esc = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a opção desejada:\n"
                                             + "\n"
                                             + "1 - Celsius para Fahrenheit \n"
                                             + "2 - Fahrenheit para Celsius \n"
                                             + "3 - Celsius para Kelvin \n"
                                             + "4 - Kelvin para Celsius","Menu",JOptionPane.PLAIN_MESSAGE));
                }catch(Exception e) {JOptionPane.showMessageDialog(null, "Pressione OK para sair.","Sair",JOptionPane.PLAIN_MESSAGE);System.exit(0);        
                            }
             
             try{
            switch (esc){
                case 1:
                    v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite os Graus (em Celsius).","Converter",JOptionPane.PLAIN_MESSAGE));
                    double convcf = ((v1 * 1.8) + 32);
                    JOptionPane.showMessageDialog(null,convcf + " Graus Fahrenheit.\n\n" + "Pressione OK para voltar." );
                    break;
                case 2:
                    v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite os Graus (em Fahrenheit).","Converter",JOptionPane.PLAIN_MESSAGE));
                    double convfc = ((v1 - 32) / 1.8);
                    JOptionPane.showMessageDialog(null,convfc + " Graus Celsius.\n\n" + "Pressione OK para voltar." );
                    break;
                case 3:
                    v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite os Graus (em Celsius)","Converter",JOptionPane.PLAIN_MESSAGE));
                    double convck = v1 + 273.15;
                    JOptionPane.showMessageDialog(null,convck + " Graus Kelvin.\n\n" + "Pressione OK para voltar." );
                    break;
                case 4:
                    v1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite os Graus (em Kelvin)","Converter",JOptionPane.PLAIN_MESSAGE));
                    double convkc = v1 - 273.15;
                    JOptionPane.showMessageDialog(null,convkc + " Graus Celsius.\n\n" + "Pressione OK para voltar." );
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.","Erro",JOptionPane.ERROR_MESSAGE);
                    break;
                        }
           
                 }catch (Exception e) {JOptionPane.showMessageDialog (null,"Pressione OK para sair.");
                                      }
          
                 }while(true);
                                        }
                        }
