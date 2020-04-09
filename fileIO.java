/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author 16940734 & 17003679
 */
public class fileIO extends QuizGame{ //shows player their results
    public String name = "Player";
    private float scored;
    private PrintWriter output = new PrintWriter(new FileOutputStream("Results.txt"));
    
    public fileIO(float score) throws FileNotFoundException{
        this.scored = score;
        output.println("Results from Game");
        output.println(this.name + " - $" + scored + "0");
        output.println("GREAT JOB");
        output.close();
    }
    fileIO(String name) throws FileNotFoundException{
        this.name = name;
        
    }
}
