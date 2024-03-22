import java.util.Scanner;
public class DiversasContinhas {
  public static void main(String[] args) {
    var leitor = new Scanner(System.in);
    final double VALOR_SENTINELA = 30000;
    double valorDigitado;
    double soma = 0;//acumulador
    double quantidadeDigitados = 0;//acumulador e contador
    double media = 0;//acumulador
    double maior = 0;
    double menor = 0;
    double mediaPares = 0;//acumulador condicional
    double percentualImpares = 0;//acumulador e contador
    do{
      System.out.println("Digite um valor");
      valorDigitado = leitor.nextDouble();
      //soma e quantidadeDeDigitados
      if(valorDigitado != VALOR_SENTINELA){
        soma += valorDigitado; //soma = soma + valorDigitado
        ++quantidadeDigitados; //quantidadeDigitados += 1;
        media = media + valorDigitado;
        // if(maior == 0)
        //   maior = valorDigitado;
        // else if(valorDigitado > maior)
        //   maior = valorDigitado;
        if(maior == 0 || valorDigitado > maior)
          maior = valorDigitado;
        //resolver o menor sem usar if/else nem switch
        // int idade = 18;
        // String podeDirigir = (idade >= 18 ? "Sim" : "Não");
        menor = menor == 0 || valorDigitado < menor ? valorDigitado : menor;
        // if(valorDigitado % 2 == 0)
        //   mediaPares += valorDigitado;
        mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);
        //if(valorDigitado % 2 == 1) percentualImpares++;
        percentualImpares += (valorDigitado % 2);
      }
    }while(!(valorDigitado == VALOR_SENTINELA));
    System.out.println("Soma: " + soma);
    System.out.printf("Quantidade: %.0f\n", quantidadeDigitados);
    System.out.printf("Média: %.2f\n", media / quantidadeDigitados);
    System.out.printf("Maior: %.0f\n", maior);
    System.out.printf("Menor: %.0f\n", menor);
    double totalPares = quantidadeDigitados - percentualImpares;
    System.out.printf(
      "Média pares: %.2f\n", 
      totalPares == 0 ? 0 :  mediaPares / totalPares 
    );
    System.out.printf(
      "%.2f%%\n", 
      percentualImpares / quantidadeDigitados * 100
    );

    
    leitor.close();
  }
}

// for(int i = 100; i <= 10; i++){

// }

// int j = 100;
// while (j <= 10){

//   j++;
// }

// int k = 100;
// do{

//   k++;
// }while(k <= 10);