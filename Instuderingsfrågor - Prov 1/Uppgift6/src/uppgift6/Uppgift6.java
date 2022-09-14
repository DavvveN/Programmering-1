/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uppgift6;

import java.util.Scanner;

/**
 *
 * @author david.nilsson
 */
public class Uppgift6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Skriv ditt person number!");
        Scanner scanner = new Scanner(System.in);
        String personNummer = scanner.nextLine();
        
        String formateratPersonNummer = personNummer.substring(0,personNummer.length() -4) + "-" + personNummer.substring(personNummer.length()-4);
        System.out.println(formateratPersonNummer);
    }
    
}
