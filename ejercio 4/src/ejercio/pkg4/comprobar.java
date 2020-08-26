/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio.pkg4;

/**
 *
 * @author pablo
 */
public class comprobar {
    public int numero(int n )
    {
    if(n < 10 )
    {
        return n;
    }
    else 
    {
        int r = n % 10 + n /10;
        return numero(r); 
    }
    }
}
