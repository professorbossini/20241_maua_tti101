import javax.swing.JOptionPane;
import java.util.Random;
public class Vetores3 {
  public static void main(String[] args) {
    var notas = new double[4];
    var gerador = new Random();
    //preencher um vetor
    // notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Primeira nota"));
    // notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Segunda nota"));
    // notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Terceira nota"));
    for(int i = 0; i < notas.length; i++){
      notas[i] = gerador.nextDouble() * 10;
    }
    //exibir os elementos de um vetor
    for(int i = 0; i < notas.length; i++){
      System.out.println(notas[i]);
      JOptionPane.showMessageDialog(null, String.format(
        "%.2f", notas[i]
      ));
    }
    //encontrar a menor nota
    var menor = notas[0];
    for(int i = 1; i < notas.length; i++){
      if(notas[i] < menor)
        menor = notas[i];
    }
    System.out.println("Menor: " + menor);

    //encontrar a maior nota
    var maior = notas[notas.length - 1];
    for (int i = notas.length - 2; i >= 0; i--){
      maior = notas[i] > maior ? notas[i] : maior;
    }

    //calcular a média
    var media = 0.0d;
    for(int i = 0; i < notas.length; i++){
      media = media + notas[i];
    }
    media /= notas.length; //media = media / notas.length;
    System.out.println(media);

  }
}
