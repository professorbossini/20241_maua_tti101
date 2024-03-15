public class ExibeNaturais {
  public static void main(String[] args) {
    final int LIMITE_MAXIMO = 3;
    //for
    
    for (int cont = 1;cont <= 3; ++cont){
      System.out.println(cont);
      // cont = cont + 1;
      // cont += 1;
      // cont++;
     ++cont;
    }
    // System.out.println(cont);
    //while
    // int cont = 1;
    // //não faça isso
    // while (cont++ <= LIMITE_MAXIMO){
    //   System.out.println(cont);
    // }

    //do while
    int cont = 1;
    do{
      // System.out.println(cont);
      // cont++;
      System.out.println(cont++);
    }while (cont <= LIMITE_MAXIMO);

    //fazer contagem regressiva de 10 a 1 com for
    for(int i = 10; i >= 1; i--){
      System.out.println(i);
    }
    //exibir apenas pares de 2 a 10 com while (sem usar if)
    // int pares = 1;
    // while (pares <= 10){
    //   if(pares % 2 == 0)
    //     System.out.println(pares);
    //   pares++;
    // }
    int pares = 2;
    while(pares <= 10){
      System.out.println(pares);
      pares += 2;
    }
  }
}
