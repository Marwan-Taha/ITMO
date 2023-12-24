package MyMoves;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove {

    public ChargeBeam(double power, double accuracy){
        super(Type.ELECTRIC, power, accuracy);
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect effect = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(effect);

    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "is doing " + pieces[pieces.length - 1];
    }

}