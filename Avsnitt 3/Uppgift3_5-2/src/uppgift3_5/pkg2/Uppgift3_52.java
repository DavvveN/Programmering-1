/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift3_5.pkg2;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift3_52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Skriv ditt förnamn och efternamn");
        Scanner scanner = new Scanner(System.in); 
        String namn = scanner.nextLine();
        
        String användarNamn = namn.substring(0,2) + namn.substring(namn.indexOf(" "), namn.indexOf(" ") + 3).trim();
        
        
        System.out.println(användarNamn);

    }
    
}
