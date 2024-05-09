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

          //construir um objeto música

          //atribuir o título a esse objeto usando o setter

          //adicionar a música à coleção de maneira condicional: somente deve ser possível adicionar caso a música ainda não exista (comparação por título). Definir equals na classe Música e usar contains da classe ArrayList.
          break;
        }
      }

    }while (op != 0);
  }
}
