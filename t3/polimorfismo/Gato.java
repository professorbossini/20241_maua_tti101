public class Gato extends Animal{

  public Gato(String nome){
    super(nome);
  }

  //sobrescrita
  //vamos sobrescrever o método fazerBarulho (override)
  //personalizar o funcionamento desse método
  public void fazerBarulho(){
    System.out.println("miau");
  }
  
}
