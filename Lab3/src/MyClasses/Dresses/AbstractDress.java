package MyClasses.Dresses;

import MyClasses.Characters.Character;
import MyEnums.Colors;
import MyEnums.DressState;
import MyEnums.MaterialType;
import MyInterfaces.*;

import java.util.ArrayList;
import java.util.Objects;


abstract public class AbstractDress implements Dress{
    private final Colors DressColor;

    private DressState dressState;

    private final Material DressMaterial;

    private Decorations DressDecorations;

    private Character character;

    private boolean worn = false;





    public AbstractDress(Colors color, Material material){
        this.DressColor = color;
        this.DressMaterial = material;

    }
    public AbstractDress(Colors color, Material material, Decorations decorations){
        this.DressColor = color;
        this.DressMaterial = material;
        this.DressDecorations = decorations;
    }



    public void setDressState(DressState state){
        this.dressState = state;
    }

    public DressState getDressState(){
        return this.dressState;
    }


    @Override
    public String toString(){
        return "This is the dress with the color" + DressColor + ", and has the material "+ DressMaterial.getMaterialDescription()+ ", and the decoration " + DressDecorations.getDecorationInfo();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }
        Dress dress = (Dress)obj;
        return(dress.getDressColor() == this.getDressColor() && dress.getDressMaterial() == this.getDressMaterial() && dress.getDressDecorations() == this.getDressDecorations());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.DressColor, this.DressMaterial, this.DressDecorations);
    }


    public boolean isWorn(){
        return worn;
    }

    public Colors getDressColor(){
        return DressColor;
    }

    public Material getDressMaterial(){
        return DressMaterial;
    }


    public Decorations getDressDecorations(){
        return DressDecorations;
    }

    public void setCharactertoDress(Character character){
        this.character = character;
        worn = true;
    }

    public Character getCharactertoDress(){
        return this.character;
    }











}
