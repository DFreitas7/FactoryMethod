package tsi.factorymethod;

public class CreatorKappa extends CreatorCamisaEsportiva {
    @Override
    public CamisaEsportiva criarCamisaEsportiva() {
        return new CamisaEsportiva("Vasco");
    }
}
