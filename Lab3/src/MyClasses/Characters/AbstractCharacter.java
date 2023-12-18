package MyClasses.Characters;

import MyClasses.Dresses.AbstractDress;
import MyInterfaces.*;

import java.util.Objects;

abstract public class AbstractCharacter implements ICharacter{
    private String Name;
    private Dress dress;



    public AbstractCharacter(){

    }
    public AbstractCharacter(String name){
        this.Name = name;
    }

    public AbstractCharacter(String name, Dress dress){
        this.Name = name;
        this.dress = dress;
    }

    public void assignName(String name){
        this.Name = name;
    }

    public void assignDress(Dress dress){
        this.dress = dress;
    }

    public Dress getDress(){
        return dress;
    }



    @Override
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

        Character character = (Character) obj;
        return (character.getName() == this.getName() && character.getDress() == this.getDress());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getName(), this.getDress());
    }



}
