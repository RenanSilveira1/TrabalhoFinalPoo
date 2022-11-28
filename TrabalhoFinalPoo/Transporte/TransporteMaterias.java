package Transporte;

public class TransporteMaterias extends Transporte {
    private String descricaoMaterial;
    private double carga;

    public TransporteMaterias(int identificador, EspacoPorto origem, EspacoPorto destino, String descricaoMaterial, double carga){
        super(identificador,origem,destino);
        this.descricaoMaterial = descricaoMaterial;
        this.carga = carga;
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
