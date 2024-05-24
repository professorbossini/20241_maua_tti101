public class Gato extends Animal{
  public Gato(String nome){
    super(nome);
  }
  //personalizar o funcionamento do método fazer
  //sobrescrever o método falar(override)
  public void falar(){
    System.out.println("miau");
  }

}
