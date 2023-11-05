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
        System.out.println("Insira seu nome: ");
        String nome = s.next();
        System.out.println("Insira sua area: ");
        String area = s.next();
        Professor Prof = new Professor(nome, area);
        char tipo = 'S';
        do {
            System.out.println("Informe o tipo de artigo: " + "\nN - Artigo normal." + "\nI - Artigo importante." + "\nS - Sair");
            tipo = s.next().toUpperCase().charAt(0);
            System.out.println("Digite o titulo do Artigo: ");
            String titulo = s.next();
            System.out.println("Digite o periódico: ");
            String periodico = s.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Digite a data da publicação: ");
            Date data = sdf.parse(s.next());
            System.out.println("Digite o qualis: ");
            char qualis = s.next().charAt(0);
            switch (tipo){
                case 'N':
                    Artigo aNormal = new Artigo(titulo, periodico, data, qualis);
                    Prof.adicionarArtigo(aNormal);
                    break;

                case 'I':
                    System.out.println("Fato de impacto: ");
                    int fato = s.nextInt();
                    ArtigoImportante aImportante = new ArtigoImportante(titulo, periodico, data, qualis, fato);
                    Prof.adicionarArtigo(aImportante);

                case 'S':
                    break;

                default:
                    System.out.println("Opção invalida");
                }
            } while (tipo != 'S');
        System.out.println(Prof.mostrarEstatistica());
        s.close();
        }
    }

