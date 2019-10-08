/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author DRAGON
 */
public class PBO210118066Latihan30Cakep {
    
    public static final String RESET = "\u001B[0m";
    public static final String WHITE = "\u001B[37m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println(RED + "Kamu " + GREEN + "Ngerjain Sendiri"
                + YELLOW + " Latihan 17 sampe"+ BLUE + " Latihan 30 ini?");
        System.out.print(BLUE + "Jawab" + RED + "(Yoi/Enggak) : " + RESET);
        String jawab = scanner.next();
        System.out.println(" ");
        if (jawab.equals("Yoi")){
            System.out.println(RED +"Cakep Bener. " + MAGENTA + "Good Job");
        }else {
            System.out.println(RED + "Tetep Cakep Sih.");
            System.out.println(CYAN + "Sing penting paham konsep nya yee.");
            System.out.println(RESET + "Keep the code works dude");
        }
    }
    
}
