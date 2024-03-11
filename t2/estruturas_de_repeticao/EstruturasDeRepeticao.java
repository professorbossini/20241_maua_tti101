import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class EstruturasDeRepeticao{
  public static void main(String[] args) {
    double nota1, nota2, media;

    //while
    //repetição controlada por contador
    int cont = 1;
    while(cont <= 3){
      nota1 = parseDouble(showInputDialog("Digite a nota 1"));
      nota2 = parseDouble(showInputDialog("Digite a nota 2"));
      media = (nota1 + nota2) / 2;
      showMessageDialog(null, "Média: " + media);
      if(media >= 6){
        showMessageDialog(null, "Aprovado!");
      }
      else{
        showMessageDialog(null, "Prova SUB");
      }
      cont = cont + 1;
    }
    
  }
}