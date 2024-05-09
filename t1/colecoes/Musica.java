public class Musica {
  private String titulo;
  private int avaliacao;

  public int getAvaliacao() {
    return avaliacao;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAvaliacao(int avaliacao) {
    this.avaliacao = avaliacao;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public boolean equals(Object o){
    //downcasting
    Musica m = (Musica)o;
    return this.titulo.equals(m.getTitulo());
  }
}
