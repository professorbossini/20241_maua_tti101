import java.util.*;

import javax.swing.JOptionPane;
public class GerenciadorDePlaylist {
  public static void main(String[] args) {
    List <Musica> musicas = new ArrayList<>();
    var menu = "0-Sair\n1-Cadastrar\n2-Avaliar\n3-Listar";
    int op;
    do{
      op = Integer.parseInt(
        JOptionPane.showInputDialog(menu)
      );
      switch(op){
        case 1:{
          //Pedir ao usuário que digite o título da música
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //construir um objeto música
          var musica = new Musica();
          //atribuir o título a esse objeto usando o setter
          musica.setTitulo(titulo);
          //adicionar a música à coleção de maneira condicional: somente deve ser possível adicionar caso a música ainda não exista (comparação por título). Definir equals na classe Música e usar contains da classe ArrayList.
          if(!musicas.contains(musica)){
            musicas.add(musica);
            JOptionPane.showMessageDialog(null, "Cadastro OK!");
          }
          else{
            JOptionPane.showMessageDialog(null, "Música já existe");
          }
          break;
        }
        case 2:{
          //pegar o titulo da musica junto ao usuário
          var titulo = JOptionPane.showInputDialog("Titulo?");
          //verificar se a musica existe, pegando o indice dela na colecao. Para tal, sera necessário construir um objeto musica e atribuir a ele o titulo digitado pelo usuario
          var musica = new Musica();
          musica.setTitulo(titulo);
          var indice = musicas.indexOf(musica);
          if (indice >= 0){
            //se ela existir, pegar a avaliacao (1 a 5) junto ao usuario e atribuir ao objeto musica que se encontra na posicao encontrada
            int avaliacao;
            do{
              avaliacao = Integer.parseInt(JOptionPane.showInputDialog("Avaliação? Digite algo entre 1 e 5"));
            }while(avaliacao < 1 || avaliacao > 5);
            musicas.get(indice).setAvaliacao(avaliacao);
            JOptionPane.showMessageDialog(null, "Avaliação OK");  
          }
          else{

          }


          //caso contrário, falar que a musica não existe
          break;
        }
      }

    }while (op != 0);
  }
}
