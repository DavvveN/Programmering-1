/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift8;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matta in namn: ");
        
        String namn = scanner.nextLine();
        
        int spaceLocation = namn.indexOf(" ");
        String kthNamn = namn.charAt(0) + namn.substring(spaceLocation,spaceLocation+3);
        System.out.println(kthNamn.toLowerCase().replace(" ", ""));
        
    }
    
}
