//sobrecarga de métodos(overload)
//polimorfismo estático
public class Calculadora{

  public int somar(int n){
    // if (n > 0){
    //   //passo recursivo
    //   return n + somar(n - 1);
    // }
    // //caso base
    // return 0;
    if (n == 0)
      return 0;
      //recursão de calda
      //tail-call recursion
      //torres de hanoi
    return n + somar (n - 1);
  }

  public int somar(int a, int b){
    return a + b;
  }

  // public double somar(int a, int b){
  //   return a + b;
  // }

  // public int somar(int v1, int v2){
  //   return v1 + v2;
  // }

  public float somar(float a, float b){
    return a + b;
  }

  public int somar(int a, int b, int c){
    return a + b + c;
  }

  public int somar(String a, String b){
    //não pode usar + (e não pode subtrair negativo)
    return somar(Integer.parseInt(a), Integer.parseInt(b));
  }

  public int somar(String a, int b){
    //sem + e sem subtrair negativo
    return somar(Integer.parseInt(a), b);
  }

  public int somar(int a, String b){
    return somar(b, a);
  }
}