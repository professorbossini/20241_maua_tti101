//ProfessorPesquisador É-UM Pessoa
//ProfessorPesquisador É-UM Professor
public class ProfessorPesquisador extends Professor{
  public void pesquisar(){
    System.out.println(getNome() + " pesquisando...");
  }
}
