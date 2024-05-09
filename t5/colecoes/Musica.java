import java.util.*;
public class Musica {
  private String titulo;
  private List <Integer> avaliacoes;

  //construtor
  //sempre executa quando falamos new
  Musica(){
    avaliacoes = new ArrayList<>();
  }

  public List<Integer> getAvaliacoes() {
    return avaliacoes;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public boolean equals(Object o){
    //downcasting
    Musica m = (Musica)o;
    return this.getTitulo().equals(m.getTitulo());
  }

  public String toString(){
    /*
     * Título: One
     * Avaliações:
     * 1 2 5 4 3 
     */
    var sb = new StringBuilder("");
    sb.append("Título: ").append(titulo).append("\n");
    //se tiver avaliações, mostrar o texto Avaliações: e mais ainda as avaliações (use um for each)
    if(avaliacoes.size() > 0){
      sb.append("Avaliações:").append("\n");
      for (var avaliacao : avaliacoes){
        sb.append(avaliacao).append(" ");
      }
    }
    //caso contrário, exibir "Música sem avaliações"
    else{
      sb.append("Música sem avaliações");
    }
    return sb.toString();
  }

  
}
