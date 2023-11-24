    package MyMoves;


    import ru.ifmo.se.pokemon.*;

    public class Rest extends StatusMove {

        public Rest(double power, double accuracy){
            super(Type.PSYCHIC, power, accuracy);
        }

        @Override
        protected void applySelfEffects(Pokemon p) {

            super.applySelfEffects(p);

            Effect effect = new Effect().turns(2).condition(Status.SLEEP);
            p.restore();
            p.addEffect(effect);

        }

        @Override
        protected boolean checkAccuracy(Pokemon pAttacking, Pokemon pDefensive){
            return true;
        }

        @Override
        protected String describe(){
            String[] pieces = this.getClass().toString().split("\\.");
            return "does " + pieces[pieces.length-1] + " and restored";
        }

    }
