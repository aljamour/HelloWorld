package Uge7.ArrayList.øvelser.Pokemon;

public class Main {
    public static void main(String[] args) {

        Pokemon p1 = new Pokemon("Charmander", "Fire", 21);
        Pokemon p2 = new Pokemon("Dragonite", "Air", 30);
        Pokemon p3 = new Pokemon("Jigglypuff", "Fairy", 15);
        Pokemon p4 = new Pokemon("Bulbasaur", "Grass", 18);

        Pokedex pokedex = new Pokedex();

        pokedex.addPokemon(p1);
        pokedex.addPokemon(p2);

        pokedex.showAllPokemon();
        System.out.println(" ");

        pokedex.addPokemon(p3);
        pokedex.addPokemon(p4);

        pokedex.showAllPokemon();

        pokedex.removePokemon("Charmander");

        System.out.println(" ");
        pokedex.showAllPokemon();
    }
}
