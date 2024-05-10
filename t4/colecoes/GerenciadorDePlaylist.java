import java.util.*;

import javax.swing.JOptionPane;
public class GerenciadorDePlaylist {
  public static void main(String[] args) {
    // List <Musica> playlist = new ArrayList<>();
    var playlist = new ArrayList<Musica>();
    var menu = "1-Cadastrar\n2-Avaliar\n3-Listar\n4-Ver média de avaliações de uma música\n5-Apagar avaliações de uma música\n6-Apagar avaliações de todas as músicas\n0-Sair";
    int op;
    do{
      op = Integer.parseInt(JOptionPane.showInputDialog(menu));
      switch(op){
        case 1:{
          //pegar o titulo junto ao usuário
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //construir um objeto do tipo Musica
          var musica = new Musica();
          //atribuir o titulo à musica usando o setter correspondente
          musica.setTitulo(titulo);
          //usar os métodos contains e add de ArrayList e definir o método equals na classe Musica
          //se a musica ainda não existir adicionar e confirma para o usuário
          if(!playlist.contains(musica)){
            playlist.add(musica);
            JOptionPane.showMessageDialog(null, "Cadastro OK!");
          }
          //caso contrário, dizer que a musica ja esta cadastrada
          else{
            JOptionPane.showMessageDialog(null, "Música já existe!");
          }
          break;
        }
        case 2:{
          //pedir para o usuario digitar o titulo
          var titulo = JOptionPane.showInputDialog("Titulo");
          //construir um objeto do tipo Musica
          var musica = new Musica();
          //atribuir o titulo usando o setter correspondente
          musica.setTitulo(titulo);
          //se a musica existir, pedir ao usuario que digite a a avaliacao
          var indice = playlist.indexOf(musica);
          if(indice >= 0){
            int avaliacao;
            //se a avaliacao estiver entre 1 e 5, avaliar e confirmar
            //se a avaliacao estiver fora do intervalo, pedir outra ate que o usuario digite dentro do intervalo
            do{
              avaliacao = Integer.parseInt(
                JOptionPane.showInputDialog("Avaliação?(1 a 5)")
              );
            }while (avaliacao < 1 || avaliacao > 5);
            playlist.get(indice).getAvaliacoes().add(avaliacao);
            JOptionPane.showMessageDialog(null, "Avaliação OK!");
          }
          //se a musica nao existir, dizer que ela nao existe
          else{
            JOptionPane.showMessageDialog(null, "Música não está cadastrada");
          }
          break;
        }
        case 3:{
          /*
           * Titulo: One, Avaliação: 5
           * **************************
           * Titulo: Two, Avaliação: 4
           * **************************
           */
          if(!playlist.isEmpty()){
            var sb = new StringBuilder("");
            for (Musica m : playlist){ //for each / enhanced for for m in playlist:
              // sb.append(m.toString())  está certo mas não precisa
              sb
                .append(m)
                .append("\n")
                .append("*****************************")
                .append("\n");
            }
            // JOptionPane.showMessageDialog(null, sb.toString()); não precisa chamar toString
            JOptionPane.showMessageDialog(null, sb);
          }
          else
            JOptionPane.showMessageDialog(null, "Lista vazia");
          break;
        }
        case 4:{
          //usuario digita o titulo
          //voce constroi um objeto musica
          //atribui o titulo
          //se a musica existir
            //se a musica tiver avaliacoes
              //calcular e exibir a media
            //senao, dizer que nao tem avaliacoes
          //senao, dizer que a musica nao existe
          break;
        }
        case 5:{

          break;
        }
        case 6:{
          if(!playlist.isEmpty()){
            for (Musica m : playlist){
              m.getAvaliacoes().clear();
            }
            JOptionPane.showMessageDialog(null, "Todas as avaliações removidas!");
          }
          else{
            JOptionPane.showMessageDialog(null, "Playlist vazia");
          }
          break;
        }
        case 0:{
          JOptionPane.showMessageDialog(null, "Até logo");
          break;
        }
        default:{
          JOptionPane.showMessageDialog(
              null, 
              String.format("A opção %d é inválida", op)
          );
        }
      }

    }while(op != 0);
  }
}
