package MyMoves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DisarmingVoice extends SpecialMove {

    public DisarmingVoice(double power, double accuracy){
        super(Type.FAIRY,power,accuracy);
    }


    @Override
    protected boolean checkAccuracy(Pokemon pAttacking, Pokemon pDefending){
        return true;
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "is doing " +pieces[pieces.length - 1] ;
    }

}
