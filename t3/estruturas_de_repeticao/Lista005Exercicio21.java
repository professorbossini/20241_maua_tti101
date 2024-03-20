import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;
public class Lista005Exercicio21 {
  public static void main(String[] args) {
    double soma = 0; //acumulador
    long quantidadeDigitados = 0; //acumulador, também contador
    double media = 0;//acumulador
    double maior = -1;
    double menor = -1;
    double mediaPares = 0;
    double percentualImpares = 0;
    double valorDigitado;
    do{
      valorDigitado = parseDouble(
        showInputDialog("Digite o valor")
      );
      if(valorDigitado != 30000){
        soma += valorDigitado;//soma = soma + valorDigitado;
        ++quantidadeDigitados;
        media = media + valorDigitado;

      }

    }while(valorDigitado != 30000);
  }
}

// for(int i = 10000; i <= 10; i++){

// }
// int j = 10000;
// while(j <= 10){

//   j++;
// }

// int k = 10000;
// do{

//   k++;
// }while(k <= 10);