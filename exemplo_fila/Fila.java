package exemplo_fila;

public class Fila {
    private Nodo fila;
    private int totalElementos;
    
    public Fila() {
        this.fila = null;
        this.totalElementos = 0;
    }

    public void Enqueue(Nodo novoNodo) {
        
        if (this.fila == null) 
        {
            this.fila = novoNodo;
        } 
        else 
        {
            Nodo aux = this.fila;
            while (aux.getProximo() != null) 
            {
                aux = aux.getProximo();
            }
            aux.setProximo( novoNodo );
        }
        this.totalElementos++;
    }
    
    public void Dequeue() {
        
        if (this.fila == null) 
        {
            System.out.println("Fila Vazia!");
        }
        else 
        {
            this.fila = this.fila.getProximo();
            this.totalElementos--;
        }
    }
  
    @Override
    public String toString() {
        return "Fila: " + fila + 
               "\nN° de Elementos de Fila: " + totalElementos;
    }
}
