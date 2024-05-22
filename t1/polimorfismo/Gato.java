public class Gato extends Animal {

  public Gato(String nome){
    super(nome);
  }

  //sobrescrever o método fazerBarulho (override)
  //sobrepor
  //superpor
  //personalizar o funcionamento do método
  @Override
  public void fazerBarulho(){
    System.out.println("miau");
  }

  
}
