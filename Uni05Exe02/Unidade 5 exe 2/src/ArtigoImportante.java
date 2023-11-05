import java.util.Date;

public class ArtigoImportante extends Artigo{
    private int fatorImportante;

    public ArtigoImportante(String titulo, String periodico, Date dataPublicacao, char qualis,int fatorImportante) {
        super(titulo, periodico, dataPublicacao, qualis);
        this.fatorImportante = fatorImportante;
    }

    public int getFatorImportante() {
        return fatorImportante;
    }

    public void setFatorImportante(int fatorImportante) {
        this.fatorImportante = fatorImportante;
    }

    @Override
    public String exibirDados(){
        return super.exibirDados() + "\nFator de impacto: " + getFatorImportante();
    }
}
