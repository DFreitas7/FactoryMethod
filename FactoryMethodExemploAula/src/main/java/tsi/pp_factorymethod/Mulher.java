package tsi.pp_factorymethod;

public class Mulher extends Pessoa {
    public Mulher(String nome){
        this.nome = nome;
        System.out.println("Ola Senhora "+this.nome);
    }
}
