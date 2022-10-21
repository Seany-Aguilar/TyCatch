
package EjercicioClase;

/* @author BETTERLEE*/
 
public class Division {
    
    private final double n1, n2;
    private double n3;
    public Division ( double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void realizarDiv(){
        n3 = n1 /n2;
        System.out.println("El resultado de la division es:  " + n3);
    }
    
}
