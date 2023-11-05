public class AlunoGraduacao extends Aluno{
    private int semestre;

    public AlunoGraduacao(String nome, String curso, int semestre){
        super(nome,curso);
        setSemestre(semestre);
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String ExibirDados() {
        return "Nome: " + getNome() + "\n" +
                "Curso: " + getCurso() + "\n" +
                "Semestre: " + getSemestre();
    }

}
