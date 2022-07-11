package tsi.pp_factorymethod;

public class FactoryMulher implements FactoryPessoa {
    @Override
    public Pessoa getPessoa(String nome) {
        return new Mulher(nome);
    }
}
