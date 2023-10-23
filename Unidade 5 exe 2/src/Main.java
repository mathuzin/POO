import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        new Main();
    }

    public Main()throws ParseException {
        Scanner s = new Scanner(System.in);
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Cadastrar-se");
        System.out.println("2 - Sair");
        int respostas = s.nextInt();
        while (respostas != 2) {
            System.out.println("Insira seu nome: ");
            String nome = s.next();
            System.out.println("Insira sua area: ");
            String area = s.next();
            Professor Prof = new Professor(nome, area);
            System.out.println("Digite o titulo do Artigo: ");
            String titulo = s.next();
            System.out.println("Digite o periódico: ");
            String periodico = s.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Digite a data da publicação: ");
            Date data = sdf.parse(s.next());
            System.out.println("Digite o qualis: ");
            char qualis = s.next().charAt(0);
            Artigo artigo = new Artigo(titulo, periodico, data, qualis, nome, area);
            System.out.println("Defina o artigo: ");
            System.out.println("1 - Normal");
            System.out.println("2 - Importante");
            int escolha = s.nextInt();
            if(escolha == 2){
                System.out.println("Insira o fator impacto: ");
                int impacto = s.nextInt();
                ArtigoImportante importante = new ArtigoImportante(titulo,periodico, data, qualis,nome, area, impacto);
                System.out.println(importante.exibirDados());
            } else if (escolha == 1) {
                System.out.println(artigo.exibirDados());
            }
            System.out.println("");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Cadastrar-se");
            System.out.println("2 - Sair");
            respostas = s.nextInt();
        }
    }
}
