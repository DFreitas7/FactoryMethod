package tsi.factorymethod;

public class CreatorPuma extends CreatorCamisaEsportiva {
    @Override
    public CamisaEsportiva criarCamisaEsportiva() {
        return new CamisaEsportiva("Botafogo");
    }
}
