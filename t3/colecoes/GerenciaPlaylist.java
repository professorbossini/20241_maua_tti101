import java.util.*;
import javax.swing.*;
public class GerenciaPlaylist {
  public static void main(String[] args) {
    List <Musica> musicas = new ArrayList<>();
    var menu = "0-Sair\n1-Cadastrar\n2-Avaliar\n3-Listar\n";
    int op;
    do{
      op = Integer.parseInt(
        JOptionPane.showInputDialog(menu)
      );
      switch(op){
        case 1:{
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //construir um objeto musica
          var musica = new Musica();
          //atribuir o titulo usando o setter apropriado
          musica.setTitulo(titulo);
          //adicionar à coleção
          musicas.add(musica);
          //exibir uma mensagem de confirmação
          JOptionPane.showMessageDialog(null, "Cadastro OK!");
          break;
        }
        case 2:{
          //pegar o titulo da musica a ser avaliada junto ao usuario
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //verificar se a musica existe na colecao
          var musica = new Musica();
          musica.setTitulo(titulo);
          var indice = musicas.indexOf(musica);
          //se existir, pegar a avaliacao (1 a 5) junto ao usuario
          if (indice >= 0){
            //atribuir a avaliação à musica escolhida por ele
            var avaliacao = Integer.parseInt(
              JOptionPane.showInputDialog("Avaliação?")
            );
            musicas.get(indice).setAvaliacao(avaliacao);
            //confirmar que a avaliacao foi realizada
            JOptionPane.showMessageDialog(null, "Avaliação OK!");
          }
          else{
            JOptionPane.showMessageDialog(null, "Música não encontrada");
          }
          break;
        }
        case 3:{
          //na classe musica, escrever o método toString. Ele devolve o titulo e a avaliação
          //OK, feito
          //iterar sobre a colecao de musicas usando for each e concatenar a representação textual de cada uma com um StringBuilder
          var sb = new StringBuilder("");
          for(var m : musicas){
            sb.append(m).append("\n");
          }
          //exibir a string resultante com JOP
          JOptionPane.showMessageDialog(null, sb);
          break;
        }
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
        case 0:
          JOptionPane.showMessageDialog(null, "Até logo");
      }
    }while (op != 0);
  }
}
