package Class;

import Interface.Café;

// Decorador
abstract class CaféDecorator implements Café {
    protected Café caféDecorado;

    public CaféDecorator(Café caféDecorado) {
        this.caféDecorado = caféDecorado;
    }

    @Override
    public String getDescription() {
        return caféDecorado.getDescription();
    }

    @Override
    public double custo() {
        return caféDecorado.custo();
    }
}
