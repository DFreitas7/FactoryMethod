package tsi.pp_factorymethod;

public class Homem extends Pessoa {
    public Homem(String nome){
        this.nome = nome;
        System.out.println("Ola Senhor "+this.nome);
    }
}
