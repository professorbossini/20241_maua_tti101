//método main
//classe
import javax.swing.JOptionPane;
public class SomaDoisNumeros{
  //indentação(indent)
  static public void main(String [] args){
    //declaração de variáveis(reserva de espaço na memória)
    int primeiroValor; //primeiro_valor
    int segundoValor;
    int soma;
    //entrada
    //Integer: utilitários para manipulação de ints (por exemplo, conversão)
    primeiroValor = 
      Integer.parseInt(
        JOptionPane.showInputDialog("Digite o primeiro valor")
      );
    segundoValor = 
      Integer.parseInt(
        JOptionPane.showInputDialog("Digite o segundo valor")
      );
    //processamento
    soma = primeiroValor + segundoValor;
    //saida
    //2 + 3 = 5
    //JOptionPane.showMessageDialog(null, soma);
    // JOptionPane.showMessageDialog(
    //   null,
    //   primeiroValor + " + " + segundoValor + " = " + soma
    // );
    //Resultado: 2
    JOptionPane.showMessageDialog(
      null,
      String.format(
        "%d + %d = %d",
        primeiroValor, segundoValor, soma
      )
    );
  }
}