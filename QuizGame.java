/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;
import java.util.Scanner;
/**
 *
 * @author 16940734 & 17003679
 */
public class QuizGame {
    Scanner scan = new Scanner(System.in);
    private String input;
    private String name;
    
    public void Intro() throws InterruptedException, FileNotFoundException{ //Welcome message       
       System.out.println("Welcome to WHO WANTS TO BE A MILLIONAIRE!");
       sleep(500);
       System.out.print("Please enter your name > ");
       name = scan.nextLine();
       fileIO fio = new fileIO(name);
       sleep(500);
       System.out.print(fio.name + ", Ready to PLAY? (y/n)> ");
       input = scan.nextLine(); 
       rules r = new rules();
       r.rules();
    }
    
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        QuizGame qg = new QuizGame();
        questions q = new questions();
        rules r = new rules();
        qg.Intro();
        if(qg.input.equalsIgnoreCase("y") || qg.input.equalsIgnoreCase("yes")){
            r.simpleRules();
            q.questions();
        }
        else if(qg.input.equalsIgnoreCase("n") || qg.input.equalsIgnoreCase("no")){
            System.out.println("Are you sure? (y/n)");
            qg.input = qg.scan.nextLine();
            if(qg.input.equalsIgnoreCase("y") || qg.input.equalsIgnoreCase("yes")){
                r.simpleRules();
                q.questions();            
            }
            else if(qg.input.equalsIgnoreCase("n") || qg.input.equalsIgnoreCase("no")){
                System.out.println("Thanks for trying...");
            }
        }
        else{
            System.out.println("Invalid Input automatically ends Game Runtime");
        }
    }
    
}
