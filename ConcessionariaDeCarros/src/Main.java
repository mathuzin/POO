import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        Avaliacao avaliacao = new Avaliacao("ruim", "Parafuso");
        avaliacao.addLista("Prego");
        ArrayList<Carro> carros = new ArrayList<>();
        ArrayList<CarroTurbo> carroTurbos = new ArrayList<>();
        Carro carro = new Carro("ABC123", 2022, 2.0, 1, avaliacao);
        carros.add(carro);
        Avaliacao avaliacao1 = new Avaliacao("Razoavel", "Prego");
        avaliacao1.addLista("engrenagem");
        Carro carrao = new Carro("321CBA", 2019, 2.0, 1, avaliacao1);
        carros.add(carrao);
        CarroTurbo turbo = new CarroTurbo("321CBA", 2023, 1.0, 2, avaliacao, 2.0);
        carroTurbos.add(turbo);
        Concessionaria concessionaria = new Concessionaria(carros, carroTurbos);
        for (Carro carro1 : carros){
            System.out.println(carro1.imprimir());
            System.out.println("");
        }
        for (CarroTurbo turbo1 : carroTurbos){
            System.out.println(turbo1.imprimir());
            System.out.println("");
        }
        concessionaria.pesquisarCarro("321CBA");
        System.out.println("");
        System.out.println(concessionaria.relatorioAno());
        System.out.println("");
        System.out.println(concessionaria.relatorioProblema());
        System.out.println("");
        System.out.println(concessionaria.relatorioRendimento());
        System.out.println("");
        System.out.println(concessionaria.relatorioRendimento2());
    }
}