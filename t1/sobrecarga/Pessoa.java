public class Pessoa {
  private String nome;
  private int idade;


  public Pessoa(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
  }

  public Pessoa(String nome){
    this(nome, 0);
  }

  public Pessoa(int idade){
    this(null, idade);
  }

  public Pessoa(){}
  //construtor padrão (lista de parâmetros vazia)
  //não existe a expressão método construtor
  // public Pessoa(){
  //   System.out.println("P");
  // }
}
