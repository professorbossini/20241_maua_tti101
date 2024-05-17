public class Pessoa{
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    System.out.println("P");
    this.nome = nome;
    this.idade = idade;
  }

  //escrever o método toString, use o String.format
  public String toString(){
    return String.format(
      "Nome: %s, idade: %d",
      nome, idade
    );
  }
}