public class Pessoa {
  //a expressão método construtor não existe
  int idade = 0;
  String nome;

  public void m(){
    System.out.println("E agora?");
    m();
  }

  public void misterio(int n){
    //esse if detecta o caso base da recursão
    if (n >= 0){
      System.out.println(n);
      //passo recursivo
      //recursão de calda
      misterio(n - 1);
    }
  }

  // public Pessoa(String nome, int idade){
  //   this(idade, nome);
  // }

  // public Pessoa(int idade, String nome) {
  //  this(nome);
  //  this.idade = idade;
  // }

  // public Pessoa(int idade){
  //   this(idade, null);
  // }

  // public Pessoa(String nome){
  //   this(0);
  //   this.nome = nome;
  // }

    //construtor padrão
  //é aquele que não tem parâmetro algum
  // public Pessoa(){
  //   System.out.println("Construindo uma nova pessoa..");
  // }
}
