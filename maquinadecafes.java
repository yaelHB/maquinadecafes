import java.util.Scanner;
 
public class MaquinaCafe {
     
    private static final Scanner teclado = new Scanner(System.in); 
     
    public static void main(String[] args) {
         
        final int PRECIO = 45;
        int pesos;
         
        do {
            System.out.print("\nCantidad introducida: ");
            pesos = teclado.nextInt();
            if(pesos<PRECIO){
                System.out.println("Cantidad insuficiente.");
            }
        } while (pesos<PRECIO);
         
        if(pesos==PRECIO){
            System.out.println("Has introducido la cantidad exacta.");
        } else {
            pesos -= PRECIO;
            System.out.printf("%nEl cambio a devolver es el siguiente:");
            if(pesos/200>0){
                System.out.printf("%nMonedas de 2 pesos: %d", pesos/200);
                pesos %= 200;
            }
            if(pesos/100>0){
                System.out.printf("%nMonedas de 1 pesos: %d", pesos/100);
                pesos %= 100;
            }
            if(pesos/50>0){
                System.out.printf("%nMonedas de 50 pesos: %d", pesos/50);
                pesos %= 50;
            }
            if(pesos/20>0){
                System.out.printf("%nMonedas de 20 pesos: %d", pesos/20);
                pesos %= 20;
            }
            if(pesos/10>0){
                System.out.printf("%nMonedas de 10 pesos: %d", pesos/10);
                pesos %= 10;
            }
            if(pesos/5>0){
                System.out.printf("%nMonedas de 5 pesos: %d", pesos/5);
                pesos %= 5;
            }
            if(pesos/2>0){
                System.out.printf("%nMonedas de 2 pesos: %d", pesos/2);
                pesos %= 2;
            }
            if(pesos>0){
                System.out.printf("%nMonedas de 1 pesos: %d", pesos);
            }
        }
        System.out.printf("%n%nGracias por su compra"); 
    }
}
