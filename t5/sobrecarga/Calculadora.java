//sobrecarga de métodos(overload)
//polimorfismo estático
public class Calculadora{
  public int somar(int a, int b){
    return a + b;
  }

  // public float somar(int a, int b){
  //   return a + b;
  // }

  // public int somar(int v1, int v2){
  //   return v1 + v2;
  // }

  public int somar(int a, int b, int c){
    //não vale usar o operador +
    return somar(somar(a, b), c);
  }

  public float somar(float a, float b){
    return a + b;
  }

  public int somar(String a, String b){
    return somar(Integer.parseInt(a), Integer.parseInt(b));
  }

  public int somar(String a, int b){
    return somar(a, Integer.toString(b));
  }

  public int somar(int a, String b){
    return somar(b, a);
  }





}