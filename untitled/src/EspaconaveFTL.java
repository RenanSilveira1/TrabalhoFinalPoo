public class EspaconaveFTL extends Espaconave{
    private double velMaxWarp;
    private int limiteTransp;

    public EspaconaveFTL(String nome, double velMaxWarp, int limiteTransp){
        super(nome);
        this.velMaxWarp = velMaxWarp;
        this.limiteTransp = limiteTransp;
    }
}
