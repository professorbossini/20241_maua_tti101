import javax.swing.JOptionPane;
public class SomarDoisNumeros{
  public static void main(String args []){

    double primeiroNumero;
    double segundoNumero;
    double resultado;
    //entrada
    //classe empacotadora (wrapper)
    //Double
    primeiroNumero = Double.parseDouble(
      JOptionPane.showInputDialog("Digite o primeiro numero")
    );
    segundoNumero = Double.parseDouble(
      JOptionPane.showInputDialog("Digite o segundo numero")
    );

    //processamento
    resultado = primeiroNumero + segundoNumero;

    //saida
    JOptionPane.showMessageDialog(null, resultado);
  }
}