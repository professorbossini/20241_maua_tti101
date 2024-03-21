import java.util.Scanner;
public class Calculadora {
  public static void main(String[] args) {
    //números reais: float(4bytes) ou double(8bytes)
    var leitor = new Scanner(System.in);
    double valorDigitado;
    double soma = 0;//acumulador
    int quantidadeDigitados = 0; //acumulador e contador
    double media = 0;
    double maior = -1;
    double menor = -1;
    double mediaPares = 0; //acumulador condicional
    double porcentagemImpares = 0;//acumulador e contador
    //for, while e do/while
    do{
      System.out.println("Digite um valor");
      valorDigitado = leitor.nextDouble();
      if(valorDigitado != 30000){
        soma = valorDigitado + soma;// soma = soma + valorDigitado
        // quantidadeDigitados = quantidadeDigitados + 1;  
        // quantidadeDigitados += 1;
        quantidadeDigitados++;
        media += valorDigitado;
        // if(maior == -1)
        //   maior = valorDigitado;
        // else if(valorDigitado > maior)
        //   maior = valorDigitado;
        if(maior == -1 || valorDigitado > maior)
          maior = valorDigitado;
        //achar o menor. Porém, só vale fazer com o operador ternário
        menor = menor == -1 || valorDigitado < menor ? valorDigitado : menor;
        
        // if(valorDigitado % 2 == 0)
        //   mediaPares += valorDigitado;
        
        mediaPares = mediaPares + valorDigitado * (1 - valorDigitado % 2);

        //usando uma continha similar, some 1 à variável porcentagemImpares quando for o caso
        //não vale if, não vale ternário, não vale switch
        //não vale usar a media pares
        porcentagemImpares += valorDigitado % 2;
      }      
    }while(valorDigitado != 30000);
    System.out.println("Soma: " + soma);
    System.out.println("Quantidade digitados: " + quantidadeDigitados);
    System.out.println("Média: " + (media / quantidadeDigitados ));
    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média dos pares: " + (mediaPares / (quantidadeDigitados - porcentagemImpares)));
    System.out.println("Porcentagem de ímpares: " + (porcentagemImpares / quantidadeDigitados * 100) + "%");
    
  }
}

// for(int i = 1000; i <= 10; i++){

// }
// int j = 1000;
// while (j <= 10){

//   j++;
// }

// int k = 10000;
// do{

//   k++;
// }while (k <= 10);