import java.util.Date;

public class showMusical extends Evento{
    private String artista;
    private String  estiloMusical;

    public showMusical(String titulo, double valorIngresso, Date data,String artista, String estiloMusical) {
        super(titulo, valorIngresso, data);
        this.artista = artista;
        this.estiloMusical = estiloMusical;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String mostrar(){
        return   getTitulo() + "de " + getEstiloMusical() + " do " + getArtista() + " com ingressos a " + getValorIngresso() +  ", contou com " + getAvaliação().getQtdadePagantes() + " pagantes que acharam o evento " + getAvaliação().getOpniaoGeral() + ".";
    }
}
