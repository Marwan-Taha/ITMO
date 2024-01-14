package MyClasses.ExtraObjects;

import MyEnums.WardrobeState;
import MyInterfaces.CloseAble;
import MyInterfaces.OpenAble;

public class Wardrobe implements OpenAble, CloseAble {
    private WardrobeState wardrobeState;



    public void setWardrobeState(WardrobeState wardrobeState){
        this.wardrobeState = wardrobeState;
    }

    public WardrobeState getWardrobeState(){
        return this.wardrobeState;
    }


    @Override
    public void close() {
        this.setWardrobeState(WardrobeState.CLOSED);
        System.out.println("Wardrobe is closed");
    }

    @Override
    public void open() {
        this.setWardrobeState(WardrobeState.OPENED);
    }
}
