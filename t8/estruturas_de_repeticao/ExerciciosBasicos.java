public class ExerciciosBasicos{
  public static void main(String[] args) {
    int a = 2;
    System.out.println(a++);
    
    System.out.println(++a);

    //repetição controlada por contador
    //3 partes
    //declaração/inicialização
    // int contador = 1;
    // //teste de continuidade
    // while(contador <= 3){
    //   System.out.println(contador);
    //   //atualização/incremento
    //   contador = contador + 1;
    // }
    // System.out.println("Começando...");
    for(int contador = 4; contador <= 3; ++contador ){
      System.out.println(contador);
    }
    // int a = 2;
    // a = a + 1;
    // a += 1;
    // a++;
    // ++a;
    // int contador = 4;
    // while(contador <= 3){
    //   System.out.println(contador++);
    // }

    // int contador = 4;
    // do{
    //   System.out.println(contador);
    //   contador++;
    // }while(contador <= 3);
    
  }
}