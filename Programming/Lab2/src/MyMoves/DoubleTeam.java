package MyMoves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {

    public DoubleTeam(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }

    protected void applySelfEffects(Pokemon p){

        super.applySelfEffects(p);

        Effect effect = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(effect);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return super.checkAccuracy(pokemon, pokemon1);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1] + " Now Evasiveness is raised by one stage";
    }

}
