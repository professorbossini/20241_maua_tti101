public class LivroDeNotas {

  //variável de instância
  //instância é sinônimo de objeto
  String nomeDaDisciplina;

  //tipo de retorno, nome, lista de parâmetros e corpo
  //exibir mensagem de boas vindas
  void exibirMensagem(){
    System.out.printf(
      "Bem vindo ao livro de notas de %s\n",
      nomeDisciplina
    );
  }
}
