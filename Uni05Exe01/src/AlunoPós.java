public class AlunoPós extends Aluno{
    private int pontos;

    public AlunoPós(String nome, String curso, int pontos){
        super(nome, curso);
        setPontos(pontos);
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String ExibirDados(){
        return "Nome: " + getNome() + "\n" +
                "Curso: " + getCurso() + "\n" +
                "Pontos: " + getPontos();

    }
}

