import java.util.ArrayList;

public class Brass extends TCOInstrument {

    //for processing array
    String toSplit;
    String[] split;
    int count = 0;

    ArrayList<String> musicianInfoArray = new ArrayList();//array list to store strings of musician info
    String toAdd = ""; //this is to add string info to an array list

    //data member for mouthpiece
    private String mouthPiece;

    //default constructor
    public Brass(){
    }

    //invokes superclass constructor
    public Brass(String nam, String act, String ran, String mou){
        super(nam, act, ran);
        mouthPiece = mou;
    }

    //receives string array from musician
    public Brass(String musicianCollect){
        toSplit = musicianCollect;
    }

    //initialize count after use
    public void initCount(int init){
        count = init;
    }

    //processes string into arraylist based on desired info from question (Number of brass players who like spicy food)
    public int returnBrassNumber(){
        split = toSplit.split(","); //splits string into array based on comma
        for(int i = 0; i < split.length; i++){
            if(split[i].equals("Yes") && (split[i-3].equals(" horn") |
                    split[i-3].equals(" trumpet") |
                    split[i-3].equals(" cornet") |
                    split[i-3].equals(" bugle") |
                    split[i-3].equals(" trombone") |
                    split[i-3].equals(" bass trombone") |
                    split[i-3].equals(" tuba"))){
                 count++;
            }
        }
        return count;
    }


    //toString including the data member mouthPiece
    public String toString() {
        return  "\nInstrument Name: " + instrumentName + "\nActuator: " + actuator + "\nRange: " + range
                + "Mouthpiece: " + mouthPiece;
    }


}
