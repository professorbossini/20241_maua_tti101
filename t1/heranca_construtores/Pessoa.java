public class Pessoa{
  private String nome;
  private int idade;
  //a expressão método construtor não existe
  //construtor padrão
  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    System.out.println("P");
  }

  // public Pessoa(){}
}