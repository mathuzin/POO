import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public  Main(){
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o registro de capitania: ");
        int regCap = s.nextInt();
        System.out.println("Insira a quantidade de pessoas: ");
        int qtdPessoa = s.nextInt();
        System.out.println("Insira o nome do navio: ");
        String nome = s.next();
        Navio navio = new Navio(regCap, qtdPessoa, nome, new ArrayList<>());

        System.out.println("Registrando botes:");

        char choice = 'S';

        while (choice == 'S') {
            System.out.println("Insira registro de capitania do bote: ");
            regCap = s.nextInt();
            System.out.println("Insira a quantidade de pessoas para o bote: ");
            qtdPessoa = s.nextInt();
            System.out.println("Insira se o bote é inflável ou não (true/false): ");
            boolean inflavel = s.nextBoolean();
            Botes botes = new Botes(regCap, qtdPessoa, inflavel);
            navio.getBotes().add(botes);
            System.out.println("Deseja cadastrar outro bote? (S/N)");
            choice = s.next().toUpperCase().charAt(0);
        }

        // Verifica a segurança do navio
        navio.verificarSeguranca();

        // Exibe informações do navio
        System.out.println(navio.mostrar());

        // Exibe informações de todos os botes no navio
        System.out.println(" ");
        System.out.println("Lista de Botes no Navio:");
        ArrayList<Botes> listaDeBotes = navio.getBotes();
        for (Botes bote : listaDeBotes) {
            System.out.println("Informações do bote:");
            System.out.println(bote.mostrar());
            System.out.println();
        }
    }
}

