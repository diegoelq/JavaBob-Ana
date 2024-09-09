/*
Diego Estevão Lopes de Queiroz - 10419038
Ricardo André Lopes Ikeda - 10390256
*/
import java.util.*;

public interface GerenciadorNomes {
  int MAX_CARACTERES_NOMES = 20;

  List<String> obterNomes();

  void adicionarNome(String nome);
}
