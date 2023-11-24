package MyPokemons;


import MyMoves.DisarmingVoice;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jigglypuff extends Igglybuff {

    public Jigglypuff(String name, int level){

        super(name, level);

        super.setType(Type.NORMAL, Type.FAIRY);

        super.setStats(115, 45, 20, 45, 25, 20);

        super.setMove(
            new DisarmingVoice(40, 100)
        );

    }

}
