package MyMoves;

import ru.ifmo.se.pokemon.*;

public class SampleMove extends PhysicalMove {

    public SampleMove(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect effect = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(effect);

    }
    protected void applySelfEffects(Pokemon p){

        super.applySelfEffects(p);

        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(effect);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
