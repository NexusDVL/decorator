package Class;

import Interface.Café;

// Decorador Concreto
class LeiteDecorator extends CaféDecorator {
    public LeiteDecorator(Café caféDecorado) {
        super(caféDecorado);
    }

    @Override
    public String getDescription() {
        return caféDecorado.getDescription() + ", com leite";
    }

    @Override
    public double custo() {
        return caféDecorado.custo() + 1.0;
    }
}
