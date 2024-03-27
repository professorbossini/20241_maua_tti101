public class Calculadora{
  //tipo de retorno, nome, lista de parâmetros e corpo
  //há métodos que produzem um valor
  //há métodos que causam um efeito colateral(void)
  int somar(int a, int b){
    int resultado = a + b;
    //System.out.println(resultado);
    return resultado;
  }
  //escrever o método subtrair
  int subtrair(int a, int b){
    int resultado = a - b;
    return resultado;
  }
  int multiplicar(int a, int b){
    return a * b;
  }


  
}