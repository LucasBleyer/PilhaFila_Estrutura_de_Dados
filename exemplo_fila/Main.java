package exemplo_fila;

public class Main {
    public static void main(String[] args) {
        
        Fila fila = new Fila();//O primeiro que entra é o primeiro que sai
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(1);
        fila.Enqueue(novoNodo );
        
        novoNodo = new Nodo();
        novoNodo.setValor(2);
        fila.Enqueue( novoNodo );
        
        novoNodo = new Nodo();
        novoNodo.setValor(3);
        fila.Enqueue( novoNodo );
        
        novoNodo = new Nodo();
        novoNodo.setValor(4);
        fila.Enqueue( novoNodo );
        
        fila.Dequeue();
        
        System.out.println(fila.toString());
        
    }
}
