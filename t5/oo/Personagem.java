public class Personagem {
  // int energia;
  // int fome;
  // int sono;
  //variáveis de instância (instância é sinônimo de objeto)
  String nome ;
  private int energia = 10, fome = 0, sono = 0;

  //setter
  void setEnergia(int e){
    if(energia >= 0 && energia <= 10)
      energia = e;
  }

  //getter
  int getEnergia(){
    return energia;
  }
  void cacar(){
    fome = Math.min(fome + 1, 10);
    sono = sono == 10 ? sono : sono + 1;
    if(energia >= 2){
      System.out.println(nome + " caçando");
      energia -= 2;// energia = energia - 2;
    }
    else{
      System.out.println(nome + " sem energia para caçar");
    }
  }

  void comer(){
    if(fome >= 1){
      System.out.printf(
        "%s comendo",
        nome
      );
      fome -= 1;
      switch(energia){ //lógica em queda (fall-through)
        default:
          energia++;
        case 10:
          break;
      }
    }
    else{
      System.out.printf("%s sem fome\n", nome);
    }
  }

  void dormir(){
    switch(sono){
      case 0:
        System.out.println(nome + " sem sono");
        break;
      default:
        System.out.println(nome + " dormindo");
        sono--;
        energia = Math.min(energia + 1, 10);
        break;
    }
  }

}
