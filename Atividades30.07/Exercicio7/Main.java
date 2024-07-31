package Exercicio7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Criar a fila F e preenchê-la com 20 números aleatórios
        Queue<Integer> F = new LinkedList<>();
        Random rand = new Random();
        InverterFila inverter = new InverterFila();
        
        for (int i = 0; i < 20; i++) {
            F.add(rand.nextInt(100)); // números aleatórios entre 0 e 99
        }
        
        // Imprimir a fila F original
        System.out.println("Fila F original: " + F);
        
        // Inverter a fila F usando uma pilha como auxiliar
        inverter.inverterFila(F);
        
        // Imprimir a fila F invertida
        System.out.println("Fila F invertida: " + F);
    }
}
