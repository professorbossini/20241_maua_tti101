public class TesteLivroDeNotasV2 {
  public static void main(String[] args) {
    //construir um livro de notas
    var meuLivro = new LivroDeNotas();
    //atribuir o nome de sua disciplina favorita à sua propriedade nomeDisciplina (use o operador de acesso a membro)
    meuLivro.nomeDisciplina = "POO";
    //exibir a mensagem chamando o método exibirMensagem
    meuLivro.exibirMensagem();

    var meuLivro2 = new LivroDeNotas();
    meuLivro2.nomeDisciplina = "Lógica";
    meuLivro2.exibirMensagem();
  }
}
