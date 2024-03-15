public class ExercicioBasico {
  public static void main(String[] args) {
    //exibir os valores de 10 a 1, nesta ordem, usando for
    for(int i = 10; i >= 1; i--){
      System.out.println(i);
    }
    //exibir os naturais pares de 1 a 100 usando while (não vale usar if)
    // int cont = 1;
    // while (cont <= 100){
    //   if(cont % 2 == 0)
    //     System.out.println(cont);
    //   cont++;
    // }
    // int cont = 2;
    // while (cont <= 100){
    //   System.out.println(cont);
    //   cont += 2;
    // }

    // int cont = 1;
    // while (cont <= 100){
    //   System.out.println(cont % 2 == 0 ? cont : "");
    //   cont++;
    // }

    int cont = 1;
    while(cont <= 100){
      switch(cont % 2){
        case 0:
          System.out.println(cont);
          break;
      }
      cont++;
    }
  }
}
