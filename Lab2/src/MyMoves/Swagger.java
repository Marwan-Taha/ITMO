package MyMoves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(double power, double accuracy){
        super(Type.NORMAL ,power ,accuracy);
    }


    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.confuse(p);
    }


    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect effect = new Effect().stat(Stat.ATTACK, 2);

        p.addEffect(effect);
    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "is doing " + pieces[pieces.length - 1];
    }

}
