//classes abstratas não podem ser instanciadas
//não podemos falar new Animal("Fido") mais...
public abstract class Animal {
  private String nome;
  public Animal(String nome){
    this.nome = nome;
  }

  public abstract void falar();
}
