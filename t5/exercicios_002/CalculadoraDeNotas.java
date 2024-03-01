import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
public class CalculadoraDeNotas{
  public static void main(String... args){
    //declaração de variáveis
    //byte(1 byte), short(2 bytes), int(4 bytes), long(8 bytes)
    int valor;
    int qtde200, qtde100, qtde50, qtde20, qtde10, qtde5, qtde2, qtde1;
    //entrada
    //valor = Integer.parseInt(showInputDialog("Digite o valor"));
    valor = parseInt(showInputDialog("Digite o valor"));
    //processamento
    qtde200 = valor / 200;
    qtde100 = valor % 200 / 100;
    qtde50 = valor % 200 % 100 / 50;
    //saida
    JOptionPane.showMessageDialog(null, String.format("%d", 1));
  }
}