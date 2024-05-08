public class TesteGenerics {
  public static void main(String[] args) {
    VetorDinamico <String> v1 = new VetorDinamico<>();
    v1.adicionar("Ana");
    //v1.adicionar(1);

    VetorDinamico <Integer> v2 = new VetorDinamico<>();
    v2.adicionar(1);
    //v2.adicionar("abc");
  }
}
