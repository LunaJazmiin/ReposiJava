/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;
public class Auto{
 /*
 * @author alumno
 */

    public static void main(String[] args) {
       autoP ferrari=new deportivo(); // heredacion de caracteristicas de la clase Auto
       autoP a=new PickUp(); 
      
       /*a.placa= "43Rtb6" no se puede realizar de esta manera 
       ya que la varible placa es publica por eso se le asigna
       valor por un metodo
       */ 
       a.setPlaca("43Rtb6");
       /*aqui si se permite porque la variable es publica*/
       a.VM = 1500;
        a.MT();
    }
}
