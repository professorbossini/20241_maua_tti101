
//inspecione a classe VetorDinamico
//descubra onde e como chamar o método redimensionar, corrigindo o problema
public class VetorDinamico {
  private int [] elementos;
  private int qtde;
  private int cap;

  //construtor
  VetorDinamico(){
    qtde = 0;
    cap = 4;
    elementos = new int[cap];
  }

  void adicionar(int e){
    if(estaCheio())
      redimensionar();
    elementos[qtde] = e;
    qtde++;
  }

  private void redimensionar(){
    //1. Dobrar o valor de cap
    cap = cap * 2;
    //2. Alocar um vetor de int aux com tamanho igual à nova cap
    var aux = new int[cap];
    //3. Fazer um for, copiando todo mundo de elementos para aux
    for(int i = 0; i < qtde; i++){
      aux[i] = elementos[i];
    }
    //4. Fazer com que elementos referencie o vetor referenciado por aux
    elementos = aux;
  }

  //todos os métodos têm quatro partes: tipo de retorno, nome, lista de parâmetros e corpo
  //esse método deve responder se o vetor elementos está cheio ou não
  public boolean estaCheio(){
    return qtde == cap;
  }
  
  //faça outro que responde se o vetor está vazio
  public boolean estaVazio(){
    return qtde == 0;
  }

  public String toString(){
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(qtde).append("\n");
    sb.append("Cap: ").append(cap).append("\n");
    sb.append("Itens:");
    //enhanced for / for each
    // for (int e : elementos){
    //   sb.append(e).append(" ");
    // }
    for(int i = 0; i < qtde; i++){
      sb.append(elementos[i]).append(" ");
    }
    return sb.toString();
  }

}
