public class VetorDinamico {
  private int [] elementos;
  private int quantidade;
  private int capacidade;

  //construtor
  //bloco de código que executa quando falamos new
  VetorDinamico(){
    quantidade = 0;
    capacidade = 4;
    elementos = new int[capacidade];
  }

  //escreva um método que responda se o vetor está cheio
  //ou seja, escreva as 4 partes (tipo de retorno, nome, lista de parâmetros e corpo)
  boolean estaCheio(){
    // return quantidade == capacidade ? "true" : false;
    return quantidade == capacidade;
  }

  void adicionar(int elemento){
    if(estaCheio())
      redimensionar();
    elementos[quantidade] = elemento;
    quantidade++;
  }

  private void redimensionar(){
    capacidade *= 2;// capacidade = capacidade * 2;
    var aux = new int[capacidade];
    for(int i = 0; i < quantidade; i++){
      aux[i] = elementos[i];
    }
    elementos = aux;
  }

  //escreva um método que responde se o vetor está vazio
  boolean estaVazio(){
    return quantidade == 0;
  }

  public String toString(){
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(quantidade).append("\n");
    sb.append("Cap: ").append(capacidade).append("\n");
    if(!estaVazio()){
      sb.append("Itens: ").append("\n");
      //for each/ enhanced for (Java 5+)
      for(int e : elementos){
        sb.append(e).append(" ");
      }
    }
    return sb.toString();
  }


}
