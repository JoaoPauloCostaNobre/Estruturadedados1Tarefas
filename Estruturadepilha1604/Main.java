import java.util.Stack;

public class Main {
    // Método para inverter as letras de cada palavra em um texto
    public static String inverterPalavras(String texto) {
        StringBuilder resultado = new StringBuilder();
        // Dividir o texto em palavras usando o espaço como delimitador
        String[] palavras = texto.split(" ");

        // Iterar sobre cada palavra no array de palavras
        for (String palavra : palavras) {
            // Criar uma pilha para armazenar as letras da palavra
            Stack<Character> pilha = new Stack<>();
            // Iterar sobre cada letra na palavra e colocá-la na pilha
            for (char letra : palavra.toCharArray()) {
                pilha.push(letra);
            }
            // Criar uma StringBuilder para armazenar a palavra invertida
            StringBuilder palavraInvertida = new StringBuilder();
            // Desempilhar as letras da pilha para construir a palavra invertida
            while (!pilha.isEmpty()) {
                palavraInvertida.append(pilha.pop());
            }
            // Adicionar a palavra invertida ao resultado, seguida de um espaço
            resultado.append(palavraInvertida).append(" ");
        }

        // Retornar o resultado como uma string, removendo o espaço extra no final
        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        // Textos de entrada
        String texto1 = "UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String texto2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG java";

        // Chamar o método para inverter as palavras em cada texto
        String resultado1 = inverterPalavras(texto1);
        String resultado2 = inverterPalavras(texto2);

        // Imprimir os resultados
        System.out.println("Texto 1: " + resultado1);
        System.out.println("Texto 2: " + resultado2);
    }
}

