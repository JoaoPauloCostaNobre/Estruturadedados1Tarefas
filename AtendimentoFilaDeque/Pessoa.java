public class Pessoa {
    private int id;
    private String sexo;
    private int idade;
    private boolean gestante;
    private boolean lactante;
    private boolean necessidadeEspecial;
    int prioridade;

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = calcularPrioridade();
    }

    private int calcularPrioridade() {
        if (gestante || lactante) {
            return 3;
        } else if (necessidadeEspecial) {
            return 2;
        } else if (idade > 60) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Pessoa ID: " + id + ", Sexo: " + sexo + ", Idade: " + idade +
               ", Gestante: " + (gestante ? "Sim" : "Não") + ", Lactante: " + (lactante ? "Sim" : "Não") +
               ", Necessidade Especial: " + (necessidadeEspecial ? "Sim" : "Não") + ", Prioridade: " + prioridade;
    }
}
