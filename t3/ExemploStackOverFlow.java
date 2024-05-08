public class ExemploStackOverFlow{

  public static void main(String[] args) {
    m();
  }
  public static void m(){
    int a = 2;
    System.out.println("Sou o m");
    m();
  }
}