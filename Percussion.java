import java.util.ArrayList;

public class Percussion extends TCOInstrument {

    String toSplit;
    String[] split;
    int count = 0;

    ArrayList<String> musicianInfoArray = new ArrayList();//array list to store strings of musician info
    String toAdd = ""; //this is to add string info to an array list

    //data member for percussion string
    private String percussionString;

    //default constructor
    public Percussion(){
    }

    //invokes superclass
    public Percussion(String nam, String act, String ran, String per){
        super(nam, act, ran);
        percussionString = per;
    }

    //constructor to receive string of musician info
    public Percussion(String musicianCollect){
        toSplit = musicianCollect;
    }

    //initialize count after use
    public void initCount(int init){
        count = init;
    }

    //toString including the data member percussionString
    public String toString() {
        return  "\nInstrument Name: " + instrumentName + "\nActuator: " + actuator + "\nRange: " + range
                + "Strings: " + percussionString;
    }

    //counts number of timpani players
    public int timpaniAmount(){
        split = toSplit.split(",");
        for(int i = 0; i < split.length; i++){
            if(split[i].equals(" timpani"))
                count++;
        }
        return count;
    }

    //returns arraylist of favorite card games
    public ArrayList<String> returnCardGames(){
        split = toSplit.split(",");
        for(int i = 0; i < split.length; i++){
            if(split[i].equals(" timpani")){
                toAdd = "";
                toAdd += split[i+1];
                toAdd += "\n";

                musicianInfoArray.add(toAdd);
            }
        }
        return musicianInfoArray;
    }

}
