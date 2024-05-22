public class AnimalOld{
  private String nome;
  private int tipo;
  public AnimalOld(String nome, int tipo){
    this.nome = nome;
    this.tipo = tipo;
  }
  //1: Gato
  //2: Cachorro
  //3: Pato
  public void fazerBarulho(){
    //estamos violando um princípio chamado princípio aberto/fechado
    if (tipo == 1)
      System.out.println("miau");
    else if (tipo == 2)
      System.out.println("au");
    else if (tipo == 3)
      System.out.println("quack");
  }
}