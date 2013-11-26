package jnr.hellogithub;
/**
 *
 * @author Jnr
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Hola GitHub");
        
        int a = 15, b = 20;
        
        System.out.println("La suma es: " + suma(a,b));
        
        Resta objetoResta = new Resta();
        
        objetoResta.cantidad1 = 20;
        objetoResta.cantidad2 = 5;
        
        System.out.println("La resta es: " + objetoResta.resta());
    }
    
    public static int suma(int a, int b){
        return a+b;
    }
}
