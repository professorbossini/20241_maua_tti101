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

    menor = -1;
    //7
    menor = 7;
    //8
    //5


    do{
      System.out.println("Digite um valor");
      valorDigitado = leitor.nextDouble();
      if(valorDigitado != 30000){
        soma = soma + valorDigitado;
        quantidadeDigitados += 1; // quantidadeDigitados = quantidadeDigitados + 1
        media = media + valorDigitado;
        // if (maior < 0)
        //   maior = valorDigitado;
        // else if (valorDigitado > maior)
        //   maior = valorDigitado;
        if(maior < 0 || valorDigitado > maior) maior = valorDigitado;
        //usando o operador ternário, encontre o menor, em 15 segundos
        menor = menor == -1 || valorDigitado < menor ? valorDigitado : menor;
        // mediaPares = valorDigitado % 2 == 0 ? mediaPares + valorDigitado  : mediaPares;
        mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);
        //percentualImpares = percentualImpares + valorDigitado % 2;
        percentualImpares += valorDigitado % 2; 
      }
    }while(valorDigitado != 30000);
    System.out.println("Soma: " + soma);
    System.out.println("Qtde digitados: " + quantidadeDigitados);
    System.out.println("Media: " + (media / quantidadeDigitados));
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Media pares: " + (mediaPares /(quantidadeDigitados - percentualImpares)));
    System.out.println("Percentual impares: " + (percentualImpares / quantidadeDigitados * 100) + "%");
    leitor.close();
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