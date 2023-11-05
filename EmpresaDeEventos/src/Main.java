import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner s = new Scanner(System.in);
        ArrayList<Evento> eventos = new ArrayList<>();
        ArrayList<showMusical> shows = new ArrayList<>();
        System.out.print("Insira quantos eventos deseja adicionar: ");
        int quantos = s.nextInt();

        for (int i = 0; i < quantos; i++) {
            System.out.print("É um evento qualquer ou um show musical? Q/S: ");
            char resposta = s.next().toUpperCase().charAt(0);

            System.out.print("Entre com o nome: ");
            String titulo = s.next();

            System.out.print("Entre com o valor do ingresso: ");
            double valor = s.nextDouble();

            System.out.print("Entre com a data no formato dd/MM/yyyy: ");
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String data1 = s.next();
            Date data;
            try {
                data = sdf.parse(data1);
            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Use o formato dd/MM/yyyy.");
                continue; // Volte para a próxima iteração do loop
            }

            System.out.print("Insira a quantidade de pessoas: ");
            int qtdPessoas = s.nextInt();
            System.out.print("Insira a opinião geral: ");
            String opniaoGeral = s.next();
            Avaliação avaliacao = new Avaliação(qtdPessoas, opniaoGeral);

            if (resposta == 'Q') {
                Evento evento = new Evento(titulo, valor, data);
                evento.setAvaliação(avaliacao); // Associa a avaliação ao evento
                eventos.add(evento);
            } else if (resposta == 'S') {
                System.out.print("Entre com o nome do artista: ");
                String artista = s.next();
                System.out.print("Entre com o gênero musical: ");
                String generoMusical = s.next();
                showMusical show = new showMusical(titulo, valor, data, artista, generoMusical);
                show.setAvaliação(avaliacao); // Associa a avaliação ao show musical
                shows.add(show);
            }
        }

        for (Evento evento : eventos) {
            System.out.println("Eventos:" + '\n' + evento.mostrar());
        }

        for (showMusical show : shows) {
            System.out.println("\nShows Musicais:");
            System.out.println(show.mostrar());
        }
    }
}
