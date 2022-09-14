/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift2_9;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift2_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Skriv det svenska ordet!");
        Scanner scr = new Scanner(System.in);
        String svenska = scr.nextLine();
        System.out.println("Skriv det engelska ordet");
        String engelska = scr.nextLine();
        System.out.println("Det Svenska ordet " + svenska + " är " + engelska + " på Engelska.");
    }
    
}
