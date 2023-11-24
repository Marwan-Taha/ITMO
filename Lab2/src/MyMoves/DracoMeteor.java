package MyMoves;


import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove {

    public DracoMeteor(double power, double accuracy){
        super(Type.DRAGON, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon p){

        super.applySelfEffects(p);

        Effect effect = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(effect);
    }


    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1] ;
    }

}
