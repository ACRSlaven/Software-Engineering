/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softeng;
import java.util.Scanner;
/**
 *
 * @author Alexia Slaven
 */
public class Demo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;
        System.out.print("Please input a positive number > ");
        userInput = scan.nextInt();
        
        while(userInput < 0){
            System.out.println("ERROR! User input invalid!");
            System.out.print("Please input a positive number > ");
            userInput = scan.nextInt();
        }
        
        if(userInput > 1){
            System.out.println("List of Odd Numbers below " + userInput);
            for(int oddNum = 1; oddNum < userInput; oddNum += 2){
                System.out.println(oddNum);
            }
            System.out.println("Sum of Even Numbers below " + userInput);
            int sum = 0;
            for(int evenNum = 0; evenNum < userInput; evenNum += 2){
                sum += evenNum;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("no odd numbers found");
            System.out.println("no even numbers found");
        }
    }
    
}
