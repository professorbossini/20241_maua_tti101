//generics (Java 5+) polimorfismo paramétrico
public class VetorDinamico <Tipo>{
  private Tipo [] elementos;
  private int qtde;
  private int cap;
  //executa quando vc fala new (construtor)
  public VetorDinamico(){
    qtde = 0;
    cap = 4;
    elementos = (Tipo[]) new Object[cap];
  }
  //use adequadamente os métodos estaCheio e redimensionar

  public void adicionar(Tipo e){
    if(estaCheio())
      redimensionar();
    elementos[qtde] = e;
    qtde++;
  }

  //escrever um método que decide se o vetor está vazio
  public boolean estaVazio(){
    return qtde == 0;
  }

  //escrever um método que decide se o vetor está cheio
  public boolean estaCheio(){
    return qtde == cap;
  }

  private void redimensionar(){
    //1. dobrar a capacidade
    cap *= 2;
    //2. alocar um vetor de ints chamado aux com essa nova capacidade
    var aux = (Tipo[]) new Object[cap];
    //3. fazer um for para copiar todo mundo de elementos para aux
    for(int i = 0; i <qtde; i++){
      aux[i] = elementos[i];
    }
    //4. ajustar elementos para que ele aponte para o vetor apontado por aux
    elementos = aux;
  }

  public String toString(){
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(qtde).append("\n");
    sb.append("Cap: ").append(cap).append("\n");
    if(!estaVazio()){
      sb.append("Itens: ");
      //for each / enhanced (Java 5+)
      for (Tipo e : elementos){
        sb.append(e).append(" ");
      }
    }
    return sb.toString();
  }
}
