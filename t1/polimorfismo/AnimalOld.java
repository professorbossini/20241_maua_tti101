public class AnimalOld{
  private String nome;
  private int tipo;
  public AnimalOld(String nome, int tipo){
    this.nome = nome;
    this.tipo = tipo;
  }
  //1: gato
  //2: cachorro
  //3: lagartixa
  public void fazerBarulho(){
    //viola o princípio chamado "princípio aberto/fechado"
    if(tipo == 1)
      System.out.println("miau");
    else if(tipo == 2)
      System.out.println("au");
    else if(tipo == 3)
      System.out.println("tss");
  }
}