//sobrecarga de métodos(overload)
//polimorfismo estático (feito pelo compilador)
public class Calculadora{
  public int somar(int a, int b){
    return a + b;
  }

  public double somar(int a, int b){
    return a + b;
  }

  // public int somar(int v1, int v2){
  //   return v1 + v2;
  // }

  public int somar(int a, int b, int c){
    return a + b + c;
  }

  public float somar(float a, float b){
    return a + b;
  }

  public int somar(String a, String b){
    //resolva, numa linha só
    //sem usar o operador +
    //sem subtrair valor negativo
    //em 32 segundos
    return somar(
      Integer.parseInt(a), 
      Integer.parseInt(b)
    );
  }

  public int somar(String a, int b){
    return somar(
      Integer.parseInt(a),
      b
    );
  }

  public int somar(int a, String b){
    return somar(b, a);
  }


}