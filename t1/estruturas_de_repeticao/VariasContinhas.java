import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.Scanner;
public class VariasContinhas {
  public static void main(String[] args) {
    var leitor = new Scanner(System.in);
    double valorDigitado;
    double soma = 0;//acumulador
    int quantidadeDigitados = 0;//acumulador e contador
    double media = 0;//acumulador
    double maior = -1;
    double menor = -1;
    double mediaPares = 0;//acumulador condicional
    double percentualImpares = 0;//acumulador e contador
    do{
      System.out.println("Digite um valor");
      valorDigitado = leitor.nextDouble();
      if(valorDigitado != 30000){
        soma = soma + valorDigitado;
      }
    }while(valorDigitado != 30000);
    
  }
}

// for(int i = 100; i <= 10; i++){

// }

// int j = 100;
// while(j <= 10){

//   j++;
// }

// int k = 100;
// do{

//   k++;
// }while(k <= 10);