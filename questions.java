/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizgame;
import java.io.FileNotFoundException;
import static java.lang.Thread.sleep;
import java.util.Random;
/**
 *
 * @author 16940734 & 17003679
 */
public class questions extends QuizGame{
    Random rand = new Random();
    private String ans; //correct answer for each question
    private String input; //take in user's input
    private String lifeLine; //first choice of a 50/50 lifeline
    private String lifeLine2; //second choice of a 50/50 lifeline
    private boolean cont = false; //determines whether the game continues(true) or not(false)
    private boolean one = true; //show the first lifeline as long as it hasn't been used
    private boolean two = true; //show the second lifeline as long as it hasn't been used
    private boolean three = true; //show the third lifeline as long as it hasn't been used
    private int num; //a random number that chooses which question is used for each level
    public float score = 0f; //keeps score of player's progress through game
    
    public void questions () throws InterruptedException, FileNotFoundException{
        //go through each question as long as they are answered correctly - cont is true
        this.num = rand.nextInt(3)+1;
        one (this.num);
        if(this.cont == true){
            this.num = rand.nextInt(3)+1;
            two (this.num);
            if(this.cont == true){
                this.num = rand.nextInt(3)+1;
                three(this.num);
                if(this.cont == true){         
                    this.num = rand.nextInt(3)+1;
                    four(this.num);
                    if(this.cont == true){
                        this.num = rand.nextInt(3)+1;
                        five(this.num);
                        if(this.cont == true){                            
                            this.num = rand.nextInt(3)+1;
                            six(this.num);
                            if(this.cont == true){                            
                                this.num = rand.nextInt(3)+1;
                                seven(this.num);
                                if(this.cont == true){                            
                                    this.num = rand.nextInt(3)+1;
                                    eight(this.num);
                                    if(this.cont == true){                            
                                        this.num = rand.nextInt(3)+1;
                                        nine(this.num);
                                        if(this.cont == true){
                                            this.num = rand.nextInt(3)+1;
                                            ten(this.num);
                                            if(this.cont == true){
                                                this.num = rand.nextInt(3)+1;
                                                eleven(this.num);
                                                if(this.cont == true){
                                                    this.num = rand.nextInt(3)+1;
                                                    twelve(this.num);
                                                    if(this.cont == true){
                                                        this.num = rand.nextInt(3)+1;
                                                        thirteen(this.num);
                                                        if(this.cont == true){
                                                            this.num = rand.nextInt(3)+1;
                                                            fourteen(this.num);
                                                            if(this.cont == true){
                                                                this.num = rand.nextInt(3)+1;
                                                                fifteen(this.num);
    }}}}}}}}}}}}}}}
    
