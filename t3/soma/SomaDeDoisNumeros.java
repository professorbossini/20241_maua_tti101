import javax.swing.JOptionPane;
public class SomaDeDoisNumeros{
  public static void main(String args []){
    //declaração de variável
    double primeiroValor;
    double segundoValor;
    double resultado;
    //entrada
    //classe utilitária chamada Double (empacotadora (wrapper))
    primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
    
    segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
    //processamento
    resultado = primeiroValor + segundoValor;
    //saida
    //JOptionPane.showMessageDialog(null, resultado);
    //2 + 3 = 5
    //pesquisar sobre String.format
    String exibir = String.format("%f + %f = %f", primeiroValor, segundoValor, resultado);
    JOptionPane.showMessageDialog(null, exibir); 
  }
}