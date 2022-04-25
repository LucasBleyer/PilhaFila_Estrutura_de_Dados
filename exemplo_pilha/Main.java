public class Main {
    public static void main(String[] args) {
        
        Pilha pilha = new Pilha();
        
        Nodo novoNodo = new Nodo();
        novoNodo.setValor(10);
        pilha.Push(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(20);
        pilha.Push(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(5);
        pilha.Push(novoNodo);
        
        novoNodo = new Nodo();
        novoNodo.setValor(40);
        pilha.Push(novoNodo);
        
        pilha.Pop();
        
        System.out.println(pilha.toString());
    }
}
