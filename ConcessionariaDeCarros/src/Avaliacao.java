import java.util.ArrayList;

public class Avaliacao {
    private String aval;
    private ArrayList<String> lista;

    public Avaliacao(String aval, String item) {
        this.aval = aval;
        this.lista = new ArrayList<>();
        lista.add(item);
    }

    public String getAval() {
        return aval;
    }

    public void setAval(String aval) {
        this.aval = aval;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public void addLista(String item){
        lista.add(item);
    }
}
