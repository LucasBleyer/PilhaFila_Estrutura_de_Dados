public class Pilha {
    private Nodo pilha;
    private int totalElementos;
    
    public Pilha() { // criação da pilha
        this.pilha = null; // lista vazia!
        this.totalElementos = 0;
    }
    
    public void Push(Nodo novoNodo) {//empilha e atualiza o topo.
        
        if (this.pilha == null)
        { 
            // está vazia
            this.pilha = novoNodo;
        } 
        else
        { 
            // pilha possui elementos
            novoNodo.setProximo(this.pilha);
            this.pilha = novoNodo;
        }
        this.totalElementos++;
      
    }
       
    public void Pop(){
        
        if (this.pilha == null) 
        { // pilha vazia 
            System.out.println("Lista vazia!");
        }
        else 
        { // possui elementos
            this.pilha = this.pilha.getProximo();
            this.totalElementos--;
        }
        
    }

    @Override
    public String toString() {
        return "Pilha " + pilha 
                + "\nTotal de elementos: " + totalElementos;
    }

    
    
}
