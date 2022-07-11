package tsi.pp_factorymethod;

public class App {
    public static void main(String[] args) {
        FactoryPessoa factory = new FactoryHomem();
        
        String nome = "Jose";
        
        factory.getPessoa(nome);
        
        factory = new FactoryMulher();
        nome = "Maria";
        
        factory.getPessoa(nome);
    }
}
