/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author 16940734 & 17003679
 */
public class rules extends QuizGame{
    /*Rules set for the game*/
    PrintStream stream1 = System.out;
    public void rules() throws InterruptedException, FileNotFoundException{
        File aFile=new File("Rules.txt");
        PrintStream stream2 = new PrintStream(new FileOutputStream(aFile));
        System.setOut(stream2);
        System.out.println("+--------------------------------------------+");
        System.out.println("|               RULES FOR YOU                |");
        System.out.println("|> You will be asked a series of 15 questions|");
        System.out.println("|  - these questions will vary in degrees of |");
        System.out.println("|  difficulties (5 levels of difficulty)     |");
        System.out.println("|> Presented with these questions are four   |");
        System.out.println("|  multiple choice answers, you just have to |");
        System.out.println("|  choose which one suits best - with every  |");
        System.out.println("|  question you answer correctly, you move   |");
        System.out.println("|  one counter closer to winning 'ONE MILLION|");
        System.out.println("|  DOLLARS!'                                 |");
        System.out.println("|> You can either choose to;                 |");
        System.out.println("|  1. Answer the question - though if you    |");
        System.out.println("|  answer it incorrectly, you will leave the |");
        System.out.println("|  game with what you currently have in bank |");
        System.out.println("|  2. Leave the game - if at any time you    |");
        System.out.println("|  choose to leave the game - you will also  |");
        System.out.println("|  be able to leave with what you currently  |");
        System.out.println("|  have in your bank.                        |");
        System.out.println("|  - input E to leave the game               |");
        System.out.println("|  3. Play one of your three available       |");
        System.out.println("|  lifeline options                          |");
        System.out.println("|> LIFELINE - If you do choose to answer the |");
        System.out.println("|  question but not sure if your answer is   |");
        System.out.println("|  correct, there are lifelines available    |");
        System.out.println("|  for you to use. NOTE: lifelines can only  |");
        System.out.println("|  be used once per game.                    |");
        System.out.println("|  - input L for Lifeline options            |");
        System.out.println("|   a. 50/50 - two wrong answers will be     |");
        System.out.println("|            removed from the choices        |");
        System.out.println("|   b. Ask the Audience - a poll will be     |");
        System.out.println("|            taken by the audience and the   |");
        System.out.println("|            most likely answer will be given|");
        System.out.println("|            again it is your choice whether |");
        System.out.println("|            to go with the opinion or not   |");
        System.out.println("|   c. Phone a Friend - you will be provided |");
        System.out.println("|            with an answer(right or wrong)  |");
        System.out.println("|            you will have the last say to   |");
        System.out.println("|            either choose what is given or  |");
        System.out.println("|            decide on a different answer    |");
        System.out.println("|                                            |");
        System.out.println("|            NOW BACK TO THE GAME            |");
        System.out.println("|            GOOD LUCK QUIZ WHIZ             |");
        System.out.println("+--------------------------------------------+");
        System.setOut(stream1);
    }
    public void simpleRules(){ //other options a user can use
        System.out.println("Enter E to Escape Game\n"
                + "Enter L to view Lifeline Options");
    }
}
