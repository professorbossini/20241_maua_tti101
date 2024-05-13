public class Calculadora{
  //sobrecarga de métodos (overload)
  //ou também, ainda que menos comum, polimorfismo estático (estático significa feito pelo compilador)
  public int somar (int a, int b){
    return a + b;
  }

  public double somar(int a, int b){
    return a + b;
  }

  // public int somar(int v1, int v2){
  //   return v1 + v2;
  // }

  public float somar(float a, float b){
    return a + b;
  }

  public double somar(double a, double b){
    return a + b;
  }

  public int somar(String a, String b){
    return Integer.parseInt(a) + Integer.parseInt(b);
  }

  //+
  //refazer sem usar o +
  public int somar(int a, String b){
    return somar(a, Integer.parseInt(b));
  }

  public int somar(String a, int b){
    return somar(b, a);
  }

  public int somar(int a, int b, int c){
    return somar(a, somar(b, c));
  }



}