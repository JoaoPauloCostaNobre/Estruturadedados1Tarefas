class Aluno {
    private int matricula;
    private String nome;
    private String curso;

    public Aluno(int matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula + ", Curso: " + curso;
    }
}