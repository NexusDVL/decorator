package Class;

import Interface.Café;

public class Main {
    public static void main(String[] args) {
        // Interface.Café simples
        Café meuCafé = new CaféSimples();
        System.out.println("Descrição: " + meuCafé.getDescription());
        System.out.println("Custo: $" + meuCafé.custo());

        // Interface.Café com leite
        Café caféComLeite = new LeiteDecorator(new CaféSimples());
        System.out.println("\nDescrição: " + caféComLeite.getDescription());
        System.out.println("Custo: $" + caféComLeite.custo());

        // Interface.Café com leite e canela
        Café caféComLeiteECanela = new CanelaDecorator(new LeiteDecorator(new CaféSimples()));
        System.out.println("\nDescrição: " + caféComLeiteECanela.getDescription());
        System.out.println("Custo: $" + caféComLeiteECanela.custo());
    }
}
