//generics (Java 5+)
public class VetorDinamico <Tipo>{
  private Tipo [] elementos;
  private int quantidade;
  private int capacidade;

  //construtor
  //executa quando você fala new
  VetorDinamico(){
    elementos = (Tipo[]) new Object[4];
    quantidade = 0;
    capacidade = elementos.length;
  }
  void adicionar(Tipo e){
    if(estaCheio())
      redimensionar();
    elementos[quantidade] = e;
    quantidade++;  
  }

  //escrever um método (com as 4 partes) que diz se o VetorDinamico está vazio
  boolean estaVazio(){
    return quantidade == 0;
  }

  //esse método verifica se o vetor está cheio
  boolean estaCheio(){
    return quantidade == capacidade;
  }

  private void redimensionar(){
    //1. dobrar a capacidade
    capacidade = capacidade * 2;
    //2. alocar um vetor de ints chamado aux com esse nova capacidade
    var aux = (Tipo[]) new Object[capacidade];
    //3. copiar todo mundo de elementos para aux
    for (int i = 0; i < quantidade; i++){
      aux[i] = elementos[i];
    }
    //4. fazer com que elementos referencie o mesmo vetor referenciado por aux
    elementos = aux;
  }

  public String toString(){
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(quantidade).append("\n");
    sb.append("Cap:").append(capacidade).append("\n");
    if(!estaVazio()){
      sb.append("Itens:").append("\n");
      //for each / enhanced for
      // for (int e : elementos){
      //   sb.append(e).append(" ");
      // }
      for(int i = 0; i < quantidade; i++){
        sb.append(elementos[i]).append(" ");
      }
    }
    return sb.toString();
  }

}
