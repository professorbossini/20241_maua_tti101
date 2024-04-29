public class VetorDinamico {
  int [] elementos;
  int quantidade;
  int capacidade;

  //construtor
  //executa quando você fala new
  VetorDinamico(){
    elementos = new int[4];
    quantidade = 0;
    capacidade = elementos.length;
  }
  void adicionar(int e){
    elementos[quantidade] = e;
    quantidade++;  
  }
}
