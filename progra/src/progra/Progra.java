/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;


import java.util.Scanner;
public class Progra {

    public static   float n1,n2,n3,sum,res,mul,div,resu; // variables tipos globales
    public static void main(String[] args) {
        menu();
     
     
     
       
        
      
    }
    public static void menu(){
        Scanner r= new Scanner(System.in);
        int an = 0;
        do{
        System.out.println("**************BIENVENIDO AL MENU**************");
        System.out.println("****Digite 1 para operadores aritmeticos  ****");
        System.out.println("****Digite 2 para condicionales           ****");
        System.out.println("****Digite 3 para ciclos                  ****");
        System.out.println("****Digite 4 para Arreglos                ****");
        System.out.println("****Digite 5 para Procedimientos          ****");
        System.out.println("****Digite 6 para salir                   ****");
        System.out.println("**********************************************");
        System.out.print("Ingrese opcion: ");
            an= r.nextInt();
        }while(an<=0||an>6); // que empezara de 0 hasta el 5, porque tenemos 5 opciones en el menu
        
        switch(an){// esto nos sirve para llamar a las demas funciones y agruparlas en un solo lugar
            case 1: 
                art();
            break;
            case 2:
                con();
            break;
            case 3:
                sw();
            break;
            case 4:
                s();
            break;
            case 5:
                d();
            break;
            default:
                break;
        }
        
        
    }
    public static void art(){
         Scanner entrada= new Scanner(System.in);
          
        System.out.println("Digite 3 numeros:  ");
            n1= entrada.nextFloat();
            n2= entrada.nextFloat();
            n3 = entrada.nextFloat();
            
     sum= n1+n2+n3;
     res= n1-n2-n3;
     mul= n1*n2*n3;
     div= n1/n2/n3;
     resu = n1 % n2 %n3;
     
     System.out.println("La suma es: "+sum);
        System.out.println("La resta es: "+res);
        System.out.println("La multiplicacion es: "+mul);
        System.out.println("La division es: "+div);
        System.out.println("El resultado es: "+res);
    menu();
    }
    public static void con(){
    if((n1>n2)&&(n2>n3)){  
        System.out.println("Orden: "+n1+"-"+n2+"-"+n3);
    }
     else if((n1>n3)&&(n3>n2)){
         System.out.println("Orden: "+n1+"-"+n3+"-"+n2);
     }
    }
        
        
        
   public static void sw(){
    Scanner n= new Scanner (System.in);
        float [] num= new float[5];
       System.out.println("Guardando los datos en el arreglo");
       
   for(int i =0; i<5; i++){
       System.out.println((i+1)+".Digite un numero: ");
        num[i]= n.nextFloat();
   }
       System.out.println("LOs elementos del arreglo son: ");
        for(float i:num){
            System.out.println(i);
        }
menu();
   } 
   
   
   public static void s(){
       Scanner t= new Scanner(System.in);
     int arreglo[]= new int[10];
     int ultimo;
     
       System.out.println("Llenar el arreglo: ");
        for(int i=0; i<10; i++){
            System.out.println((i+1)+".Digite un numero");
                arreglo[i]= t.nextInt();
        }
        ultimo = arreglo[9];
        
        for(int i=8; i>=0;i--){
            arreglo[i+1]= arreglo[i];
        }
        arreglo[0] = ultimo;
        System.out.println("\n El nuevo arreglo es: ");
            for(int i=0; i<10; i++){
                System.out.println((i+1)+".Numero: "+arreglo[i]);
            }
       menu();
   }
   public static void d(){
       Scanner y= new Scanner (System.in);
       int ni=0;
       
       System.out.println("Digite un numero: \n");
       
       ni= y.nextInt();
       
        if(ni%2==0){
        System.out.println("\nEl numero es par:  "+ni);
        }
        else{
           System.out.println("El numero es impar:  "+ni);
        }   
        menu();
   }
}    
