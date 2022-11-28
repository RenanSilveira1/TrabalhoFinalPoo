package Transporte;

import EspacoPorto.EspacoPorto;

public abstract class Transporte {
    private int identificador;

    public Transporte(int identificador, EspacoPorto origem, EspacoPorto destino){
        this.identificador = identificador;
        this.origem = origem;
        this.destino = destino;
    }

    public abstract double calculaDistancia();

    public abstract double calculaCusto();

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    
}
