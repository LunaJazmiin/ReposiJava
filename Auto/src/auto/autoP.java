/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.util.Scanner;

/**
 *
 * @author lunaj
 */

public class autoP {
    //Declaracion de atributos
    private String placa;//variable privada tipo string
    private double Va;//velocidad actua
    public double VM;//velocidad maxima
    private double Vm;//velocidad minima
    private boolean es;//para estado.

    //constructor por defecto
    public autoP() {
        this.placa = "RD1234";
        this.Va = 0;
        this.VM = 150;
        this.Vm = 0;
        this.es = false;
    }
    
    
    
  

    //metodos set
    //para dar valor a placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    //para dar valor a la velocidad actual

    public void setVA(double Va) {
        this.Va = Va;
    }

    public void setVM(double VM) {
        this.VM = VM;
    }

    public void setVm(double Vm) {
        this.Vm = Vm;
    }

    public void setEs(boolean es) {
        this.es = es;
    }

    //metodos GET
    private String getPlaca() {
        return (this.placa);
    }

    protected  double getVA() {
        return (this.Va);
    }

    public double getVM() {
        return (this.VM);
    }

    public double getVm() {
        return (this.Vm);
    }

    public boolean getEs() {
        return (this.es);
    }

    //METODOS OPERACIONALES
    public String Des() {
        //para devolver el estado del auto
        if (getEs()) { //verifica si es tru o false
            return "ENCENDIDO";
        }
        return "APAGADO";
    }

    public void MsC(String mensaje) {
        //para formar el mensaje de salida por consola
        int largo = mensaje.length();
        int i;
        System.out.print("+");//para contorno de mensaje
        for (i = 1; i <= largo; i++) {
            System.out.print("-");
        }
        System.out.println("+");
        System.out.println("|" + mensaje + "|");//impresion del mensaje
        System.out.print("+");
        for (i = 1; i <= largo; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        System.out.println(" ");
        //termina el contorno del mensaje       
    }

    public void EA() {
        if (getEs()) {
            MsC("EL AUTO YA ESTABA ENCENDIDO");

        } else {
            setEs(true);
            MsC("EL AUTO HA SIDO ENCENDIDO CON EXITO");
        }
        MT();
    }
    public void AvA(){
        Scanner entrada=new Scanner(System.in);
        if (getEs()) {
            int cantidad;
            System.out.print("VELOCIDAD ACTUAL "+getVA() +"INGRESE LA CANTIDAD A AUMENTAR: ");
            cantidad=entrada.nextInt();
            setVA(getVA()+cantidad);
            MsC("VELOCIDAD ACTUAL="+getVA());
        }else{
            MsC("EL AUTO ESTA APAGADO");
        }
         MT();
    }
      public void Rv(){
        Scanner entrada=new Scanner(System.in);
        if (getEs()) {
            int cantidad;
            System.out.print("VELOCIDAD ACTUAL "+getVA() +"INGRESE LA CANTIDAD A DISMINUIR: ");
            cantidad=entrada.nextInt();
            setVA(getVA()-cantidad);
            MsC("VELOCIDAD ACTUAL="+getVA());
        }else{
            MsC("EL AUTO ESTA APAGADO");
        }
         MT();
    }
    public void MT(){
        String OP[]={"1.ENCENDER AUTO","2. AUMENTAR VELOCIDAD","3.REDUCIR VELOCIDAD",
            "4. MOSTRAR CONDICONES DEL AUTO","5. APAGAR AUTO","6.SALIR"};
        int opcion;
        do{
            
            System.out.println("******************************");
            System.out.println("* TABLERO DE COMANDO *");
            System.out.println("******************************");
            for(int i=0;i<6;i++){
                System.out.println(OP[i]);
            }
            Scanner entrada=new Scanner(System.in);        
        opcion=entrada.nextInt();
        switch(opcion){
            case 1:
                EA();
                break;
            case 2:
                AvA();
                break;
            case 3:
                Rv();
               break;
            case 4:
                mostrarDatos();
            break;
            case 5:
                setEs(false);
            break;
            case 6:
                       System.out.println("Gracias por utilizar el sistema");
                break;
            default:
                System.out.println("Opcion invalida, gracias por usar el sistema");
            break;
            
            
        }
            
        }while(opcion>1 && opcion<6);
        
                
    }
    public void mostrarDatos(){
        System.out.println(" Placa "+placa+" velocidad actual "+Va+" Velocidad Media "+VM+" Velocidad minima "+Vm+
                " Estado "+Des());
        MT();
    }
}    