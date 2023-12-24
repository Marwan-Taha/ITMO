package MyMoves;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {

    public FocusBlast(double power, double accuracy){

        super(Type.FIGHTING, power, accuracy);

    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);

        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "is doing " + pieces[pieces.length - 1];
    }

}
