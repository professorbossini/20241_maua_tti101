import java.util.Scanner;
public class CalculadoraDoisPontoZero {
  public static void main(String[] args) {
    //java 10+: operador de inferência de tipo
    var leitor = new Scanner(System.in);
    double valorDigitado;
    double soma = 0;//acumulador
    int quantidadeDigitados = 0;//acumulador e contador
    double media = 0;//acumulador
    double maior = -1;
    double menor = -1;
    double mediaPares = 0; //acumulador condicional
    double percentualImpares = 0;//acumulador e contador
    final double VALOR_SENTINELA = 30000;
    do{
      System.out.println("Digite um valor");
      valorDigitado = leitor.nextDouble();
      if(valorDigitado != VALOR_SENTINELA){
        soma = soma + valorDigitado;
        quantidadeDigitados++;
        media += valorDigitado;
        // if(maior == -1)
        //   maior = valorDigitado;
        // else if(valorDigitado > maior)
        //   maior = valorDigitado;
        if(maior == -1 || valorDigitado > maior) maior = valorDigitado;
        //resolver o menor em 20 segundos sem usar if
        // int idade = 18;
        // String podeDirigir = idade >= 18 ? "Sim" : "Não";
        menor = (menor == -1 || valorDigitado < menor ? valorDigitado : menor);
        // if(valorDigitado % 2 == 0)
        //   mediaPares += valorDigitado;
        mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);
        if (valorDigitado % 2 != 0)
          percentualImpares++;
        // percentualImpares += valorDigitado % 2;
        
      }
    }while(valorDigitado != VALOR_SENTINELA);
    //completar esse programa, ou seja:

    //Use printf em todos
    //1. Exibir a soma

    //2. Exibir quantidade de digitados

    //3. Exibir a média

    //4. Exibir maior

    //5. Exibir menor

    //6. Exibir média de pares (cuidado com a divisão por zero, não pode)

    //7. Exibir percentual de impares (tem que ser de 0 a 100%)

    //enviar a solução para rodrigo.moreira@maua.br
    //assunto: seu ra + solução continhas

  }
}

// for (int i = 100; i <= 10; ++i){

// }

// int j = 100;
// while(j <= 10){
  
//   j++;
// }
// int k = 100;
// do{

//   k++;
// }while(k <= 10);