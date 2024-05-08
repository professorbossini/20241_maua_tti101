public class VetorDinamico {
  int qtde;
  int cap;
  int [] elementos;

  //construtor
  //executa quando você fala new
  VetorDinamico(){
    qtde = 0;
    cap = 4;
    elementos = new int[cap];
  }

  void adicionar(int e){
    // elementos[qtde++] = e;
    if(estaCheio())
      redimensionar();
    elementos[qtde] = e;
    qtde++;
  }

  //escrever um método que responde se o vetor dinâmico está cheio ou não
  //ou seja, definir as quatro partes (tipo de retorno, nome, lista de parametros e corpo) e fazer implementação
  boolean estaCheio(){
    return qtde == cap;
  }

  boolean estaVazio(){
    return qtde == 0;  
  }
  //método toString
  //finalidade: produzir uma representação textual do objeto sobre o qual opera
  public String toString(){
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(qtde).append("\n");
    sb.append("Cap: ").append(cap).append("\n");
    if(!estaVazio()){
      sb.append("Itens:").append("\n");
      //for each/enhanced for
      // for(var e : elementos){
      //   sb.append(e).append(" ");
      // }
      for(var i = 0; i < qtde; ++i){
        sb.append(elementos[i]).append(" ");
      }
    }
    return sb.toString();
  }
  private void redimensionar(){
    //4. Dobrar o valor de cap
    cap *= 2;
    //1. Alocar um vetor com o dobro da capacidade
    var aux = new int[cap];
    //2. Copiar todo mundo do vetor elementos para o vetor auxiliar
    for(int i = 0; i < qtde; i++){
      aux[i] = elementos[i];
    }
    //3. Fazer com que elementos referencie o vetor referenciado por auxiliar
    elementos = aux;
    // System.gc(); //mark & sweep
    // cap = cap * 2;

  }
}
