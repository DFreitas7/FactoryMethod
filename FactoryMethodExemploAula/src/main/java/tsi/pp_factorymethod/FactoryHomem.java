package tsi.pp_factorymethod;

public class FactoryHomem implements FactoryPessoa {
    @Override
    public Pessoa getPessoa(String nome) {
        return new Homem(nome);
    }
    
}
