public class EspaconaveSubLuz extends Espaconave{
    private double velMaxImp;
    private String combustivel;

    public EspaconaveSubLuz(String nome, double velMaxImp, String combustivel) {
        super(nome);
        this.velMaxImp = velMaxImp;
        this.combustivel = combustivel;
    }
}
