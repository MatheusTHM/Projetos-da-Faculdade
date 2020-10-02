package pokesimulator;

public class Batalha {
    private String tipoPokemon1;
    private int ataquePokemon1;
    private int defesaPokemon1;
    private int vidaPokemon1;
    private double dprPokemon1; //dpr = Dano Por Round
    private double rvPokemon1; //rv = Rounds Vivo
    
    private String tipoPokemon2;
    private int ataquePokemon2;
    private int defesaPokemon2;
    private int vidaPokemon2;
    private double dprPokemon2;
    private double rvPokemon2;
    
    /*
    Construtor da classe
    
    O resultado de uma batalha depende do tipo dos dois pokemons, da vida de cada um, do ataque e da defesa.
    Tipo - Pode causar mais dano ao pokemon inimigo
    Vida - Representa quantos rounds ele fica vivo
    Ataque - Dano causado por round
    Defesa - Dano mitigado por ataque
    
    Então uma batalha vai pegar o tipo dos pokemons, aquele que tiver vantagem vai receber um bônus de 30% nos ataques ou uma penalidade de 10%, depois 
    o ataque do pokemon - 25% da defesa, resultando na quantidade de dano que ele pode causar por vez, e dividir a vida pelo resultado de dano por round
    aquele que sobreviver mais rounds ganha
    */
    public Batalha(String tipoPokemon1, int ataquePokemon1, int defesaPokemon1, int vidaPokemon1, String tipoPokemon2, int ataquePokemon2, int defesaPokemon2, int vidaPokemon2){
        this.tipoPokemon1 = tipoPokemon1;
        this.ataquePokemon1 = ataquePokemon1;
        this.defesaPokemon1 = defesaPokemon1;
        this.vidaPokemon1 = vidaPokemon1;
        
        this.tipoPokemon2 = tipoPokemon2;
        this.ataquePokemon2 = ataquePokemon2;
        this.defesaPokemon2 = defesaPokemon2;
        this.vidaPokemon2 = vidaPokemon2;
        
        calculaVantagemAtaque();
        defineVencedor();
    }
    
    private void defineVencedor(){
        dprPokemon1 = ataquePokemon1 - (defesaPokemon2 * 0.25);
        dprPokemon2 = ataquePokemon2 - (defesaPokemon1 * 0.25);
        rvPokemon1 = vidaPokemon1 / dprPokemon2;
        rvPokemon2 = vidaPokemon2 / dprPokemon1;
        
        if(rvPokemon1 > rvPokemon2){
            System.out.println("Seu pokemon venceu!");
        }else{
            System.out.println("O pokemon inimigo venceu!");
        }
    }
    //Vantagens: Terra -> Água -> Fogo -> Ar -> Terra | Vantagens dão 30% a mais de dano, e desvantagens dão 10% a menos de dano | Pokemons do mesmo tipo, ou que não possuem vantagens e desvantagens são neutros
    private void calculaVantagemAtaque(){
        switch(tipoPokemon1){
            case "Fogo":
                if(tipoPokemon2.equals("Ar")){
                    ataquePokemon1 += (ataquePokemon1 * 0.30);    //Adicionando a vantagem ao pokemon1
                    ataquePokemon2 -= (ataquePokemon2 * 0.10);    //Adicionando a desvantagem ao pokemon2
                }else if(tipoPokemon2.equals("Água")){
                    ataquePokemon1 -= (ataquePokemon1 * 0.10);
                    ataquePokemon2 += (ataquePokemon2 * 0.30);
                }
                break;
            case "Água":
                if(tipoPokemon2.equals("Fogo")){
                    ataquePokemon1 += (ataquePokemon1 * 0.30);
                    ataquePokemon2 -= (ataquePokemon2 * 0.10);
                }else if(tipoPokemon2.equals("Terra")){
                    ataquePokemon1 -= (ataquePokemon1 * 0.10);
                    ataquePokemon2 += (ataquePokemon2 * 0.30);
                }
                break;
            case "Terra":
                if(tipoPokemon2.equals("Água")){
                    ataquePokemon1 += (ataquePokemon1 * 0.30);
                    ataquePokemon2 -= (ataquePokemon2 * 0.10);
                }else if(tipoPokemon2.equals("Ar")){
                    ataquePokemon1 -= (ataquePokemon1 * 0.10);
                    ataquePokemon2 += (ataquePokemon2 * 0.30);
                }
                break;
            case "Ar":
                if(tipoPokemon2.equals("Terra")){
                    ataquePokemon1 += (ataquePokemon1 * 0.30);
                    ataquePokemon2 -= (ataquePokemon2 * 0.10);
                }else if(tipoPokemon2.equals("Fogo")){
                    ataquePokemon1 -= (ataquePokemon1 * 0.10);
                    ataquePokemon2 += (ataquePokemon2 * 0.30);
                }
                break;
        }
    }
}
