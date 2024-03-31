package Class;

import Interface.Café;

// Componente Concreto
class CaféSimples implements Café {
    @Override
    public String getDescription() {
        return "Interface.Café simples";
    }

    @Override
    public double custo() {
        return 2.0;
    }
}
