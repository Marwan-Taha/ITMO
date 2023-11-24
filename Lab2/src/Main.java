import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;
import MyPokemons.*;



public class Main {

    // https://pokemondb.net/pokedex/arceus
    // https://pokemondb.net/pokedex/lickitung
    // https://pokemondb.net/pokedex/lickilicky
    // https://pokemondb.net/pokedex/igglybuff
    // https://pokemondb.net/pokedex/jigglypuff
    // https://pokemondb.net/pokedex/wigglytuff

    public static void main(String[] args){
        Battle b = new Battle();
        Arceus arceus = new Arceus("ARCEUS", 1);
        Lickitung lickitung = new Lickitung("LICKITUNG", 1);
        Lickilicky lickilicky = new Lickilicky("LICKILICKY", 1);

        Igglybuff igglybuff = new Igglybuff("IGGLYBUFF", 1);
        Jigglypuff jigglypuff = new Jigglypuff("JIGGLYPUFF", 1);
        Wigglytuff wigglytuff = new Wigglytuff("WIGGLYTUFF", 1);

        b.addAlly(arceus);
        b.addAlly(lickitung);
        b.addAlly(lickilicky);

        b.addFoe(igglybuff);
        b.addFoe(jigglypuff);
        b.addFoe(wigglytuff);

        b.go();
    }
}