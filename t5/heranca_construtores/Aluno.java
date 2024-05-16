public class Aluno extends Pessoa{
  private int ra;
  public Aluno(String nome, int idade, int ra){
    super(nome, idade);
    this.ra = ra;
  }

  //escreva o método toString de modo que, além de exibir nome e idade, exiba-se também o ra
  //descubra como acessar o toString da SUPER classe

  @Override
  public String toString(){
    return String.format("%s, %d", super.toString(), ra);
  }
  
}
