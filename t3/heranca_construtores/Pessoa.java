public class Pessoa extends Object{
  private String nome;
  private int idade;
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    System.out.println("P");
  }

  public Pessoa(){
    super();
  }
}