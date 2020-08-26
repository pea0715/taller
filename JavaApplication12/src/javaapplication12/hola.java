

package javaapplication12;

/**
 *
 * @author pablo
 */
public class hola {
    public boolean comprovar(int[] a , int reptificar , int i){   
        if (a[i] == reptificar )
        {
            return true;
        }
        else if (i == a.length - 1)
        {
            return false;
        }
        else
        {
             
           return comprovar( a , reptificar , i+1); 
    
        }
    }

    
}
