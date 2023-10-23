import java.util.Date;

public class ArtigoImportante extends Artigo{
    private int fatorImportante;

    public ArtigoImportante(String titulo, String periodico, Date dataPublicacao, char qualis, String nome, String area, int fatorImportante) {
        super(titulo, periodico, dataPublicacao, qualis, nome, area);
        this.fatorImportante = fatorImportante;
    }

    public int getFatorImportante() {
        return fatorImportante;
    }

    public void setFatorImportante(int fatorImportante) {
        this.fatorImportante = fatorImportante;
    }

    public String exibirDados(){
        return "Nome: " + getNome() + "\nArea: " + getArea() + "\nTitulo: " + getTitulo() + "\nPeriódico: " + getPeriodico() + "\nData da Publicação: " + getDataPublicacao() + "\nQualis: " + getQualis() + "\nFator Importante: " + getFatorImportante();
    }
}
