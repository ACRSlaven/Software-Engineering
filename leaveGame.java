/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;

import java.io.FileNotFoundException;

/**
 *
 * @author 16940734 & 17003679
 */
public class leaveGame extends questions{
    //message shown if user decides to escape the game
    public leaveGame(float score) throws FileNotFoundException{
        System.out.println("+-------------------------+");
        System.out.println("|  Thank you for playing  |");
        System.out.println("| CONGRATS for making it  |");
        System.out.println("|        this far         |");
        System.out.println("| But for you, your time  |");
        System.out.println("|  on WHO WANTS TO BE A   |");
        System.out.println("|  MILLIONAIRE has ENDED  |");
        score s = new score(score);
        System.out.println("+-------------------------+");
    }
    
}
