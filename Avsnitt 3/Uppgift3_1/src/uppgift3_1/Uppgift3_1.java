/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift3_1;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Skriv ett tal!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        System.out.println(((((number+1)*2)-6)/2)+3 - number);
        
    }
    
}
