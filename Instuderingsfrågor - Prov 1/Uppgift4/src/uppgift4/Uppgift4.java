/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift4;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Skriv ditt fulla namn");
        Scanner scanner = new Scanner(System.in);
        String namn = scanner.nextLine();
        int spaceIndex = namn.indexOf(" "); 
        System.out.println("Förnamn: " + namn.substring(0,spaceIndex));
        System.out.println("Efternamn: " + namn.substring(spaceIndex+1, namn.length()) );
    }
    
}
