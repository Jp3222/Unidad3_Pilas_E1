package unidad3_pilas_tarea;

public class Pila {

    private Nodo cima;
    private int size;

    public Pila() {
        this.cima = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return cima == null;
    }

    public void push(int dato) {
        Nodo N = new Nodo(dato);
        N.siguiente = cima;
        cima = N;
        size++;
    }

    public int pop() {
        int aux = cima.Dato;
        cima = cima.siguiente;
        size--;
        return aux;
    }

    public int peek() {
        return cima.Dato;
    }

    public void Empty() {
        while (!isEmpty()) {
            pop();
        }
        System.out.println("La pila esta vacia");
    }

    public int size() {
        return size;
    }

    public void Mostrar() {
        Nodo aux = cima;

        while (aux != null) {
            System.out.println("[" + aux.Dato + "]");
            aux = aux.siguiente;
        }
        System.out.println("");

    }

    public void Random() {

        for (int i = 0; i < 10; i++) {
            int n = (int) ((Math.random() * 500) + 50);
            push(n);
        }
    }
}
