class Tecnico {
    private int siape;
    private String nome;

    public Tecnico(int siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }

    public String toString() {
        return "Técnico Administrativo: " + nome + ", SIAPE: " + siape;
    }
}