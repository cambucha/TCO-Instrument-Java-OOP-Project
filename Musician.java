import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Musician {

    public static void main(String[] args) throws IOException{

        //data members
        String musicianCollect = ""; //string of all musician info from csv

        //gets the csv file
        File inFile = new File("TCOMusicians.csv");
        Scanner fileScanner = new Scanner(inFile);

        //loop to pull in all text from csv into string
        while (fileScanner.hasNext()) {
            musicianCollect += fileScanner.nextLine();
            musicianCollect += ",";//add comma to split correctly
        }

        //objects for questions
        TCOInstrument brassQuestion = new Brass(musicianCollect);
        TCOInstrument woodwindQuestion = new Woodwind(musicianCollect);
        TCOInstrument violinPlayerNames = new Strings(musicianCollect);
        TCOInstrument percussionQuestion = new Percussion(musicianCollect);

        //for user input
        Scanner userInput = new Scanner(System.in);
        int chosenNumber = -1;

        //loop for user selection
        while(chosenNumber != 0){

            System.out.println("Choose your question (or press 0 to exit): " + "\n1: What is the number of brass players who like spicy food?" +
                    "\n2: Which string players want to play a brass instrument?" + "\n3: What is a violin, and who plays it?" +
                    "\n4: How many timpani players are there, and what are their favorite card games?");
            chosenNumber = userInput.nextInt();

            if(chosenNumber == 1){
                System.out.println("The number of brass players who like spicy food is: " + ((Brass) brassQuestion).returnBrassNumber() + "\n");
                ((Brass) brassQuestion).initCount(0);//sets count back to zero after it is used
            }

            if(chosenNumber == 2){
                ArrayList<String> woodwindQuestionArray = new ArrayList();
                woodwindQuestionArray = ((Woodwind) woodwindQuestion).getMusicianInfoArray();
                System.out.println("The string players who want to play a brass instrument are: \n");
                for(String info: woodwindQuestionArray)
                    System.out.println(info);
                woodwindQuestionArray.clear();//clears array so it does not continuously add
            }

            //this question uses inheritance
            if(chosenNumber == 3){
                ArrayList<String> violinQuestionArray = new ArrayList();
                String nam = "violin";
                String act = "bow";
                String ran = "G3 - A7";
                String str = "catgut";
                TCOInstrument violinAnswer = new Strings(nam, act, ran, str);
                System.out.println(violinAnswer.toString());
                System.out.println("\nThis instrument is played by: " + "\n");
                violinQuestionArray = ((Strings) violinPlayerNames).returnViolinPlayers();
                for(String info: violinQuestionArray)
                    System.out.println(info);
                violinQuestionArray.clear();//clears array as before
            }

            if(chosenNumber == 4){
                System.out.println("The number timpani players is: " +
                        ((Percussion) percussionQuestion).timpaniAmount() + "\n");
                ((Percussion) percussionQuestion).initCount(0);
                System.out.println("Their favorite card games include: \n");
                ArrayList<String> cardGames = new ArrayList();
                cardGames = ((Percussion) percussionQuestion).returnCardGames();
                for(String info: cardGames)
                    System.out.println(info);
                cardGames.clear();
            }

        }

        System.out.println("\nYou have chosen to exit. Bye!");
    }
}
