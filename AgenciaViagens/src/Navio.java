import java.io.NotActiveException;
import java.util.ArrayList;

public class Navio extends Embarcacao{
    private String nome;

    private ArrayList<Botes> botes;

    public Navio(int registroCapitania, int qtdPessoas, String nome,ArrayList<Botes> botes) {
        super(registroCapitania, qtdPessoas);
        this.nome = nome;
        this.botes = botes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Botes> getBotes() {
        return botes;
    }

    public boolean verificarSeguranca(){
        int capacidadeTotalBotes = 0;
        for(Botes bote :botes){
            capacidadeTotalBotes += bote.getQtdPessoas();
        }

        if(capacidadeTotalBotes >= getQtdPessoas()) {
            System.out.println("Navio atende normas de segurança");
            return true;
        } else {
            System.out.println("Navio NÃO atende normas de segurança, numero de botes insuficiente");
            return false;
        }


    }
    public String mostrar(){
        return "Reg.Capitania: " + getRegistroCapitania() + '\n' +
                "Qtde Pessoas: " + getQtdPessoas() + '\n' +
                "Nome: " + getNome();
    }
}
