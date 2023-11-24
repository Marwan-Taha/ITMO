package MyMoves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {

    public RockTomb(double power, double accuracy) {
        super(Type.ROCK, power, accuracy);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        Effect effect = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(effect);

    }



    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1] + " Damage to target and lowering it's speed by one stage";

    }
}
