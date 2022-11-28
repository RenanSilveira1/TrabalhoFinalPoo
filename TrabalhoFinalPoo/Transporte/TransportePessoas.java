package Transporte;

public class TransportePessoas extends Transporte {
    private int pessoasTransportadas;

    public TransportePessoas(int identificador, EspacoPorto origem, EspacoPorto destino, int pessoasTransportadas){
        super(identificador, origem, destino);
        this.pessoasTransportadas = pessoasTransportadas;
    }

    @Override
    public double calculaDistancia() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calculaCusto() {
        // TODO Auto-generated method stub
        return 0;
    }
}
