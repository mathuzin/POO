public class Carro {
    private String placa;
    private int ano;
    private double potenciaMotor;
    private int tipoCombustivel;
    private Avaliacao avaliacao;

    public Carro(String placa, int ano, double  potenciaMotor, int tipoCombustivel, Avaliacao avaliacao) {
        this.placa = placa;
        this.ano = ano;
        this.potenciaMotor = potenciaMotor;
        this.tipoCombustivel = tipoCombustivel;
        this.avaliacao = avaliacao;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPotenciaMotor() {
        double rendimento = 0;
        if (getTipoCombustivel() == 1) {
            rendimento = 10 / (potenciaMotor * 0.7);
        } else if (getTipoCombustivel() == 2) {
            rendimento = 12 / (potenciaMotor * 0.6);
        }
        return rendimento;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public int getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(int tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String combustivel() {
        String tipo = null;
        if (getTipoCombustivel() == 1) {
            tipo = "Álcool";
        } else if (getTipoCombustivel() == 2) {
            tipo =  "Gasolina";
        }
        return tipo;
    }
        public String imprimir() {
            return "Placa: " + getPlaca() + '\n' +
                    "Ano: " + getAno() + '\n' +
                    "Potencia: " + getPotenciaMotor() + '\n' +
                    "Combustivel: " + combustivel() + '\n' +
                    "Aval: " + avaliacao.getAval() + '\n' +
                    "Lista mecanica: " + avaliacao.getLista();
        }
    }
