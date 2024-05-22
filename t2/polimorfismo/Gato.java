public class Gato extends Animal{
  public Gato(String nome){
    super(nome);
  }
  //sobrescrita de método
  //personalizar o funcionamento do método fazerBarulho
  public void fazerBarulho(){
    System.out.println("miau");
  }
}
