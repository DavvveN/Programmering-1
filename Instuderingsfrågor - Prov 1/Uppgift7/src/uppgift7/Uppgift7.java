/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift7;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Matta in ett namn: ");
        Scanner scanner = new Scanner(System.in); 
        String namn = scanner.nextLine();
        
        int spaceLocation = namn.indexOf(" ");
        String lärarKod = namn.substring(0,1)+namn.charAt(spaceLocation + 1) + namn.charAt(namn.length() -1) + "";
        System.out.println(lärarKod.toUpperCase());
    }
    
}
