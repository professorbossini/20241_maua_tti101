public class Pessoa {
  int idade = 0;
  String nome = null;

  public void m(){
    System.out.println("E agora?");
    int a;
    m();
  }

  public void misterio(int n){
   misterio(n);
  }

  // public Pessoa(int idade, String nome){
  //   this(nome, idade);
  //   // this.idade = idade;
  //   // this.nome = nome;
  //   //um construtor não pode chamar mais de um
  //   // this(nome);
  //   // this(idade);
  // }

  // // quero construir passando nome e depois idade
  // // detalhe: Não pode usar o operador de atribuição (=)
  // public Pessoa(String nome, int idade) {
  //   this(idade);
  //   this.nome = nome;
  // }

  // public Pessoa(int idade){
  //   this(idade, null);
  //   // this.idade = idade;
  // }

  // public Pessoa(String nome){
  //   this(nome, 0);
  //   // this.nome = nome;
  // }

  // public Pessoa(int a, String b){

  // }

  

  //Spring MVC/Boot
  public Pessoa(){

  }
  
  //construtor padrão
  //NÃO EXISTE A EXPRESSÃO MÉTODO CONSTRUTOR
  // public Pessoa(){
  //   System.out.println("Construindo mais uma pessoa...");
  // }

}
