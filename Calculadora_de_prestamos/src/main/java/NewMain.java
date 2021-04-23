/**
 *
 * @author eduardo.hernandez
 */

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        int porcentaje;

        System.out.println("Ingresa la cantidad de prestamo:");
        amount = scanner.nextInt();
        
        System.out.println("Aquí está el calendario de pagos mensuales:");
        for(int i=1;i<4;i++){
            System.out.println("Mes "+i);
            porcentaje = (amount*10)/100;
            System.out.println("Pago: 10% de " +amount + " = " +porcentaje);
            amount -= porcentaje;
            System.out.println("Cantidad Restante: "+amount);
            
        }       

    }

}
