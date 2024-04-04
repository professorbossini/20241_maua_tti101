public class Personagem {

  String nome;
  private int energia = 10, fome = 0, sono = 0;

  //setter
  public void setEnergia(int e){
    if(e >= 0 && e <= 10)
      energia = e;
  }

  //getters
  public int getEnergia(){
    return energia;
  }

  //4 partes: tipo de retorno, nome, a lista de parâmetros e o corpo
  void cacar(){
    if(energia >= 2){
      System.out.printf("%s caçando\n", nome);
      energia -= 2;
    }
    else{
      System.out.printf("%s sem energia para caçar\n", nome);
    }
    fome = Math.min(fome + 1, 10);
    sono = sono == 10 ? sono : sono + 1;
  }

  void comer(){
    if(fome >= 1){
      System.out.println(nome + " comendo");
      --fome;
      if(energia < 10) energia++;
    }
    else{
      System.out.printf(
        "%s sem fome para comer\n",
        nome
      );
    }
  }

  void dormir(){
    if(sono >= 1){
      System.out.printf("%s dormindo\n", nome);
      sono = sono - 1;
      switch(energia){ //lógica em queda (fall-through)
        case 10:
          break;
        default:
          energia++;
      }
    }
    else{
      System.out.printf(
        "%s sem sono para dormir\n",
        nome
      );
    }
  }

  void atacar(int forca){
    System.out.printf(
      "Atacando com %d de força\n",
      forca 
    );
  }
}
