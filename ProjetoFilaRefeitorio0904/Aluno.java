class Aluno {
    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String matricula, String nome, String curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
    }

    public String toString() {
        return "Aluno: " + nome + ", Matrícula: " + matricula + ", Curso: " + curso;
    }
}