
import java.util.ArrayList;
import java.util.List;

class FilaRefeitorio {
    private List<Object> fila;

    public FilaRefeitorio() {
        fila = new ArrayList<>();
    }

    public void entrarNaFila(Object pessoa) {
        fila.add(pessoa);
    }

    public Object sairDaFila() {
        if (!fila.isEmpty()) {
            return fila.remove(0);
        } else {
            return null;
        }
    }

    public void mostrarFila() {
        for (Object pessoa : fila) {
            System.out.println(pessoa.toString());
        }
    }
}
