package MyClasses.Dresses;

import MyEnums.Colors;
import MyEnums.MaterialType;
import MyInterfaces.Decorations;
import MyInterfaces.Dress;
import MyInterfaces.InteractAble;
import MyInterfaces.Material;

import java.util.ArrayList;
import java.util.Objects;

abstract public class AbstractDress implements InteractAble, Dress{
    private final Colors DressColor;

    private final Material DressMaterial;

    private Decorations DressDecorations;



    boolean hanging;


    public AbstractDress(Colors color, Material material){
        this.DressColor = color;
        this.DressMaterial = material;
        hanging = true;
    }
    public AbstractDress(Colors color, Material material, Decorations decorations){
        this.DressColor = color;
        this.DressMaterial = material;
        this.DressDecorations = decorations;
        hanging = true;
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


    public Colors getDressColor(){
        return DressColor;
    }

    public Material getDressMaterial(){
        return DressMaterial;
    }


    public Decorations getDressDecorations(){
        return DressDecorations;
    }

    public String getMaterialDescription(){
        return this.getDressMaterial().getMaterialDescription();
    }


    public MaterialType getMaterialType(){
        return this.DressMaterial.getMaterialType();
    }


    public String getDecorationInfo(){
        return this.getDressDecorations().getDecorationInfo();
    }


    public boolean isHanging() {
        return hanging;
    }


}
