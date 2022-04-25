package exemplo_fila;

public class Nodo {
    private int valor;
    private Nodo proximo;
    
    public Nodo(){
        this.proximo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
    
    @Override
    public String toString() {
        return "valor: " + valor + ", proximo: " + proximo;
    }

}