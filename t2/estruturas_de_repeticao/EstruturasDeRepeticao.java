import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
public class EstruturasDeRepeticao{
  public static void main(String[] args) {

    int numeroAlunos;
    do{
      numeroAlunos = parseInt(showInputDialog("Digite o numero de alunos (tem que ser positivo)"));
      if (numeroAlunos <= 0)
        showMessageDialog(null, "Jovem, tem que ser positivo");
    }while(numeroAlunos <= 0);   

    // double nota1, nota2, media;

    //while
    //repetição controlada por contador
    //for
    // int cont = 1;
    // for( ; ; ){
    //   nota1 = parseDouble(showInputDialog("Digite a nota 1"));
    //   nota2 = parseDouble(showInputDialog("Digite a nota 2"));
    //   media = (nota1 + nota2) / 2;
    //   showMessageDialog(null, "Média: " + media);
    //   if(media >= 6){
    //     showMessageDialog(null, "Aprovado!");
    //   }
    //   else{
    //     showMessageDialog(null, "Prova SUB");
    //   }
    //   cont++;
    // }
    // System.out.println(cont);
    // int cont = 1;
    // while(cont <= 3){
    //   //cont = cont + 1;
    //   // cont += 1;
    //   // cont++;
    //   //++cont;
    // }

  }
}