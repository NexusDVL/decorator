package Class;

import Interface.Café;

// Decorador Concreto
class CanelaDecorator extends CaféDecorator {
    public CanelaDecorator(Café caféDecorado) {
        super(caféDecorado);
    }

    @Override
    public String getDescription() {
        return caféDecorado.getDescription() + ", com canela";
    }

    @Override
    public double custo() {
        return caféDecorado.custo() + 0.5;
    }
}
