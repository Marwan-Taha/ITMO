package MyMoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class PowerWhip extends PhysicalMove {
    public PowerWhip(double power, double accuracy){
        super(Type.GRASS, power, accuracy);
    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
