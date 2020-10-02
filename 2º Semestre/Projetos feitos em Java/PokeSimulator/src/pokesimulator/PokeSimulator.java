package pokesimulator;

public class PokeSimulator {

    public static void main(String[] args) {
        //Instanciar um novo objetos
        Pokemon meuPokemon = new Pokemon("Agumon", "Fogo", 17);
        meuPokemon.imprimePokemon();
        
        
        Pokemon inimigoPokemon = new Pokemon("Digimon", "Terra", 37);
        inimigoPokemon.imprimePokemon();
        
        Batalha batalha = new Batalha(meuPokemon.getTipo(), meuPokemon.getAtaque(), meuPokemon.getDefesa(), meuPokemon.getVida(), inimigoPokemon.getTipo(), inimigoPokemon.getAtaque(), inimigoPokemon.getDefesa(), inimigoPokemon.getVida());
    }
    
}
