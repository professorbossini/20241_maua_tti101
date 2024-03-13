import javax.swing.JOptionPane;
import static java.lang.Integer.parseInt;

public class CalculoDeMedia{
  public static void main(String[] args) {
    //while
    int numeroAlunos = parseInt(
      JOptionPane.showInputDialog("Quantos alunos, prof?")
    );
    //1, 2, 3, ..., n -1, n
    //repetição controlada por contador
    //declaração/inicialização
    
    //teste de continuidade
    int contador = 1;
    while(contador <= numeroAlunos){
      double nota1 = Double.parseDouble(
        JOptionPane.showInputDialog("Prof, digite a nota 1")
      );
      double nota2 = Double.parseDouble(
        JOptionPane.showInputDialog("Prof, digite a nota 2")
      );
      //calcular a média
      double media = (nota1 + nota2) / 2;
      //exibir com showMessageDialog
      JOptionPane.showMessageDialog(
        null,
        "Média: " + media
      );
      contador = contador + 1;
    }
    // while(contador <= numeroAlunos){
    //   double nota1 = Double.parseDouble(
    //     JOptionPane.showInputDialog("Prof, digite a nota 1")
    //   );
    //   double nota2 = Double.parseDouble(
    //     JOptionPane.showInputDialog("Prof, digite a nota 2")
    //   );
    //   //calcular a média
    //   double media = (nota1 + nota2) / 2;
    //   //exibir com showMessageDialog
    //   JOptionPane.showMessageDialog(
    //     null,
    //     "Média: " + media
    //   );
    //   //atualização/incremento
    //   contador = contador + 1;
    // }

  }
}