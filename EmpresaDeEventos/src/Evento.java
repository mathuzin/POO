import java.util.Date;

public class Evento {
    private String titulo;
    private double valorIngresso;
    private Date data;
    private Avaliação avaliação;

    public Evento(String titulo, double valorIngresso, Date data) {
        this.titulo = titulo;
        this.valorIngresso = valorIngresso;
        this.data = data;
    }

    public Avaliação getAvaliação() {
        return avaliação;
    }

    public void setAvaliação(Avaliação avaliação) {
        this.avaliação = avaliação;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String mostrar(){
        return getTitulo() + ", no dia " + getData() + "ingressos a " + getValorIngresso() + ", " + avaliação.getQtdadePagantes() + " pagantes que acharam o evento " + avaliação.getOpniaoGeral();
    }
}
