import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showMessageDialog;
public class CalculaMedia{
  public static void main(String[] args) {
    double nota1, nota2, media;
    double mediaTurma = 0; // p + 0 = p p * 1 = p
    // mediaTurma = 3;
    // mediaTurma = mediaTurma + 10;
    // mediaTurma = mediaTurma + 8;
    //repetição controlada por contador
    //3 partes:
    //1. declaração/inicialização
    //2. teste de continuidade
    //3. atualização/incremento
    int contador = 1;
    while(contador <= 3){
      nota1 = parseDouble(showInputDialog("Digite a nota 1"));
      nota2 = parseDouble(showInputDialog("Digite a nota2"));
      media = (nota1 + nota2) / 2;
      showMessageDialog(null, media);
      showMessageDialog(
        null,
        media >= 6 ? "Aprovado" : "Prova Sub" 
      );
      mediaTurma = mediaTurma + media;
      contador = contador + 1;
    }
    
  }
}
