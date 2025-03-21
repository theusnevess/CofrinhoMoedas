package Cofrinho;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info() {
        System.out.println("Dolar: " + valor);
    }

    @Override
    public double converter() {
        return valor * 5.66;
    }
}
