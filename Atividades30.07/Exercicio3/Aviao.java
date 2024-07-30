public class Aviao {
    private int identificador;
    private String nome;

    public Aviao(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "ID: " + identificador + ", Nome: " + nome;
    }
}
