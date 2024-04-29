public class Calculadora{
  //um método tem quatro partes
  //tipo de retorno, nome, lista de parâmetros e corpo
  int somar(int a, int b){
    //1. declarar duas variáveis a e b, valendo 2 e 3 respectivamente
    // int a = 2, b = 3;
    //2. declarar uma variável res e armazenar a + b
    int res = a + b;
    //3. exibir res
    // System.out.println(res);
    return res;
  }

  //12 segundos: fazer subtração de double
  double subtrair(double a, double b){
    return a - b;
  }

  double dividir(double divisor, double dividendo){
    return dividendo / divisor;
  }

}