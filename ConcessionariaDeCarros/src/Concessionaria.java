import java.util.ArrayList;

public class Concessionaria {
    private ArrayList<Carro> carros;
    private ArrayList<CarroTurbo> carrosTurbo;

    public Concessionaria(ArrayList<Carro> carros, ArrayList<CarroTurbo> carrosTurbo) {
        this.carros = carros;
        this.carrosTurbo = carrosTurbo;
    }

    public void pesquisarCarro(String placa) {
        Carro carroEncontrado = null;
        for (Carro carro : carros){
            if(carro.getPlaca().equals(placa)){
                carroEncontrado = carro;
                break;
            }
        }

        if (carroEncontrado != null){
            System.out.println(carroEncontrado.imprimir());
        } else {
            System.out.println("Carro com a placa '" + placa + "' não foi encontrado na lista de carros.");
        }
    }


    public String  relatorioAno(){
        Carro  velho = carros.get(0);
        Carro  novo  = carros.get(0);
        CarroTurbo velhoTurbo = carrosTurbo.get(0);
        CarroTurbo novoTurbo = carrosTurbo.get(0);
        for (Carro carro : carros) {
            if(carro.getAno() < velho.getAno()){
                velho  = carro;
            }
            if(carro.getAno() > novo.getAno()){
                novo = carro;
            }
        }
        for (CarroTurbo turbo : carrosTurbo){
            if(turbo.getAno() < velhoTurbo.getAno()){
                velhoTurbo = turbo;
            }
            if(turbo.getAno() > novoTurbo.getAno()){
                novoTurbo = turbo;
            }
        }
        return "O carro mais velho: " + velho.imprimir() + "\n" +
                "O carro mais novo: " + novo.imprimir() + "\n" +
                "O carro turbo mais velho: " + velhoTurbo.imprimir() + "\n" +
                "O carro turbo mais novo: " + novoTurbo.imprimir();
    }

    public String relatorioRendimento(){
        Carro rendimento = carros.get(0);
        for (Carro carro : carros){
            if (rendimento.getPotenciaMotor() < carro.getPotenciaMotor()) {
                rendimento = carro;
            }
        }
        return "O carro comum com maior rendimento: " + rendimento.imprimir();
    }

    public String relatorioRendimento2(){
        CarroTurbo rendimento = carrosTurbo.get(0);
        double somaPotencia = 0.0;
        for (CarroTurbo turbo : carrosTurbo){
            if(turbo.getPotenciaMotor() < rendimento.getPotenciaMotor()){
                rendimento = turbo;
            }
            somaPotencia += turbo.getPotenciaMotor();
        }

        double mediaPotencia = somaPotencia / carrosTurbo.size();

        return "O Carro Turbo com menor rendimento: " + rendimento.imprimir() + "\n" +
                "Média de rendimento dos carros: " + mediaPotencia;
    }

    public String relatorioProblema(){
        String retorno = null;
        for (Carro carro : carros){
            Avaliacao avaliacao = carro.getAvaliacao();
            if(avaliacao.getAval().equals("Ruim") || avaliacao.getAval().equals("Razoável")){
                retorno = "O carro com mais problemas mecanicos é: " + carro.imprimir();
            }
        }
        return retorno;
    }


}
