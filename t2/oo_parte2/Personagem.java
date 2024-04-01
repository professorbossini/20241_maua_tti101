public class Personagem{
 //variáveis de instância(instância é sinônimo de objeto) 
  String nome; //variável de referência
  int energia = 10, fome = 0, sono = 0; //variáveis primitivas

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
    System.out.println("Dormindo");
  }

  public void teste(){

    String nome = "Ana";
    //mostrar o texto: Testando o nome Ana
    //por concatenação
    System.out.println("Testando o nome " + nome);
    //por substituição
    System.out.printf("Testando o nome %s", nome);

  }
}