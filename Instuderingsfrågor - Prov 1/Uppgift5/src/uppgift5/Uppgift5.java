/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift5;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double år = scanner.nextDouble(); 
        System.out.println("Månader: "+ (int)år * 12);
        System.out.println("Dagar: " + år *365);

    }
    
}
