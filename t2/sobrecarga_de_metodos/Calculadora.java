public class Calculadora{
  //sobrecarga de métodos
  //overload
  //polimorfismo estático
  //estático: feito pelo compilador
  public int somar(int a, int b){
    return a + b;
  }

  // public int somar(int v1, int v2){

  // }

  // public double somar(int a, int b){
  //   return a + b;
  // }

  public float somar(float a, float b){
    return a + b;
  }

  public int somar(String a, String b){
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

  public int somar(int a, String b){
    //não pode usar +
    return somar(a, Integer.parseInt(b));
  }

  //faça a linha 8 funcionar, usando o método da 18
  public int somar(String a, int b){
    return somar(b, a);
  }

  //faça a linha 9 funcionar usando o método da linha 14 (aquele que recebe apenas 2 strings)
  public int somar(String a, String b, String c){
    return somar(somar(a, b), c);
  }



}