//sobrecarga de métodos (overload)
//polimorfismo estático
public class Calculadora{


  //isso se chama varargs
  //java 5+
  public int somar(int... valores){
    int r = 0;
    for (var v : valores){
      r += v;
    }
    return r;
  }

  // public int somar(int a, int b){
  //   return a + b;
  // }

  public double somar(int a, int b){
    return a + b;
  }

  public float somar(float a, float b){
    return a + b;
  }

  public int somar(String a, String b){
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

  public int somar(String a, int b){
    //resolver em 12 segundos sem usar o operador + (e também não vale subtrair negativo)
    return somar(a, Integer.toString(b));
  }

  public int somar(int a, String b){
    //resolver em 3 segundos
    return somar(b, a);
  }

  public int somar(int a, int b, int c){
    return somar(a, somar(b, c));
  }


}