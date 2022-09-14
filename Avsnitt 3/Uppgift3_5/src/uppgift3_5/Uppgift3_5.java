/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift3_5;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Vilket number av dag är det idag? Måndag - 1, Tisdag - 2 ...");
        Scanner scanner = new Scanner(System.in); 
        
        int dagNumber = scanner.nextInt(); 
        
        System.out.println("Om hur många dagar vill du ta reda på vilken dag det är?");
        int dagarFram = scanner.nextInt();
        int dag = ((dagarFram %7)+dagNumber)%7;
        System.out.println("Det kommer vara den " + dag + " dagen");
    }
    
}
