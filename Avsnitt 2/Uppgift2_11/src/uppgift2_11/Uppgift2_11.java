/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift2_11;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift2_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("gib money!");
        Scanner scanner = new Scanner(System.in); 
        
        int amountOfMoney = scanner.nextInt();
        
        System.out.println(amountOfMoney/500);
        System.out.println((amountOfMoney%500)/200);
        System.out.println(((amountOfMoney%500)%200)/100);
        System.out.println((((amountOfMoney%500)%200)%100)/50);
        System.out.println(((((amountOfMoney%500)%200)/100)%50)/20);
    }
    
}
