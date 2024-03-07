import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Byte.parseByte;
import static java.lang.Short.parseShort;
import static java.lang.String.format;
public class CalculoPecaDeRoupa {
  public static void main(String[] args) {
    //declaração de variáveis
    double valorRoupa;
    //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
    byte opcao;
    //Double é uma classe de alta probabilidade de uso
    //parseDouble é membro de Double
    valorRoupa = parseDouble(showInputDialog("Valor da roupa"));
    opcao = parseByte(showInputDialog("0-A vista\n1-Cartao\n2-Crediario"));
    switch(opcao){
      case 0:{
        showMessageDialog(null, "Valor da roupa: " + valorRoupa * 0.9);
        break;
      }
      case 1:{
          short numeroParcelas = parseShort(showInputDialog("Quantas parcelas"));
          //queremos usar o método format de String sem qualificar o acesso
          showMessageDialog(
            null, 
            format("Valor da parcela: %.2f ", valorRoupa / numeroParcelas)
          );
        break;
      }
      case 2:{
          short numeroParcelas = parseShort(showInputDialog("Numero de parcelas"));
          showMessageDialog(
            null, 
            format("Valor da parcela: %.2f", valorRoupa * 1.1 / numeroParcelas)
          );
          break;  
      }
      default:{
        showMessageDialog(null, "Opção inválida");
        break;
      }
    }
  }  
}

