/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift3_2;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Skriv ett antal sekunder");
        Scanner scanner = new Scanner(System.in);
        
        int sekunder = scanner.nextInt();
        System.out.println(sekunder/60 + " minuter och " + sekunder % 60 + " sekunder");
    }
    
}
