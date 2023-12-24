package MyMoves;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {

    public DreamEater(double power, double accuracy){
        super(Type.PSYCHIC ,power, accuracy);
    }

    @Override
    protected void applyOppDamage(Pokemon p , double damage){
        super.applyOppDamage(p, damage);
        if (p.getCondition() == Status.SLEEP){
            super.applyOppDamage(p, damage);
        }
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        double amountToRecoverBack =  (p.getStat(Stat.HP) - p.getHP()) / 2;

        p.setMod(Stat.HP, (int)amountToRecoverBack);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }

}
