public class Personagem{

 //variáveis de instância(instância é sinônimo de objeto) 
  String nome; //variável de referência
  // private int energia = 10;
  // private int fome = 0;
  // private int sono = 0; //variáveis primitivas

  private int energia = 10, fome = 0, sono = 0;

  //método: tipo de retorno, nome, lista de parâmetros e corpo
void cacar(){
    if(energia >= 2){
      System.out.println(nome + " caçando");
      energia -= 2;// energia = energia - 2;
    }
    else{
      System.out.println(nome + " sem energia para caçar");
    }
    fome = Math.min(fome + 1, 10);
    sono = sono == 10 ? sono : sono + 1;
  } 
  
  void comer(){
    if(fome > 0){
      System.out.printf("%s comendo\n", nome);
      fome--;
      switch(energia){
        //lógica em queda (fall-through)
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
    //use apenas if/else
    //somente pode dormir se tiver sono (sono >= 1)
    //depois de dormir, aumentar de 1 o nível de energia
    //diminuir de 1 o nível de sono.
    if(sono > 0){
      System.out.println(nome + " dormindo");
      if(energia < 10) 
        energia += 1;// energia = energia + 8;// energia++;
      --sono;
    }
    else
      System.out.println(nome + " sem sono");
  }

  public String toString(){
    return String.format(
      "Energia: %d, Fome: %d, Sono: %d",
      energia, fome, sono
    );
  }

}