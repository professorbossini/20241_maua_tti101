import static javax.swing.JOptionPane.*;
import static java.lang.Long.parseLong;
public class ProgramaDeCalculos {
  public static void main(String[] args) {
    //byte(1byte), short(2bytes), int(4bytes), long(8bytes)
    long soma = 0;//acumulador
    long qtdeDigitados = 0;//contador e acumulador
    //float(4bytes)
    float media = 0;//acumulador
    long maior = -1;
    long menor = -1;
    float mediaPares = 0;
    float percentualImpares = 0;
    long valorDigitado;
    do{
      valorDigitado = parseLong(showInputDialog("Digite um valor"));
      if(valorDigitado != 30000){
        soma = soma + valorDigitado;
        qtdeDigitados++;// qtdeDigitados = qtdeDigitados + 1;
        media += valorDigitado;// media = media + valorDigitado;
        
        if (maior < 0)
          maior = valorDigitado;
        else if (valorDigitado > maior)
          maior = valorDigitado;
        
        if(menor < 0)
          menor = valorDigitado;
        else if (valorDigitado < menor)
          menor = valorDigitado;

        // if(valorDigitado % 2 == 0)
        //   mediaPares += valorDigitado;
        mediaPares = valorDigitado % 2 == 0 ? mediaPares + valorDigitado : mediaPares;

        if(valorDigitado % 2 == 1)
          percentualImpares++;
      }
    }while(valorDigitado != 30000);
    showMessageDialog(null, "Soma: " + soma);
    showMessageDialog(null, "Quantidade de valores digitados: " + qtdeDigitados);
    showMessageDialog(null, "Média: " + (media / qtdeDigitados));
    showMessageDialog(null, "Maior: " + maior);
    showMessageDialog(null, "Menor: " + menor);
    //media dos pares
    showMessageDialog(null, "Media pares: " + (mediaPares / (qtdeDigitados - percentualImpares)));
    
    showMessageDialog(null, "Percentual impares: " + (percentualImpares / qtdeDigitados));
  }  
}

// for (int i = 10000; i < 10; i++){

// }
// int j = 1000;
// while (j < 10){

//   j++;
// }
// int k = 1000;
// do{

//   k++;
// }while (k < 10);