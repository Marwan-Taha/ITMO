package MyClasses.Characters;

import MyClasses.ExtraObjects.Curls;
import MyEnums.CharacterState;
import MyEnums.Location;
import MyInterfaces.*;

import java.util.Objects;

abstract public class AbstractCharacter{
    final private String Name;
    private Dress dress;

    private CharacterState characterState;


    private Location location;

    public AbstractCharacter(String name){
        this.Name = name;
    }

    public AbstractCharacter(String name, Dress dress){
        this.Name = name;
        this.dress = dress;
    }


    public Location getCharacterLocation(){
        return this.location;
    }

    public void setCharacterLocation(Location location){
        this.location = location;
    }
    public Dress getDress(){
        return dress;
    }

    public CharacterState getCharacterState(){
        return characterState;
    }
    public void setCharacterState(CharacterState state){
        this.characterState = state;
    }


    public String getName(){
        return Name;
    }











    @Override
    public String toString(){
        return "This character is " + this.getName() + " and it has " + this.getDress().toString();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }

        Character1 character = (Character1) obj;
        return (character.getName().equals(this.getName()) && character.getDress().equals(this.getDress())) ;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getDress());
    }


}
