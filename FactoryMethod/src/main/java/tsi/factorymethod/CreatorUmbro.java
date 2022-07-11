package tsi.factorymethod;

public class CreatorUmbro extends CreatorCamisaEsportiva {
    @Override
    public CamisaEsportiva criarCamisaEsportiva() {
        return new CamisaEsportiva("Fluminense");
    }
}
