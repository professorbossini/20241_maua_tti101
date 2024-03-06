import javax.swing.JOptionPane;
public class IfESuasVariacoes{
  public static void main(String[] args) {
    //declaração de variáveis
    final double NOTA_MAXIMA = 10;
    final double NOTA_MINIMA = 0;
    double  notaFinal;
    //entrada
     notaFinal = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota final"));
    //processamento
    //saída
    //&&, || !
    // if(notaFinal >= 6){
    //   JOptionPane.showMessageDialog(null, "Aprovado");
    //   JOptionPane.showMessageDialog(null, "Parabéns");
    // }
    // else{ //dangling else
    //   JOptionPane.showMessageDialog(null, "De recuperação");
    // }
    // JOptionPane.showMessageDialog(null, "Até logo");
    //encadeado
    if(notaFinal >= 0 && notaFinal <= 10)
      if(notaFinal >= 9) //NO-OP
        JOptionPane.showMessageDialog(
          null, 
          "A", 
          "Nota do aluno", 
          JOptionPane.INFORMATION_MESSAGE
        );
      else if(notaFinal >= 8)
        JOptionPane.showMessageDialog(null, "B");
      else if(notaFinal >= 6){
        JOptionPane.showMessageDialog(null, "C");
        JOptionPane.showMessageDialog(null, "R");
      }
    else
      JOptionPane.showMessageDialog(null, "Nota inválida");
    JOptionPane.showMessageDialog(null, "Até logo");
  }
}