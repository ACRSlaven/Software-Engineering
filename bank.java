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
public class bank{
    //Takes score and adds it to the user's bank
    public bank(float bank) throws FileNotFoundException{
        if (bank >= 100 && bank <= 500){
            System.out.println("|   BANKING CASH:$" + bank + "0  |");
        }
        else if (bank >= 1000 && bank <= 8000){
            System.out.println("|  BANKING CASH:$"+ bank +"0  |");
        }
        else if (bank >= 16000 && bank <= 64000){
            System.out.println("|  BANKING CASH:$"+ bank +"0 |");
        }
        else if (bank >= 100000 && bank <= 500000){
            System.out.println("| BANKING CASH:$"+ bank +"0 |");
        }
        else if(bank == 1000000){ //Congratulations message for Million Dollar winners
            System.out.println("|      YOU DID IT!!!      |");
            System.out.println("| CONGRATULATIONS YOU WON |");
            System.out.println("|   ONE MILLION DOLLARS   |");
            System.out.println("|  YOU'RE A MILLIONAIRE!  |");
        }
        fileIO fio = new fileIO(bank);
    }
}
