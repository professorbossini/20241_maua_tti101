public class Pessoa {
  private String nome;
  private int idade;

  public int m(int n){
    //caso base
    if (n == 0)
      return 0;
    //recursão de calda (tail call recursion)
    //passo recursivo
    return n + m(n - 1);
  }
  //torres de hanoi
  public Pessoa(String nome, int idade){
    this.nome = nome;
    if(idade >= 18)
      this.idade = idade;
  }

  public Pessoa(String nome){
    this(nome, 0);
  }

  // public Pessoa(){
  //   this();
  // }

  public Pessoa(int idade){
    this(null, idade);
  }
  
  //método construtor não existe

  // public Pessoa(){
  //   System.out.println("P");
  // }
}