    public void one (int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nFirst Question for $100");
        this.score = 100f;
        switch(number){
            case 1:
                System.out.println("How many days are there in a Leap Year?\n" 
                    + "A. 364\n" + "B. 365\n" + "C. 366\n" + "D. 367");
                this.ans = "C";
                this.lifeLine = "B. 365";
                this.lifeLine2 = "C. 366";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("The design stamped on each side of an Oreo Cookie has how many flowers?\n" 
                    + "A. 8\n" + "B. 10\n" + "C. 12\n" + "D. 14");
                this.ans = "C";
                this.lifeLine = "B. 10";
                this.lifeLine2 = "C. 12";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Asante Sana Squash Banana is a song in which Disney Movie?\n"
                    +"A. The Jungle Book\n" + "B. The Lion King\n" + "C. Pocahontas\n" + "D. Dumbo");
                this.ans = "B";
                this.lifeLine = "A. The Jungle Book";
                this.lifeLine2 = "B. The Lion King";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void two(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nSecond Question for $200.00");
        this.score = 200f;
        switch(number){
            case 1:
                System.out.println("Who was the highest paid sportsperson in 2018?\n"
                    + "A. Roger Federer\n" + "B. Lionel Messi\n" + "C. Lebron James\n" 
                        + "D. Floyd Mayweather");
                this.ans = "D";
                this.lifeLine = "B. Lionel Messi";
                this.lifeLine2 = "D. Floyd Mayweather";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Who was the oldest man in the Bible - age 969?\n"
                    + "A. Noah\n" + "B. Methuselah\n" + "C. Abraham\n" + "D. Adam");
                this.ans = "B";
                this.lifeLine = "B. Methuselah";
                this.lifeLine2 = "D. Adam";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("What do you call a seven-sided polygon?\n" 
                    + "A. Decagon\n" + "B. Hexagon\n" + "C. Pentagon\n" + "D. Heptagon");
                this.ans = "D";
                this.lifeLine = "A. Decagon";
                this.lifeLine2 = "D. Heptagon";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void three(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nThird Question for $300.00");
        this.score = 300f;
        switch(number){
            case 1:
                System.out.println("Which 'planet' is the largest?\n"
                    + "A. Neptune\n" + "B. Sun\n" + "C. Jupiter\n" + "D. Saturn");
                this.ans = "C";
                this.lifeLine = "B. Sun";
                this.lifeLine2 = "C. Jupiter";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("How long was World War II?\n"
                    + "A. 3 years\n" + "B. 4 years\n" + "C. 5 years\n" + "D. 6 years");
                this.ans = "D";
                this.lifeLine = "B. 4 years";
                this.lifeLine2 = "D. 6 years";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Which famous Children's book has two characters named 'Tweedledee' and Tweedledum'?\n" 
                    + "A. Alice Through the Looking Glass by Lewis Carroll\n" 
                        + "B. Alice's Adventures in Wonderland by Lewis Carroll\n" 
                            + "C. Cat in the Hat by Dr Seuss\n" + "D. Matilda by Roald Dahl");
                this.ans = "A";
                this.lifeLine = "A. Alice Through the Looking Glass by Lewis Carroll";
                this.lifeLine2 = "\nB. Alice's Adventures in Wonderland by Lewis Carroll";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void four(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nFourth Question for $500.00");
        this.score = 500f;
        switch(number){
            case 1:
                System.out.println("Name the seventh planet from the Sun?\n"
                    + "A. Saturn\n" + "B. Jupiter\n" + "C. Uranus\n" + "D. Neptune");
                this.ans = "C";
                this.lifeLine = "C. Uranus";
                this.lifeLine2 = "D. Neptune";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("What kind of weapon is a 'falchion'?\n"
                    + "A. Axe\n" + "B. Crossbow\n" + "C. Gun\n" + "D. Sword");
                this.ans = "D";
                this.lifeLine = "C. Gun";
                this.lifeLine2 = "D. Sword";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("What is the diameter of Earth?\n" 
                    + "A. 8,000 miles\n" + "B. 8,025 miles\n" + "C. 7,920 miles\n" 
                        + "D. 7,900 miles");
                this.ans = "A";
                this.lifeLine = "A. 8,000 miles";
                this.lifeLine2 = "C. 7,920 miles";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void five(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nFifth Question for $1,000.00");
        this.score = 1000f;
        switch(number){
            case 1:
                System.out.println("What is the world's largest river?\n"
                    + "A. Nile River\n" + "B. Amazon River\n" + "C. Congo River\n" + "D. Parana River");
                this.ans = "B";
                this.lifeLine = "A. Nile River";
                this.lifeLine2 = "B. Amazon River";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Which chess piece can only move diagonally?\n"
                    + "A. King\n" + "B. Bishop\n" + "C. Pawn\n" + "D. Queen");
                this.ans = "B";
                this.lifeLine = "B. Bishop";
                this.lifeLine2 = "D. Queen";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("What does the 'F' in F.B.I abbreviate for?\n" 
                    + "A. Federated\n" + "B. Fusion\n" + "C. Federal\n" + "D. Federation");
                this.ans = "C";
                this.lifeLine = "A. Federated";
                this.lifeLine2 = "C. Federal";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void six(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nSixth Question for $2,000.00");
        this.score = 2000f;
        switch(number){
            case 1:
                System.out.println("What color is a Welsh Poppy?\n"
                    + "A. Orange\n" + "B. Red\n" + "C. Purple\n" + "D. Yellow");
                this.ans = "D";
                this.lifeLine = "B. Red";
                this.lifeLine2 = "D. Yellow";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("When is the Queen's Birthday?\n"
                    + "A. 3rd June\n" + "B. 4th June\n" + "C. 21st April\n" + "D. 31st May ");
                this.ans = "C";
                this.lifeLine = "B. 4th June";
                this.lifeLine2 = "C. 21st April";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("What does the term 'piano' mean?\n" 
                    + "A. To be played passionately\n" + "B. To be played wholly\n" 
                        + "C. To be played softly\n" + "D. To be played aggresively");
                this.ans = "C";
                this.lifeLine = "A. To be played passionately";
                this.lifeLine2 = "C. To be played softly";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void seven(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nSeventh Question for $4,000.00");
        this.score = 4000f;
        switch(number){
            case 1:
                System.out.println("What year did Albert Einstein die?\n"
                    + "A. 1949\n" + "B. 1952\n" + "C. 1955\n" + "D. 1960");
                this.ans = "C";
                this.lifeLine = "C. 1955";
                this.lifeLine2 = "D. 1960";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Which celestial body is the representation of Cronus?\n"
                    + "A. Neptune\n" + "B. Saturn\n" + "C. Earth\n" + "D. Mercury");
                this.ans = "B";
                this.lifeLine = "B. Saturn";
                this.lifeLine2 = "D. Mercury";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("In the Old Testament, who married his cousins Leah and Rachel?\n" 
                    + "A. Isaac\n" + "B. Esau\n" + "C. Benjamin\n" + "D. Jacob");
                this.ans = "D";
                this.lifeLine = "B. Esau";
                this.lifeLine2 = "D. Jacob";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void eight(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nEighth Question for $8,000.00");
        this.score = 8000f;
        switch(number){
            case 1:
                System.out.println("What does a potometer measure?\n"
                    + "A. Photosynthesis\n" + "B. Plant Reproduction\n" 
                        + "C. Germination\n" + "D. Transpiration");
                this.ans = "D";
                this.lifeLine = "C. Germination";
                this.lifeLine2 = "D. Transpiration";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("The currents of which Ocean creates the El Nino Effect?\n"
                    + "A. Artic\n" + "B. Atlantic\n" + "C. Pacific\n" + "D. Indian");
                this.ans = "C";
                this.lifeLine = "C. Pacific";
                this.lifeLine2 = "D. Indian";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Who won the most Academy Awards?\n" 
                    + "A. James Cameron\n" + "B. Walt Disney\n" + "C. Katherine Hepburn\n" 
                        + "D. Steven Spielberg");
                this.ans = "B";
                this.lifeLine = "B. Walt Disney";
                this.lifeLine2 = "D. Steven Spielberg";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void nine(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nNinth Question for $16,000.00");
        this.score = 16000f;
        switch(number){
            case 1:
                System.out.println("What is the body of water that borders Greece, Turkey and Southern Italy?\n"
                    + "A. Black Sea\n" + "B. Aegan Sea\n" + "C. Mediterranean Sea\n" + "D. Red Sea");
                this.ans = "B";
                this.lifeLine = "B. Aegan Sea";
                this.lifeLine2 = "C. Mediterranean Sea";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("In which Canadian province is Montreal located?\n"
                    + "A. Quebec\n" + "B. Vancouver\n" + "C. Ontario\n" + "D. Nova Scotia");
                this.ans = "A";
                this.lifeLine = "A. Quebec";
                this.lifeLine2 = "D. Nova Scotia";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Who was married to Alexander Hamilton?\n" 
                    + "A. Abigail Smith\n" + "B. Elizabeth Bowen\n" + "C. Elizabeth Schuyler\n" 
                        + "D. Martha Dandridge");
                this.ans = "C";
                this.lifeLine = "B. Elizabeth Bowen";
                this.lifeLine2 = "C. Elizabeth Schuyler";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void ten(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nTenth Question for $32,000.00");
        this.score = 32000f;
        switch(number){
            case 1:
                System.out.println("In the children's book series 'Where is Paddington Bear' originally from?\n"
                    + "A. Canada\n" + "B. Iceland\n" + "C. India\n" + "D. Peru");
                this.ans = "D";
                this.lifeLine = "A. Canada";
                this.lifeLine2 = "D. Peru";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Which of the following men does not have a chemical element named for him?\n"
                    + "A. Niels Bohr\n" + "B. Enrico Fermi\n" + "C. Albert Einstein\n" 
                        + "D. Issac Newton");
                this.ans = "D";
                this.lifeLine = "B. Enrico Fermi";
                this.lifeLine2 = "D. Isaac Newton";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("The term 'Nephelococcygia' is the practice of doing what?\n" 
                    + "A. Sleeping with your eyes open\n" + "B. Breaking glass with your voice\n" 
                        + "C. Finding shapes in clouds\n" + "D. Swimming in freezing water");
                this.ans = "C";
                this.lifeLine = "B. Breaking glass with your voice";
                this.lifeLine2 = "C. Finding shapes in clouds";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void eleven(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nEleventh Question for $64,000.00");
        this.score = 64000f;
        switch(number){
            case 1:
                System.out.println("Which First Lady was a ninth generation descendant of Pocahontas?\n"
                    + "A. Edith Wilson\n" + "B. Helen Taft\n" + "C. Mamie Eisenhower\n" 
                        + "D. None of the above");
                this.ans = "A";
                this.lifeLine = "A. Edith Wilson";
                this.lifeLine2 = "D. None of the above";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Which of the following landlocked countries is entirely contained within another country?\n"
                    + "A. Burkina Faso\n" + "B. Mongolia\n" + "C. Luxembourg\n" 
                        + "D. Lesotho");
                this.ans = "D";
                this.lifeLine = "C. Luxembourg";
                this.lifeLine2 = "D. Lesotho";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Who did artist Grant Wood use as the model for the farmer in the 'American Gothic'?\n" 
                    + "A. Travelling Salesman\n" + "B. His Dentist\n" + "C. Local Sheriff\n" 
                        + "D. His Butcher");
                this.ans = "B";
                this.lifeLine = "B. His Dentist";
                this.lifeLine2 = "C. His Butcher";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void twelve(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nTwelfth Question for $125,000.00");
        this.score = 125000f;
        switch(number){
            case 1:
                System.out.println("The famous 'Uncle Sam' was based on Sam Wilson, who worked during the War as a?\n"
                    + "A. Mail Deliverer\n" + "B. Historian\n" + "C. Meat Inspector\n" 
                        + "D. Weapons Mechanic");
                this.ans = "C";
                this.lifeLine = "C. Meat Inspector";
                this.lifeLine2 = "D. Weapons Mechanic";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("'Globophobia' is the fear of?\n"
                    + "A. Water\n" + "B. Balloons\n" + "C. Lollipops\n" + "D. Snow Globes");
                this.ans = "B";
                this.lifeLine = "B. Balloons";
                this.lifeLine2 = "D. Snow Globes";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Who is credited with inventing the first mass-produced helicopter?\n" 
                    + "A. Igor Sikorsky\n" + "B. Ferdinand von Zeppelin\n"
                        + "C. Elmer Sperry\n" + "D. Gottlieb Daimler");
                this.ans = "A";
                this.lifeLine = "A. Igor Sikorsky";
                this.lifeLine2 = "B. Ferdinand von Zepplin";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void thirteen(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nThirteenth Question for $250,000.00");
        this.score = 250000f;
        switch(number){
            case 1:
                System.out.println("Which of these words mean 'wickedness'?\n"
                    + "A. Topography\n" + "B. Turpitude\n" + "C. Torpidity\n" + "D. Terpsichorean");
                this.ans = "B";
                this.lifeLine = "B. Turpitude";
                this.lifeLine2 = "D. Terpsichorean";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Name the number that is three more than one-fifth of one-tenth of one-half of 5,000?\n"
                    + "A. 103\n" + "B. 503\n" + "C. 53\n" + "D. 108");
                this.ans = "C";
                this.lifeLine = "A. 103";
                this.lifeLine2 = "C. 53";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Which British King was married to Eleanor of Aquitane?\n" 
                    + "A. Henry I\n" + "B. Richard I\n" + "C. Richard II\n" 
                        + "D. Henry V");
                this.ans = "C";
                this.lifeLine = "B. Richard I";
                this.lifeLine2 = "C. Richard II";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void fourteen(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nFourteenth Question for $500,000.00");
        this.score = 500000f;
        switch(number){
            case 1:
                System.out.println("If you were to plant the seeds of 'Quercus robur' what would grow?\n"
                    + "A. Flowers\n" + "B. Trees\n" + "C. Vegetables\n" + "D. Grain");
                this.ans = "B";
                this.lifeLine = "B. Trees";
                this.lifeLine2 = "C. Vegetables";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Who was the ancient Greek god of dreams?\n"
                    + "A. Hypnos\n" + "B. Orion\n" + "C. Pasithea\n" + "D. Morpheus");
                this.ans = "D";
                this.lifeLine = "A. Hypnos";
                this.lifeLine2 = "D. Morpheus";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Ombudsman is a word derived from what language?\n" 
                    + "A. Swedish\n" + "B. Scottish\n" + "C. Old English\n" 
                        + "D. Norwegian");
                this.ans = "A";
                this.lifeLine = "A. Swedish";
                this.lifeLine2 = "D. Norwegian";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void fifteen(int number) throws InterruptedException, FileNotFoundException{
        System.out.println("\nFinal Question for One Million Dollars!!!");
        this.score = 1000000f;
        switch(number){
            case 1:
                System.out.println("'Pteronophobia' is the fear of what?\n"
                    + "A. Dinosaurs\n" + "B. Feathers\n" + "C. House Pets\n" 
                        + "D. Vulnerability");
                this.ans = "B";
                this.lifeLine = "B. Feathers";
                this.lifeLine2 = "Vulnerability";
                this.input = scan.nextLine();
                check(input);
                return;
            case 2:
                System.out.println("Which philosopher of science wrote the 'Against Method'?\n"
                    + "A. Aristotle\n" + "B. Emma Goldman\n" + "C. Paul Feyerabend\n" 
                        + "D. Plato");
                this.ans = "C";
                this.lifeLine = "B. Emma Goldman";
                this.lifeLine2 = "C. Paul Feyerabend";
                this.input = scan.nextLine();
                check(input);
                return;
            case 3:
                System.out.println("Neurologists believe that the brain's medial ventral prefrontal cortex\n"
                    + "is activated when you do what?\n" + "A. Get a joke\n" 
                        + "B. Have a panic attack\n" + "C. Listen to music\n" 
                            + "D. Remember a name");
                this.ans = "A";
                this.lifeLine = "A. Get a joke";
                this.lifeLine2 = "B. Remember a name";
                this.input = scan.nextLine();
                check(input);
        }
    }
    public void check(String ans) throws InterruptedException, FileNotFoundException{ //checks user's input
        if (ans.equalsIgnoreCase("E")){ //if the user enters E - this ends the game
            this.cont = false;
            leaveGame lG = new leaveGame(this.score);
        }
        else if (ans.equalsIgnoreCase("L")){ //if the user enters L - this presents them with lifelines
            lifeLine(this.lifeLine, this.lifeLine2);
        }
        else if (this.ans.equalsIgnoreCase(ans)){ //if the user enters a correct answer - score is banked
            this.cont = true; //continue game
            sleep(1000);//adds pause for second
            System.out.println("+-------------------------+");
            System.out.println("|         CORRECT         |");
            bank b = new bank(this.score); //inputs score into bank method
            System.out.println("+-------------------------+");
        }
        else{ //if the user enters a wrong or invalid answer - player leaves with what they currently have in bank
            this.cont = false; //end game
            sleep(1000);
            System.out.println("+-------------------------+");
            System.out.println("|        INCORRECT        |");
            System.out.println("| Thank you for playing.. |");
            score s = new score(this.score); //inputs score into score method
            System.out.println("+-------------------------+");
        }
    }
    public void lifeLine(String lifeLine, String lifeLine2) throws InterruptedException, FileNotFoundException{
        String strOne = "50/50"; //lifeline option one
        String strTwo = "Ask the Audience"; //lifeline option two
        String strThree = "Phone a Friend"; //lifeline option three
        int userInput; //takes in user's lifeline choice
        
        System.out.println("LIFELINES");
        if(one == true){ //view option one if it hasn't been used during game
            System.out.println("1. "+ strOne);
        }
        if(two == true){ //view option two if it hasn't been used during game
            System.out.println("2. " + strTwo);
        }
        if (three == true){ //view option three if it hasn't been used during game
            System.out.println("3. " + strThree);
        }
        if(one == false && two == false && three == false){ //return message if user has used all options
            System.out.println("ERROR!");
            System.out.println("You've already used up all your lifelines");
            System.out.print("Input Final Answer > ");
            this.input = scan.nextLine();
            check(this.input);
            return;
        }
        userInput = scan.nextInt();
        switch (userInput){ //switch through user's option choice
            case 1: //50/50 - removes two wrong answers
                if(one == true){
                    this.one = false;
                    System.out.println(lifeLine + "   " + lifeLine2);
                    this.input = scan.nextLine();this.input = scan.nextLine();
                    check(input);
                }
                else{//if the user tries to input option 1 but has been used already
                    System.out.println("Invalid Input!");
                    System.out.print("Input Final Answer > ");
                    this.input = scan.nextLine();this.input = scan.nextLine();
                    check(input);
                }
                return;
            case 2: //Ask Audience - presents user with a randomized answer
                if(two == true){
                    this.two = false;
                    int choice = rand.nextInt(4)+65;
                    System.out.println("Audience Poll shows: " + (char)choice + " is the correct answer");
                    this.input = scan.nextLine();this.input = scan.nextLine();
                    check(input);
                }
                else{//if the user tries to input option 2 but has been used already
                    System.out.println("Invalid Input!");
                    System.out.print("Input Final Answer > ");
                    this.input = scan.nextLine();this.input = scan.nextLine();
                    check(this.input);
                }
                return;
            case 3: //Ask Friend - presents user with a randomized answer
                if(three == true){
                    this.three = false;
                    int choice = rand.nextInt(4)+65;
                    System.out.println("Your Friend suggests: " + (char)choice + " is the correct answer");
                    this.input = scan.nextLine();this.input = scan.nextLine();
                    check(this.input);
                }
                else{//if the user tries to input option 3 but has been used already
                    System.out.println("Invalid Input!");
                    System.out.print("Input Final Answer > ");
                    this.input = scan.nextLine();this.input = scan.nextLine();
                    check(this.input);
                }}
    }
    
}
