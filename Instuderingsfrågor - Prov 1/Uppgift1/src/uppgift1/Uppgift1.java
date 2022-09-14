/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift1;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("skriv vikt ");
        double vikt = scanner.nextDouble();
        System.out.println("skriv längd");
        double längd = scanner.nextDouble();
         
        System.out.println("BMI: " + vikt/(längd * längd));
        
    }
    
}
