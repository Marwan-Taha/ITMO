package MyClasses.ExtraObjects;

import MyEnums.Smells;

public class Powder {
    Smells smell;
    public Powder(){

    }

    public void setPowderSmell(Smells smell){
        this.smell = smell;
    }

    public Smells getPowderSmell(){
        return this.smell;
    }
}
