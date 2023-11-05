import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner tc = new Scanner(System.in);
        Aluno umAluno = new Aluno("João", "Ciências da Computação");
        System.out.println("O aluno ainda está estudando?S/N");
        String resposta = tc.next().toUpperCase();
        if(resposta.equals("S")){
            AlunoGraduacao umGraducao = new AlunoGraduacao(umAluno.getNome(), umAluno.getCurso(), 2);
            System.out.println(umGraducao.ExibirDados());
        } else if(resposta.equals("N")){
            AlunoPós umPós = new AlunoPós(umAluno.getNome(), umAluno.getCurso(), 50);
            System.out.println(umPós.ExibirDados());
        }
    }
}