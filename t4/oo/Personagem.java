public class Personagem {
  Personagem(String nome){
    this.nome = nome;
  }
  //variável de instância(instância é sinônimo de objeto)
  String nome;
  int energia = 10, fome = 0, sono = 0;
  //4 partes: tipo de retorno, nome, lista de parâmetros, corpo
  void cacar(){
    if(energia >= 2){
      System.out.println(nome + " caçando");
      energia = energia - 2;
    }
    else{
      System.out.println(nome + " sem energia para caçar");
    }
    fome = Math.min(fome + 1, 10);
    sono = sono == 10 ? sono : sono + 1;
  }

  void comer(){
    if(fome >= 1){
      System.out.printf("%s comendo", nome);
      --fome;
      switch(energia){ //lógica em queda (fall-through)
        case 10:
          break;
        default:
          energia++;
      }
    }
    else{
      System.out.println(nome + " sem fome");
    }
  }

  void dormir(){
    switch(sono){
      default:
        System.out.println(nome + " dormindo");
        sono--;
        switch(energia){
          case 10:
            break;
          default:
            energia++;
        }
        break;
      case 0:
        System.out.println(nome + " sem sono");

    }
  }

}

