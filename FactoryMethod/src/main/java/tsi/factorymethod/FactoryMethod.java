package tsi.factorymethod;

import java.util.Scanner;

public class FactoryMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Integer comando;
        
        do {
            CreatorCamisaEsportiva creator;

            System.out.println("Escolha um time:");
            System.out.println("1 - Brasil \t 2- Flamengo \t 3 - Botafogo \t 4 - Fluminente \t 5 - Vasco");
            comando = Integer.parseInt(scanner.nextLine());


            switch(comando) {
                case 1:
                    creator = new CreatorNike();
                    break;
                case 2:
                    creator = new CreatorAdidas();
                    break;
                case 3:
                    creator = new CreatorPuma();
                    break;
                case 4:
                    creator = new CreatorUmbro();
                    break;
                case 5:
                    creator = new CreatorKappa();
                    break;
                default:
                    System.out.println("Opção inválida");
                    continue;
            }

            CamisaEsportiva camisa = creator.criarCamisaEsportiva();

            System.out.println("Criando camisa do " + camisa.getNomeTime() + " no " + creator.getClass().getSimpleName());
        
        } while(comando != 0);
    }
}
