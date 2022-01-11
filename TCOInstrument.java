public class TCOInstrument {

    //common data members
    protected String instrumentName, actuator, range;

    //default constructor
    TCOInstrument(){
    }

    //constructor
    TCOInstrument(String nam, String act, String ran){

        instrumentName = nam;
        actuator = act;
        range = ran;

    }


    public String toString() {

        return  "\nInstrument Name: " + instrumentName + "\nActuator: " + actuator + "\nRange: " + range;

    }


}
