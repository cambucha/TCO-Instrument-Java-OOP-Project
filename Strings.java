import java.util.ArrayList;

public class Strings extends TCOInstrument {

    //for processing array
    String toSplit;
    String[] split;

    ArrayList<String> musicianInfoArray = new ArrayList();//array list to store strings of musician info
    String toAdd = ""; //this is to add string info to an array list

    //data member for string type
    private String strings;

    //default constructor
    public Strings(){
    }

    //invokes superclass constructor
    public Strings(String nam, String act, String ran, String str){
        super(nam,act,ran);
        strings = str;
    }

    //constructor to receive string of musician info
    public Strings(String musicianCollect){
        toSplit = musicianCollect;
    }


    //toString including the data member strings
    public String toString() {
        return "\nThe " + instrumentName + " is a string instrument that is played with a " + actuator + ", and it has a range of " + range
                + ". Also, its strings are made of " + strings + ".";
    }

    //return names of violin players' names
    public ArrayList<String> returnViolinPlayers(){
        split = toSplit.split(",");
        for(int i = 0; i < split.length; i++){
            if(split[i].equals(" violin")){ //no need to specify more logic. played instruments have a space before them.
                 toAdd = "";                                //wants to play instruments do not have this space
                 toAdd += split[i-1];
                 toAdd += " ";
                 toAdd += split[i-2];
                 toAdd += "\n";

                 musicianInfoArray.add(toAdd);
            }
        }
        return musicianInfoArray;
    }

}
