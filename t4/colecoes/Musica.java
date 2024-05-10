import java.util.*;

import javax.swing.JOptionPane;
public class Musica {
  private String titulo;
  private List <Integer> avaliacoes;


  //isso é um construtor, ele executa assim que a gente fala new
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
     * Música sem avaliações
     * 
     * Título: One
     * Avaliações: 5 5 4 5 3
     */
    //use StringBuilder para fazer isso em 2 minutos
    var sb = new StringBuilder("");
    sb.append("Título: ").append(titulo).append("\n");
    if(avaliacoes.isEmpty()){
      sb.append("Música sem avaliações");
    }
    else{
      sb.append("Avaliações: ");
      for(var avaliacao : avaliacoes){
        sb.append(avaliacao).append(" ");
      }
    }
    return sb.toString();
  }
}
