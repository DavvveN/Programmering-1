/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift2;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Uppgift2();
    }
    
    public Uppgift2(){
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Skriv ett tal: ");
        double tal = scanner.nextDouble();
        System.out.println(tal * tal);
    }
    
}
