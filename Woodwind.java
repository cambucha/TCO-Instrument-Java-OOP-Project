import java.util.ArrayList;

public class Woodwind extends TCOInstrument {

    //data members for reed and mouthpiece
    private String reed;
    private String mouthPiece;

    //to be used for array processing
    String toSplit;
    String[] split;
    ArrayList<String> musicianInfoArray = new ArrayList();//array list to store strings of musician info
    String toAdd = ""; //this is to add string info to an array list

    //default constructor
    public Woodwind(){
    }

    //invokes superclass constructor
    public Woodwind(String nam, String act, String ran, String ree, String mou){
        super(nam,act,ran);
        reed = ree;
        mouthPiece = mou;
    }

    //constructor to receive string of musician info
    public Woodwind(String musicianCollect){
        toSplit = musicianCollect;
    }

    public ArrayList<String> getMusicianInfoArray(){
        split = toSplit.split(",");

        for(int i = 0; i < split.length; i++){
            if((split[i].equals(" violin") ||
                  split[i].equals(" viola") ||
                  split[i].equals(" cello") ||
                  split[i].equals(" bass"))
                  &&
                  (split[i+4].equals("horn") ||
                   split[i+4].equals("trumpet") ||
                   split[i+4].equals("cornet") ||
                   split[i+4].equals("bugle") ||
                   split[i+4].equals("trombone") ||
                   split[i+4].equals("bass trombone") ||
                   split[i+4].equals("tuba"))){

                toAdd = "";//initializes toAdd
                toAdd += split[i-1];//first name
                toAdd += " ";//space for readability
                toAdd += split[i-2];//last name
                toAdd += "\n";//readability

                musicianInfoArray.add(toAdd);
	        }
        }
        return musicianInfoArray;
    }


    //toString including the data members reed and mouthPiece
    public String toString() {
        return  "\nInstrument Name: " + instrumentName + "\nActuator: " + actuator + "\nRange: " + range
                + "Reed: " + reed + "Mouthpiece: " + mouthPiece;
    }


}
