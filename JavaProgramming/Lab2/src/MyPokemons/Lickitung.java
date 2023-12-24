package MyPokemons;

import MyMoves.Rest;
import MyMoves.PowerWhip;
import MyMoves.DreamEater;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lickitung extends Pokemon {

    public Lickitung(String name, int level){

        super(name, level);

        super.setType(Type.NORMAL);

        super.setStats(90,55,75,60,75,30);

        super.setMove(
                new Rest(0,100),
                new PowerWhip(120,85),
                new DreamEater(100, 100)
        );
    }

}
