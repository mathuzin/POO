public abstract class Embarcacao {
    private int registroCapitania;
    private int qtdPessoas;

    public Embarcacao(int registroCapitania, int qtdPessoas) {
        this.registroCapitania = registroCapitania;
        this.qtdPessoas = qtdPessoas;
    }

    public int getRegistroCapitania() {
        return registroCapitania;
    }

    public void setRegistroCapitania(int registroCapitania) {
        this.registroCapitania = registroCapitania;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public abstract String mostrar();
}
