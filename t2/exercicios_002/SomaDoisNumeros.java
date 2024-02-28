import javax.swing.JOptionPane;
public class SomaDoisNumeros{
  public static void main(String [] args){

    //declaração de variáveis
    double primeiroValor;
    double segundoValor;
    double resultado;
    //entrada
    primeiroValor = Double.parseDouble(
      JOptionPane.showInputDialog("Digite o valor 1") 
    );
    segundoValor = Double.parseDouble(
      JOptionPane.showInputDialog("Digite o valor 2") 
    );
    //processamento
    resultado = primeiroValor + segundoValor;
    //saida
    JOptionPane.showMessageDialog(null, resultado);
  }
}