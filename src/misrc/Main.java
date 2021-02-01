package misrc;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] edad;
        
        System.out.print("Tamaño array : ");
        
        int longitud = entrada.nextInt();
        
        edad = new int[longitud];
        
        for (int i = 0; i<longitud; i++){
            System.out.print("Elemento " + (i+1) + ": ");
            edad[i] = entrada.nextInt();
        }
        
        for (int i = 0; i<longitud; i++){
            System.out.println("Elemento" + (i+1) + ": " + edad[i]);
        }
    }
    
}
