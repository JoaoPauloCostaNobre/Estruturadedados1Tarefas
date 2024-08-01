import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JosephusProblem {

    public static void main(String[] args) {
        List<Pessoa> people = new ArrayList<>();

        // Adicionando 20 pessoas à lista
        for (int i = 1; i <= 20; i++) {
            people.add(new Pessoa(i, "Name" + i, "Phone" + i, "Address" + i, "CPF" + i));
        }

        Random rand = new Random();
        int m = rand.nextInt(people.size()) + 1; // Escolhendo m-ésima pessoa aleatoriamente

        int index = 0; // Índice inicial
        while (people.size() > 1) {
            index = (index + m - 1) % people.size();
            System.out.println("Eliminando: " + people.remove(index));
            m = rand.nextInt(people.size()) + 1; // Escolhendo nova m-ésima pessoa aleatoriamente
        }

        System.out.println("Pessoa sobrevivente: " + people.get(0));
    }
}      