package MyPokemons;

import MyMoves.DracoMeteor;
import MyMoves.Rest;
import MyMoves.DoubleTeam;
import MyMoves.RockTomb;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Arceus extends Pokemon{

    public Arceus(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);

        super.setStats(120,120,120,120,120,120);


        super.setMove(
                new DracoMeteor(130,90),
                new Rest(0,100),
                new DoubleTeam(0,100),
                new RockTomb(   60, 95)
        );
    }

}
