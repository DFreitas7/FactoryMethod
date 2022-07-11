package tsi.factorymethod;

public class CreatorAdidas extends CreatorCamisaEsportiva {
    @Override
    public CamisaEsportiva criarCamisaEsportiva() {
        return new CamisaEsportiva("Flamengo");
    }
}
