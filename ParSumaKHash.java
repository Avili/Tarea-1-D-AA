/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parsumak;

/**
 *
 * @author avili
 */
import java.util.HashSet;

public class ParSumaKHash {
    public static void main(String[] args) {
        
        // Arreglo base
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        
        // Valor objetivo
        int k = 8;

        boolean encontrado = false;
        HashSet<Integer> complementos = new HashSet<>();

        for (int num : A) {
            int complementoNecesario = k - num;

            if (complementos.contains(num)) {
                System.out.println("par encontrado: " + num + " + " + complementoNecesario + " = " + k);
                encontrado = true;
                break;
            }

            complementos.add(complementoNecesario);
        }

        if (!encontrado) {
            System.out.println("No existe ningún par que sume " + k);
        }
    }
}
