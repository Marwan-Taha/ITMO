package MyPokemons;


import MyMoves.FocusBlast;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lickilicky extends Lickitung {

    public Lickilicky(String name, int level){

        super(name, level);

        super.setType(Type.NORMAL);

        super.setStats(110, 85, 95, 80, 95, 50);

        super.setMove(

                new FocusBlast(120, 70)
        );


    }
}
