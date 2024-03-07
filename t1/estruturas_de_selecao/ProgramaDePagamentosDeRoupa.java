import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Byte.parseByte;
public class ProgramaDePagamentosDeRoupa{
  public static void main(String[] args) {
    //declaração de variáveis
    double valor;
    //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
    byte opcao;
    //entrada
    valor = parseDouble(showInputDialog("Digite o valor"));
    opcao = parseByte(showInputDialog("0-A vista\n1-Cartao\n2-Crediario"));
    //processamento
    //saída
    switch(opcao){
      case 0:{
        showMessageDialog(null, "Valor a vista: " + valor * 0.9);
        break;
      }
      case 1:{
        byte numeroDeParcelas = parseByte(showInputDialog("Numero de parcelas"));
        showMessageDialog(null, "Valor da parcela: " + valor / numeroDeParcelas);
        break;
      }
      case 2:{
        byte numeroDeParcelas = parseByte(showInputDialog("Numero de parcelas"));
        showMessageDialog(null, "Valor da parcela: " + valor * 1.1 / numeroDeParcelas);
        break;
      }
      default:{
        showMessageDialog(null, "Opção inválida");
        break;      
      }

    }

  }
}