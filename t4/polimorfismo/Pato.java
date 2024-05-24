public class Pato extends Animal{
  public Pato(String nome){
    super(nome);
  }
  
  @Override//annotation Java 5+
  public void falar(){
    System.out.println("quack");
  }
}
