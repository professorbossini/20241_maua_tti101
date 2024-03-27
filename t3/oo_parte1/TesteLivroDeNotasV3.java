public class TesteLivroDeNotasV3 {
  public static void main(String[] args) {
    var livro = new LivroDeNotas();
    // livro.nomeDaDisciplina = "POO";
    livro.setNomeDisciplina("POO");
    livro.exibirMensagem();
    System.out.println("O nome da disciplina é " + livro.getNomeDaDisciplina());
  }
}
