package MyPokemons;

import MyMoves.DreamEater;
import MyMoves.Swagger;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Igglybuff extends Pokemon {

    public Igglybuff(String name, int level){

        super(name ,level);

        super.setType(Type.NORMAL, Type.FAIRY);

        super.setStats(90, 30,15, 40, 20, 15);

        super.setMove(
                new DreamEater(100,100),
                new Swagger(0, 85)
        );

    }


}
