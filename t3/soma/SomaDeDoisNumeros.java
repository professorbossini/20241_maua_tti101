import javax.swing.JOptionPane;
public class SomaDeDoisNumeros{
  public static void main(String args []){
    //declaração de variável
    double primeiroValor;
    double segundoValor;
    double resultado;
    //entrada
    //classe utilitária chamada Double (empacotadora (wrapper))
    boolean digitouValido = false;
    do{
      try{
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        digitouValido = true;
      }
      catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro");
      }      
    }while(!digitouValido);
    
    segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
    //processamento
    resultado = primeiroValor + segundoValor;
    //saida
    //JOptionPane.showMessageDialog(null, resultado);
    //2 + 3 = 5
    //pesquisar sobre String.format 
  }
}