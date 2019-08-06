/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burg;
import static java.awt.PageAttributes.MediaType.A;
import java.util.*;
import java.util.Random;
public class Burg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner key = new Scanner(System.in);
        int num,arre;
        
        System.out.println("Ingrese Tamaño de arreglo");
        arre=key.nextInt();
        int A[]=new int[arre];
         for(int i=0; i<A.length; i++){ //llenar las posiciones
            A[i]= (int)(1+Math.random()*1000); // aqui definimos el tamaño que tendra el arreglo creando numeros aleatorios
         }
       
        System.out.println("array A desordenado: "); // este es nuestro arreglo desordenado 
        for(int i=0; i<A.length; i++) 
            System.out.println( A[i] ); 
       
        boolean d;
        int aux;
       do{
           d=false;
           for(int i=0; i<A.length -1; i++){//el ciclo ira de 1 hasta el final del arreglo
               if(A[i]>A[i+1]){
                   aux=A[i]; // aux para almacenar el valor que se va a cambiar
                  A[i]= A[i+1]; //pasa el valor a la izquierda a la derecha
                  A[i+1]= aux; //pasa el valor de la derecha a la izquierda
                 d= true;
               }
           }   
       }while(d); // lee la variable boolean
     
       
        System.out.println("\nArray A ordenado: ");  // Imprimimos el arreglo ordenado.  
        for(int i=0; i<A.length; i++) 
            System.out.println( A[i] ); 
    }
    
}
