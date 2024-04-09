

public class Main {
    public static void main(String[] args) {
        // Criando alguns exemplos de alunos, professores e técnicos
        Aluno aluno1 = new Aluno(1234, "João", "Engenharia");
        Aluno aluno2 = new Aluno(5678, "Maria", "Direito");
        Professor professor1 = new Professor(9876, "Carlos", "Doutorado");
        Tecnico tecnico1 = new Tecnico(5432, "Ana");

        // Criando a fila do refeitório
        FilaRefeitorio filaRefeitorio = new FilaRefeitorio();

        // Adicionando pessoas à fila
        filaRefeitorio.entrarNaFila(aluno1);
        filaRefeitorio.entrarNaFila(professor1);
        filaRefeitorio.entrarNaFila(tecnico1);
        filaRefeitorio.entrarNaFila(aluno2);

        // Mostrando a fila
        System.out.println("Fila do refeitório:");
        filaRefeitorio.mostrarFila();

        // Removendo pessoa da fila
        System.out.println("\nRemovendo pessoa da fila:");
        Object pessoaRemovida = filaRefeitorio.sairDaFila();
        if (pessoaRemovida != null) {
            System.out.println("Pessoa removida: " + pessoaRemovida.toString());
        } else {
            System.out.println("Fila vazia. Nenhuma pessoa removida.");
        }
    }
}