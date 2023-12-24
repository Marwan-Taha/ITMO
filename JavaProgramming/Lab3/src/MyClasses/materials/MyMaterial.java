package MyClasses.materials;

import MyEnums.MaterialType;
import MyInterfaces.Material;

import java.util.Objects;

abstract public class MyMaterial implements Material {

    private final String description;
    private final MaterialType materialType;

    public MyMaterial(String materialDescription, MaterialType type){
        this.description = materialDescription;
        this.materialType = type;
    }

    public String getMaterialDescription(){
        return this.description;
    }

    public MaterialType getMaterialType(){
        return this.materialType;
    }

    @Override
    public String toString(){
        return "This material is " + this.description + " and it has " + this.materialType + " type";
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }

        Material material = (Material) obj;
        return (material.getMaterialDescription() == this.getMaterialDescription() && material.getMaterialType() == this.getMaterialType());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getMaterialDescription(), this.getMaterialType());
    }

}
