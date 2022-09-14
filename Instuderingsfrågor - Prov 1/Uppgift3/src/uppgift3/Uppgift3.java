/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift3;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Skriv text med 10 karaktärer");
        String text = scanner.nextLine();
        System.out.println(text.substring(2,8));
    }
    
}
