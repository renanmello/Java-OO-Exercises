package exercicio4;

import java.util.ArrayList;
import java.util.List;

interface IMeioTransporte {
    void acelerar();
    void frear();
}

class Carro implements IMeioTransporte {
    private int velocidade;

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Carro acelerando. Velocidade: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 10);
        System.out.println("Carro freando. Velocidade: " + velocidade);
    }
}

class Bicicleta implements IMeioTransporte {
    private int velocidade;

    @Override
    public void acelerar() {
        velocidade += 5;
        System.out.println("Bicicleta acelerando. Velocidade: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 5);
        System.out.println("Bicicleta freando. Velocidade: " + velocidade);
    }
}

class Trem implements IMeioTransporte {
    private int velocidade;

    @Override
    public void acelerar() {
        velocidade += 20;
        System.out.println("Trem acelerando. Velocidade: " + velocidade);
    }

    @Override
    public void frear() {
        velocidade = Math.max(0, velocidade - 20);
        System.out.println("Trem freando. Velocidade: " + velocidade);
    }
}

// Demonstração
class MainTransporte {
    public static void main(String[] args) {
        List<IMeioTransporte> transportes = new ArrayList<>();
        transportes.add(new Carro());
        transportes.add(new Bicicleta());
        transportes.add(new Trem());

        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
        }
    }
}
