public class Keyboards extends TCOInstrument {

    //data member for keyboard strings
    private String keyboardStrings;

    //default constructor
    public Keyboards(){
    }

    //invokes superclass constructor
    public Keyboards(String nam, String act, String ran, String key){
        super(nam, act, ran);
        keyboardStrings = key;
    }


    //toString including the data member keyboardStrings
    public String toString() {
        return  "\nInstrument Name: " + instrumentName + "\nActuator: " + actuator + "\nRange: " + range
                + "Strings: " + keyboardStrings;
    }


}
