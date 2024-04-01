import javax.swing.JOptionPane;

public class LivroDeNotas {
  //em tempo de compilação
  // int a = "a";
  //em tempo de execução
  int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));

    //variável de instância
  //instância é sinônimo de objeto
  private String nomeDisciplina;
  //setter
  public void setNomeDisciplina(String nomeDisciplina){
    this.nomeDisciplina = nomeDisciplina;  
  }

  //getter
  public String getNomeDisciplina(){
    return this.nomeDisciplina;
  }

  //tipo de retorno, nome, lista de parâmetros e corpo
  //exibir mensagem de boas vindas
  void exibirMensagem(){
    System.out.printf(
      "Bem vindo ao livro de notas de %s\n",
      this.nomeDisciplina
    );
  }
}
