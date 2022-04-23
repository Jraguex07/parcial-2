
package parentesis_repetidos;

import java.util.Stack;


public class Parentesis_repetidos {
    public static void main(String[] args) {
        String s = "(((a+(b))+(c+d)))"; 
  
        if(duplicado(s)){ 
            System.out.println("contiene parentesis duplicados."); 
        } 
        
        else{ 
            System.out.println("no contiene parentesis duplicados"); 
        } 
  
    }
    
    public static boolean duplicado(String s){ 
        
        Stack<Character> Stack = new Stack<>(); 
  
        char[] str = s.toCharArray(); 
        for(char i : str) { 
            
            if (i == ')') { 
                
                char top = Stack.peek(); 
                Stack.pop(); 
  
                int elementos = 0; 
                
                while (top != '(') { 
                    elementos++; 
                    top = Stack.peek(); 
                    Stack.pop(); 
                } 
                
                if (elementos < 1){ 
                    return true; 
                } 
            } 
            
            else{ 
                Stack.push(i); 
            } 
        } 
  
        return false; 
    } 
  

   }
    

