import java.util.Scanner;
public class CalculaMedias{
  public static void main(String[] args) {
    double nota1, nota2, media;
    var leitor = new Scanner(System.in);

    int numeroAlunos;

    do{
      System.out.println("Digite quantos alunos você tem");
      numeroAlunos = leitor.nextInt();
    }while(numeroAlunos <= 0);
        
    int contador = 1;
    while(contador <= numeroAlunos){
      System.out.println("Digite a nota 1");
      nota1 = leitor.nextDouble();
      System.out.println("Digite a nota 2");
      nota2 = leitor.nextDouble();
      media = (nota1 + nota2) / 2;
      System.out.printf("Média: %.2f\n", media);
      contador = contador + 1;
    }
  }
}
//repetição controlada por contador
//3 partes
//declaração/inicialização
//teste de continuidade
//atualização/incremento
// for(int contador = 0; contador < numeroAlunos; contador = contador + 1 ){
//   System.out.println("Digite a nota 1");
//   nota1 = leitor.nextDouble();
//   System.out.println("Digite a nota 2");
//   nota2 = leitor.nextDouble();
//   media = (nota1 + nota2) / 2;
//   System.out.printf("Média: %.2f\n", media);
// }    