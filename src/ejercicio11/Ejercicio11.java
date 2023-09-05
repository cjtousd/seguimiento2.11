
package ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, mayor;
        System.out.println("Ingrese primer numero");
        n1 = entrada.nextInt();
        System.out.println("Ingrese segundo numero");
        n2 = entrada.nextInt();
        System.out.println("Ingrese tercer numero");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else if (n2 > n3) {
                mayor = n2;
            } else {
                mayor = n3;
            }
    System.out.println("El mayor entre " + n1 + ", " + n2 + " Y " + n3 + " es: " + mayor);    
    }
}        

