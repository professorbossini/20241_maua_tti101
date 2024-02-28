import javax.swing.JOptionPane;
public class AdicaoDeDoisNumeros{
  public static void main(String args []){
    //declaração de variáveis
    double primeiroNumero;//Double
    double segundoNumero;
    double resultado;
    //entrada
    //classe empacotadora(wrapper)
    primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
    segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
    //processamento
    resultado = primeiroNumero + segundoNumero;
    //saida
    JOptionPane.showMessageDialog(null, resultado);
  }
}