package tsi.factorymethod;

public class CreatorNike extends CreatorCamisaEsportiva {
    @Override
    public CamisaEsportiva criarCamisaEsportiva() {
        return new CamisaEsportiva("Brasil");
    }
}
