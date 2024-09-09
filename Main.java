/*
Diego Estevão Lopes de Queiroz - 10419038
Ricardo André Lopes Ikeda - 10390256
*/
public class Main {
  public static void main(String[] args) {
    GerenciadorNomes gNomes = new GerenciadorNomesMem();
    Ihm ihm = new Ihm(gNomes);
    ihm.dialogar();
  }
}
