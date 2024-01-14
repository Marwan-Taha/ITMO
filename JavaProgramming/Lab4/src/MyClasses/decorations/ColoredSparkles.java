package MyClasses.decorations;


import MyInterfaces.FlckerAble;
import MyInterfaces.WinkAble;

public class ColoredSparkles extends Decoration implements WinkAble , FlckerAble {

    public ColoredSparkles(){
        super("ColoredSparkles");
    }

    @Override
    public void flicker(){
        System.out.println("Повсюду мерцали разноцветные блестки, ");

    }

    @Override
    public void wink() {
        System.out.println("перемигиваясь короткими вспышками, словно огни маяка.");
    }
}
