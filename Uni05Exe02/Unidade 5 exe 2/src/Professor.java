import java.util.ArrayList;

public class Professor {
    private String nome;
    private String area;
    private ArrayList<Artigo> artigos;

    public Professor(String nome, String area){
        setNome(nome);
        setArea(area);
        artigos = new ArrayList<Artigo>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(nome == null || nome.trim().equals("")) {
            throw new IllegalArgumentException();
        }
        this.area = area;
    }

    public void adicionarArtigo(Artigo artigo){
        if(artigo == null){
            throw new IllegalArgumentException();
        }
        artigos.add(artigo);
    }

    public String mostrarEstatistica(){
        String dados = "Nome: " + getNome() + "Área: " + getArea() + ") \nArtigos: \n";

        for (Artigo a: artigos){
            dados += a.exibirDados() + "\n";
        }

        return dados;
    }

}
