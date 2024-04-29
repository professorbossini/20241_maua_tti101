import javax.swing.JOptionPane;

public class SomaDoisNumeros{
  public static void main(String[] args){
    // Declaração de Variáveis  
    double primeiroNumero, segundoNumero, resultado;
    // Entrada de Dados
    primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:")); 
    segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
    // Processamento
    resultado = primeiroNumero + segundoNumero;
    // Saída de Dados
    JOptionPane.showMessageDialog(null, "O resultado da soma é: " + resultado);
  }
}
