/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift2_8;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Skriv bas och höjd: ");
        Scanner scanner = new Scanner(System.in); 
        int bas = scanner.nextInt();
        int höjd = scanner.nextInt();
        System.out.println((bas + 0.0) * höjd/2);
        
    }
    
}
