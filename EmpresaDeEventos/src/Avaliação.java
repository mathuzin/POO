public class Avaliação {
    private int qtdadePagantes;
    private String opniaoGeral;

    public Avaliação(int qtdadePagantes, String opniaoGeral) {
        this.qtdadePagantes = qtdadePagantes;
        this.opniaoGeral = opniaoGeral;
    }

    public int getQtdadePagantes() {
        return qtdadePagantes;
    }

    public void setQtdadePagantes(int qtdadePagantes) {
        this.qtdadePagantes = qtdadePagantes;
    }

    public String getOpniaoGeral() {
        return opniaoGeral;
    }

    public void setOpniaoGeral(String opniaoGeral) {
        this.opniaoGeral = opniaoGeral;
    }
}
