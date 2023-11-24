package MyPokemons;

import MyMoves.Swagger;
import MyMoves.DreamEater;
import MyMoves.DisarmingVoice;
import MyMoves.ChargeBeam;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wigglytuff extends Jigglypuff {

    public Wigglytuff(String name, int level){

        super(name,level);

        super.setType(Type.NORMAL, Type.FAIRY);

        super.setStats(140, 70, 45, 85, 50,45);

        super.setMove(
                new ChargeBeam(50 , 90)
        );

    }


}
