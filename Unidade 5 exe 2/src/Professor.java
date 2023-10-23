public class Professor {
    private String nome;
    private String area;

    public Professor(String nome, String area){
        setNome(nome);
        setArea(area);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}
