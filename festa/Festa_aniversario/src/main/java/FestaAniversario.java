public abstract class FestaAniversario {

    private String tema;
    private String local;
    private int convidados;
    private String data;
    private double valor;

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getConvidados() {
        return convidados;
    }

    public void setConvidados(int convidados) {
        this.convidados = convidados;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}