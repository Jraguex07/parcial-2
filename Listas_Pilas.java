package Listas_pilas;

import java.util.Scanner;
import java.util.Stack;

public class Listas_Pilas {
    Scanner in = new Scanner(System.in);
    ListasPila lista = new ListasPila();
    public static  String variable,palabra;
    
    public static void main(String[] args) {
        
        Listas_Pilas list = new Listas_Pilas();
        list.menu();
    }
        public void menu(){
        boolean  exit = false;
        int opcion;        
        
        while(!exit) {
            System.out.println("------------Bienvenido a Univerdidad San Pablo Guatemala-------------");
            System.out.println("Que desea realizar: \n"
                    + "1.Empujar un elemento en la pila\n"
                    + "2.sacar un elemento de la pila\n"
                    + "3.¿Esta la pila vacia?\n"
                    + "4.¿Que elemento esta en la cima ?\n"
                    + "5.Tamaño de la pila\n"
                    + "6.vaciar pila\n"
                    + "7.Mostrar\n"
                    + "8.introvertir\n"
                    + "9.cadenas de llaves \n"
                    + "10.Exit\n");
                              
            System.out.println("Please select an option");

            opcion = in.nextInt();
            switch(opcion) {

                case 1:  
                    add();
                    break;   

                case 2: 
                    if(!lista.estavacia()){
                    System.out.println("El elemento obtenido\n"+lista.sacar());                   
                    }
                    
                    else{
                        System.out.println("La pila esta vacia");
                    }                   
                    break;  
                    
                case 3: 
                    if (lista.estavacia()){
                        System.out.println("La pila esta vacia");
                        
                    }else {
                        System.out.println("La pila contiene datos");               
                    }              
                    break;  
                    
                case 4:  
                    if (!lista.estavacia()) {
                        System.out.println("El elemento que se encuentra en la cima es\n"+ lista.cima());
                        System.out.println("\npila vacia");
                        
                    } else {
                        System.out.println("La pila esta vacia");
                    }
                    
                   
                    break;    
                case 5:                     
                    System.out.println("El tamaño de la pila es\n" +  lista.tamanio());
                    System.out.println("Tamaño de la pila");
                    
                    break;                  
                case 6:
                    if (!lista.estavacia()) {
                        lista.limpiar();
                        System.out.println("La pila se ha vaciado");  
                    } else {
                    }
                    System.out.println("La pila esta vacia");        
                    
                    break; 
                    
                case 7:
                    lista.mostrarLista();
                    
                case 8:
                    introvertir();
                case 9:
                    balanceada();
                    
                case 10:
                    exit= true;
                    break;
                default: 
                    System.out.println("----------------Please select the correct option----------------");
                break;        
            } 
          }
    }
        
    public void add(){
           
        System.out.println("Ingresar un elemento a la pila");
        variable =in.next();
        for (char c:variable.toCharArray()) {
            System.out.println(c);
            lista.push(c);
            
        }       
    }
    
    public void introvertir(){
        
        while (!lista.estavacia()) {
            System.out.println(lista.sacar()); 
                
        }
        System.out.println(palabra);
    }
    
    public boolean balanceada() {
        System.out.println("Introdusca las cadenas a utilizar");
        Scanner in= new Scanner(System.in); //donde guardamos los datos en ese caso sera de tipo string porque son parentesis
        String entrada=in.next();
        Stack <Character>pila = new <Character>Stack(); //stack es una funcion nos sirve para que el usuario no diga un n de veces 
        int i= 0; //aca inicializamos una variable llamada i para que nos recorra los parentesis
        int tamanio=entrada.length(); //aca nos recorrera el tamanio hasta dodne termine el numero de vecs que hizo
           for (int f = 0 ; f < entrada.length() ; f++)
    	{
    	    if (entrada.charAt(f) == '(' || entrada.charAt(f) == '[' || entrada.charAt(f) == '{') {
    	    	pila.push(entrada.charAt(f));
    	    } else {
    	    	if (entrada.charAt(f)==')') {
    	    	    if (pila.pop()!='(') {
    	    	        return false;
    	    	    }
    	     	} else {
    	    	    if (entrada.charAt(f)==']') {
    	    	        if (pila.pop()!='[') {
    	    	            return false;
    	    	        }
    	    	    } else {
    	    	        if (entrada.charAt(f)=='}') {
    	    	            if (pila.pop()!='{') {
    	    	                return false;
    	    	            }
    	    	        }
    	    	    }
    	        }
   	    }   
        }
    	if (pila.empty()) {
    	    return true;
    	} else {
   	    return false;
    	}
    }	
    
}

    
