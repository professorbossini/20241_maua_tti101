//Professor passa no teste É-UM Pessoa
public class Professor extends Pessoa{
  int matricula;

  public void lecionar(){
    System.out.println( getNome() + " lecionando...");
  }
}
