import java.util.*;

import javax.swing.JOptionPane;
public class GerenciadorDePlaylist {
  public static void main(String[] args) {
    List <Musica> musicas = new ArrayList<>();
    var menu = "1-Cadastrar\n2-Avaliar\n3-Listar\n4-Remover\n5-Ver média de avaliações\n6-Zerar avaliações\n0-Sair";
    int op;
    do{
      op = Integer.parseInt(
        JOptionPane.showInputDialog(menu)
      );
      switch(op){
        case 1:{
          //capturar um titulo de musica junto ao usuario
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //construir um objeto do tipo Musica
          var musica = new Musica();
          //atribuir o titulo usando o metodo setter correspondente
          musica.setTitulo(titulo);
          //adicionar de maneira condicional:
          //se a musica ainda nao existir na colecao, adicione
          //contains de ArrayList
          //na classe Musica, sera necessario definir o metodo equals
          if(!musicas.contains(musica)){
            musicas.add(musica);
            JOptionPane.showMessageDialog(null, "Cadastro OK");
          }
          else{
            //caso contrário, informe o usuario que a musica ja existe
            JOptionPane.showMessageDialog(null, "Música já existe");
          }
          break;
        }
        case 2:{
          //pegar o titulo da musica a ser avaliada junto ao usuário
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //construir um objeto musica
          var musica = new Musica();
          //atribuir o titulo a ele com o setter correspondente
          musica.setTitulo(titulo);
          //usar um método de ArrayList que permite encontrar a posicao onde se encontra a musica atual
          var indice = musicas.indexOf(musica);
          //se ela existir, pedir ao usuario o novo valor de avaliacao e atribuir
          if(indice >= 0){ 
            //usar um do/while para garantir o intervalo [1,5]
            int avaliacao;
            do{
              avaliacao = Integer.parseInt(
                JOptionPane.showInputDialog("Avaliacao? Digite algo entre 1 e 5")
              );
            }while(avaliacao < 1 || avaliacao > 5);
            //musicas.get(indice).setAvaliacao(avaliacao);
            //da musica atual, pegar a coleção de avaliações e nela adicionar a nova avaliação
            musicas.get(indice).getAvaliacoes().add(avaliacao);
            JOptionPane.showMessageDialog(null, "Avaliação OK!");
          }
          //caso contrario, informar ao usuario que a musica que ele digitou nao existe
          else
            JOptionPane.showMessageDialog(null, "Jovem, não existe essa música!");
          break; 
        }
        case 3:{
          /*
           * Titulo: One, Avaliacao: 5
           * **************************
           * Titulo: Two, Avaliacao: 4
           * /
           */
          if(!musicas.isEmpty()){
            var sb = new StringBuilder("");
            //for each / enhanced for
            for (Musica m : musicas){
              sb
              .append(m)
              .append("\n")
              .append("*******************")
              .append("\n");  
            }
            JOptionPane.showMessageDialog(null, sb);
          }
          else{
            JOptionPane.showMessageDialog(null, "Não há músicas");
          }
          break;
        }
        case 4: {
          //pegar o titulo junto ao usuario

          //construir uma musica

          //atribuir o titulo

          //se existir, remover

          //se não, dizer que não existe
          break;
        }
        case 5:{
          //pegar o titulo da musica
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //construir um objeto Musica
          var musica = new Musica();
          //atribuir com o setter correspondente
          musica.setTitulo(titulo);
          //se a musica existir, calcular a media de suas avaliacoes
          var indice = musicas.indexOf(musica);
          //caso contrario, dizer que nao existe
          if(indice >= 0){
            var avaliacoes = musicas.get(indice).getAvaliacoes();
            if(!avaliacoes.isEmpty()){
              var media = 0.0;
              for (int avaliacao : avaliacoes){
                media += avaliacao;
              }
              media /= avaliacoes.size();
              JOptionPane.showMessageDialog(null, "Média: " + media);
            }
            else{
              JOptionPane.showMessageDialog(null, "Música não tem avaliações");
            }
          }
          else{
            JOptionPane.showMessageDialog(null, "Música não existe");
          }
          break;
        }
        case 6:{

          break;
        }
        //case 0
        case 0:{
          JOptionPane.showMessageDialog(null, "Até mais, jovem");
          break;
        }
        //trate as opções inválidas
        default:{
          JOptionPane.showMessageDialog(null, String.format(
            "A opção %d é inválida", op
          ));
          break;
        }

      }
    }while(op != 0);
  }
}
