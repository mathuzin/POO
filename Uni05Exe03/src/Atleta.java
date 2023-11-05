public abstract class Atleta {
    private String nome;
    private double peso;
    private int idade;

    public Atleta(String nome, double peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public abstract String definirCategoria(String nome, double peso, int idade);

}
