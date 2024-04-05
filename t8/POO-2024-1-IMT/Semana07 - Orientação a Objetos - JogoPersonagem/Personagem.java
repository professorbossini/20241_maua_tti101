public class Personagem{
    private String nome;
    private int energia, fome, sono, experiencia;

    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome;
        this.experiencia = 0;
        // Se a variável energia está entre 0 e 10
        if(energia >= 0 && energia <= 10){ 
            this.energia = energia;
        }
        // Se a variável fome está entre 0 e 10
        if(fome >= 0 && fome <= 10){
            this.fome = fome;
        }
        // Se a variável sono está entre 0 e 10
        if(sono >= 0 && sono <= 10){
            this.sono = sono;
        }
    }

    public void cacar(){
        if(energia >= 2){
            System.out.println(nome + " está caçando.");
            energia -= 2; // energia = energia - 2
            experiencia++; // experiencia = experiencia + 1
        }else{ // energia < 2
            System.out.println(nome + " não possui " +
            " energia suficiente para caçar.");
        }
        fome = Math.min(fome+1,10);
        sono = Math.min(sono+1,10);
    }

    public void comer(){
        if(fome >= 1){
            System.out.println(nome + " está comendo.");
            energia = Math.min(energia+1,10);
            fome -= 1; // fome = fome - 1
        }else{ // fome < 1
            System.out.println(nome + " não está com fome.");
        }
    }

    public void dormir(){
        if(sono >= 1){
            System.out.println(nome + " está dormindo.");
            sono -= 1; // sono = sono - 1
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        }else{ // sono < 1
            System.out.println(nome + " não está com sono.");
        }
    }

    public int getEnergia() {
      return energia;
    }

    public void setEnergia(int energia) {
      if(energia >= 0 && energia <= 10)
        this.energia = energia;
    }

    public String toString(){
      return String.format(
        //"João: (e: 5, f: 10, s: 7)"
        "%s: (e: %d, f: %d, s: %d)",
        nome, energia, fome, sono
      );
    }

    // public void teste(){
    //   String nome = "Ana";
    //   //meu nome é Ana
    //   String r1 = "Meu nome é " + nome;
    //   String r2 = String.format("Meu nome é %s", nome);
    // }
}