/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Alexia Slaven
 */
public class Demo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] intArray = new int[10];
        
        System.out.println("Insert " + intArray.length + " int values");
        for(int index = 0; index < intArray.length; index++){
            int num = scan.nextInt();
            intArray[index] = num;
        }
        for(int in = 0; in < intArray.length; in++){
            System.out.println("@" + in + ". " + intArray[in]);
        }
    }
    
}
