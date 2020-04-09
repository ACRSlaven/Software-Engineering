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
public class score{
    //Returns total score when player leaves or answers a question wrong
    public score(float bank) throws FileNotFoundException{
        if(bank == 100){
            bank -= 100;
            System.out.println("|   LEAVING WITH: $0.00   |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank <=300 && bank > 100){
            bank -= 100;
            System.out.println("|   LEAVING WITH:$" + bank + "0  |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank == 500){
            bank -= 200;
            System.out.println("|   LEAVING WITH:$300.00  |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank == 1000){
            bank = bank / 2;
            System.out.println("|  LEAVING WITH:$500.00   |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank > 1000 && bank <= 8000){
            bank = bank / 2;
            System.out.println("|  LEAVING WITH:$"+ bank +"0  |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank == 16000){
            bank = bank / 2;
            System.out.println("|  LEAVING WITH:$8000.00  |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank > 16000 && bank < 100000){
            bank = bank / 2;
            System.out.println("|  LEAVING WITH:$"+ bank +"0 |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank == 125000){
            bank -= 61000;
            System.out.println("| LEAVING WITH: $64000.00 |");
            fileIO fio = new fileIO(bank);
        }
        else if (bank >= 100000 && bank <= 1000000){
            bank = bank / 2;
            System.out.println("| LEAVING WITH:$"+ bank +"0 |");
            fileIO fio = new fileIO(bank);
        }
    }
}
