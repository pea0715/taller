/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio.pkg4;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           
            int n ;
            Scanner hi = new Scanner(System.in);
            System.out.println("Ingrese un Número: ");
            n = hi.nextInt();
            comprobar er = new comprobar();         
            
            System.out.println("El Resultado es: " + er.numero(n));
                
    }
 
}
