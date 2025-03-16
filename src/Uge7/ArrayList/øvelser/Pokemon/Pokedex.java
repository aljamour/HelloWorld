package Uge7.ArrayList.øvelser.Pokemon;

import java.util.ArrayList;

public class Pokedex {
    private ArrayList<Pokemon> pokedex;

    public Pokedex() {
    pokedex = new ArrayList<>();
    }

    public void addPokemon(Pokemon p) {
        pokedex.add(p);
    }

    public void removePokemon(String name) {
        for (int i = pokedex.size() - 1; i >= 0; i--) {
            if (pokedex.get(i).getName().equals(name)) {
                pokedex.remove(i);
            }
        }
    }

    public void showAllPokemon() {
        for (Pokemon pokemon : pokedex) {
            System.out.println("Name: '" + pokemon.getName() + "', Type: '" + pokemon.getType() + "', Level: " + pokemon.getLevel());
        }
    }

}
