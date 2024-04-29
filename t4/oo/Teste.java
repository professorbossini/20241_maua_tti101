import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Teste {
  public static void main(String[] args) throws Exception{
    var pool = Executors.newCachedThreadPool();
    Future resultado = pool.submit(new Runnable(){
      @Override
      public void run() {
        System.out.println("oi");
        
      }
    });

    resultado.get();
  }
}
