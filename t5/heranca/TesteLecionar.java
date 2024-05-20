public class TesteLecionar {
  public static void main(String[] args) {
    ProfessorHorista p1 = new ProfessorHorista();
    p1.setNome("Ana");
    p1.lecionar();
    
    ProfessorPesquisador p2 = new ProfessorPesquisador();
    p2.setNome("Pedro");
    p2.lecionar();
  }
}
