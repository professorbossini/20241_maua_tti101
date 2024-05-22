public class AnimalOld{
  private String nome;
  //1: Gato
  //2: Cachorro
  //3: Pato
  private int tipo;
  public AnimalOld(String nome, int tipo){
    this.nome = nome;
    this.tipo = tipo;
  }
  public void fazerBarulho(){
    //esse código nos faz violar um princípio
    //chamado aberto/fechado
    if(tipo == 1)
      System.out.println("miau");
    else if (tipo == 2)
      System.out.println("au");
    else if (tipo == 3)
      System.out.println("quack");
  }
}