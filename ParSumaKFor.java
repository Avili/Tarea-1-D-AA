/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parsumak2;

/**
 *
 * @author avili
 */
public class ParSumaKFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] arreglo = {1,2,3,4,5,6,7,8,9,10};
        int K = 7;
        boolean encontrado = false;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] + arreglo[j] == K) {
                    System.out.println("Par encontrado: " + arreglo[i] + " + " + arreglo[j] + " = " + K);
                    encontrado = true;
                    
                }
            }//break;
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún par que sume " + K);
        }


    }
    
}
