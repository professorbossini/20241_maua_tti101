//sobrecarga de construtores
public class Pessoa {
  private String nome = null;
  private int idade = 0;

  public Pessoa(String nome, int idade){
    this.nome = nome;
    if(idade >= 18)
      this.idade = idade;
  }

  public Pessoa(int idade, String nome){
    this(nome, idade);
  }

  public Pessoa(String nome){
    // this(nome, 0);
    this(0, nome);
    // this(nome, null);
  }


  public Pessoa(int idade){
    this(null, idade);
  }

  //construtor padrão
  // public Pessoa(){
  //   System.out.println("P");
  // }

}
