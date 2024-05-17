public class Aluno extends Pessoa{
  private int ra;
  public Aluno(String nome, int idade, int ra){
    super(nome, idade);
    this.ra = ra;
  }

  //escrever o método toString
  //use o método String.format
  //para as partes nome e idade, use o toString já definido na superclasse

  public String toString(){
    return String.format(
      "%s, ra: %d",
      super.toString(),
      ra
    );
  }
}
