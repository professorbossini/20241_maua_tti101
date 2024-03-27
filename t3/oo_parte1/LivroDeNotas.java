public class LivroDeNotas {

  //variável de instância
  private String nomeDaDisciplina;

  //setter (modificador)
  public void setNomeDisciplina(String nomeDaDisciplina){
    if(nomeDaDisciplina.length() >= 3)
      this.nomeDaDisciplina = nomeDaDisciplina;
  }

  public String getNomeDaDisciplina(){
    return this.nomeDaDisciplina;
  }

  //método de instância
  //tem que exibir Bem vindo ao livro de notas de POO, usando printf
  void exibirMensagem(){
    System.out.printf(
      "Bem vindo ao livro de notas de %s\n", 
      nomeDaDisciplina
    );    
  }
}
