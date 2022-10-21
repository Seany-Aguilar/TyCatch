

package EjercicioClase;

import java.util.Scanner;

/*@author BETTERLEE*/
 
public class Catch_Try {
    
    private static double n1, n2, n3;
    private static boolean error;

    public static void main(String[] args) {
        Division div;
        error = false;
        Scanner r = new Scanner(System.in);
        n1 = r.nextDouble();
        System.out.println("Ingresa un segundo numero");
        n2 = r.nextDouble();
        div = new Division(n1, n2);
        div.realizarDiv();
        
        try{
            System.out.println("");
        }catch(Exception e){
            error = true;
            System.out.println("Ocurrio un error " + e);
        }finally {
            if (error = true)
                System.out.println("Hubo una excepcion para ejecutar el codigo");
            else
                System.out.println("El codigo se ejecuto satisfactoriamente");
        }
        
    }
}
