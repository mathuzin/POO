public class CarroTurbo extends Carro {
    private double potenciaAdicional;
    public CarroTurbo(String placa, int ano, double potenciaMotor, int tipoCombustivel, Avaliacao avaliacao, double potenciaAdicional) {
        super(placa, ano, potenciaMotor, tipoCombustivel, avaliacao);
        this.potenciaAdicional = potenciaAdicional;
    }

    public double getPotenciaAdicional() {
        return potenciaAdicional;
    }

    public void setPotenciaAdicional(double potenciaAdicional) {
        this.potenciaAdicional = potenciaAdicional;
    }

    @Override
    public double getPotenciaMotor() {
        double potenciaMotorComAdicional = potenciaAdicional + (0.3 * potenciaAdicional);
        double rendimento = 0.0;

        if (getTipoCombustivel() == 1) {
            rendimento = 10 / (potenciaMotorComAdicional * 0.7);
        } else if (getTipoCombustivel() == 2) {
            rendimento = 12 / (potenciaMotorComAdicional * 0.6);
        }

        return rendimento;
    }

    public String mostrar(){
        return  "Carro turbo: " + '\n' +
                "Placa: " + getPlaca() + '\n' +
                "Ano: " + getAno() + '\n' +
                "Potencia: " + getPotenciaMotor() + '\n' +
                "Combustivel: " + combustivel();
    }
}
