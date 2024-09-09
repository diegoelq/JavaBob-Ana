/*
Diego Estevão Lopes de Queiroz - 10419038
Ricardo André Lopes Ikeda - 10390256
*/
import java.util.*;    
    public class GerenciadorNomesMem implements GerenciadorNomes {
        private List<String> nomes = new ArrayList<String>();
        @Override
        public List<String> obterNomes(){
            return nomes;
        }

        @Override
        public void adicionarNome(String nome){
            nomes.add(nome);
        }

}
