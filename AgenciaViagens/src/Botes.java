import java.util.ArrayList;

public class Botes extends Embarcacao{
    private boolean inflavel;

    public Botes(int registroCapitania, int qtdPessoas, boolean inflavel) {
        super(registroCapitania, qtdPessoas);
        this.inflavel = inflavel;
    }

    public boolean isInflavel() {
        return inflavel;
    }

    public void setInflavel(boolean inflavel) {
        this.inflavel = inflavel;
    }

    public String inflavel(){
        if(isInflavel() == false){
            return "Sim";
        } else {
            return "Não";
        }
    }

    public String mostrar(){
        return "Reg.Capitania: " + getRegistroCapitania() + '\n' +
                "Qtde Pessoas: " + getQtdPessoas() + '\n' +
                "Inflável: " + inflavel();
    }

}

