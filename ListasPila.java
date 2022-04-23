
package Listas_pilas;

public class ListasPila {
    private Nodo cima ;
    int tamano;
    String Lista;
    
    public ListasPila (){
        cima=null;
        tamano=0;
    }
    // pilas esta vacia 
    public boolean estavacia(){
        return cima==null;
    }
    //inseratar un elemento en la pila PUSH 
    public void push(char elemento){
        Nodo nuevo = new Nodo(elemento);
        nuevo.siguiente=cima;
        cima=nuevo;       
    }
    // para sacar popo un elemento den la pila 
    public char sacar(){
        char auxiliar=cima.dato;
        cima=cima.siguiente;
        tamano--;
        return auxiliar;
    }
    //Metodo para saber quien esta encima de la pila
    public char cima(){
        return cima.dato;
    }
    //pafra saber eltamano de la pila
    public int tamanio(){
        return tamano;
    }
    public void limpiar(){
    while(!estavacia()){
           sacar();
    }
   }
    public void mostrarLista(){
        Nodo auxiliar = this.cima;
        while(auxiliar != null){
            Lista += auxiliar.dato + "\n";
            auxiliar=auxiliar.siguiente;
        }
        System.out.println(Lista);
        Lista = "";
    }
    

    
 }
