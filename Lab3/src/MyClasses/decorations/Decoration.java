package MyClasses.decorations;

import MyInterfaces.Decorations;

import java.util.Objects;

abstract public class Decoration implements Decorations {
    private String DecorationName;

    public Decoration(String decorationName){
        this.DecorationName = decorationName;
    }

    @Override
    public String getDecorationInfo() {
        return DecorationName;
    }

    @Override
    public String toString(){
        return "This is decoration " + this.DecorationName;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (this.getClass() != obj.getClass() || obj == null){
            return false;
        }

        Decorations decorations = (Decorations) obj;
        return (decorations.getDecorationInfo() == this.getDecorationInfo());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getDecorationInfo());
    }

}
